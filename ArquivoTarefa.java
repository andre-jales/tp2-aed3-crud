import aed3.*;
import java.util.ArrayList;

public class ArquivoTarefa extends aed3.Arquivo<Tarefa> {

    private ArvoreBMais<ParCategoriaId> indiceIndiretoCategoria;

    public ArquivoTarefa() throws Exception {
        super("tarefas", Tarefa.class.getConstructor());
        indiceIndiretoCategoria = new ArvoreBMais<>(
            ParCategoriaId.class.getConstructor(),
            4,
            ".\\dados\\indiceCategoria.db"
        );
    }

    @Override
    public int create(Tarefa t) throws Exception {
        int id = super.create(t);
        indiceIndiretoCategoria.create(new ParCategoriaId(id, t.getIdCategoria()));
        return id;
    }

    public ArrayList<Tarefa> readByCategoria(int categoriaId) throws Exception {
        ArrayList<ParCategoriaId> pciList = indiceIndiretoCategoria.read(new ParCategoriaId(-1, categoriaId));
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        if (pciList.isEmpty()) {
            return tarefas;
        }

        for (ParCategoriaId pci : pciList) {
            Tarefa tarefa = read(pci.getId());
            if (tarefa != null) {
                tarefas.add(tarefa);
            }
        }

        return tarefas;
    }

    public boolean delete(int tarefaId) throws Exception {
        Tarefa tarefa = read(tarefaId);
        if (tarefa == null) {
            return false; 
        }
    
        boolean removed = super.delete(tarefaId);
        if (removed) {
            indiceIndiretoCategoria.delete(new ParCategoriaId(tarefa.getIdCategoria(), tarefaId));
        }
    
        return removed;
    }

    @Override
    public boolean update(Tarefa novaTarefa) throws Exception {
        Tarefa tarefaAntiga = read(novaTarefa.getId());
        if (super.update(novaTarefa)) {
            if (tarefaAntiga != null && novaTarefa.getIdCategoria() != tarefaAntiga.getIdCategoria()) {
                indiceIndiretoCategoria.delete(new ParCategoriaId(tarefaAntiga.getIdCategoria(), tarefaAntiga.getId()));
                indiceIndiretoCategoria.create(new ParCategoriaId(novaTarefa.getIdCategoria(), novaTarefa.getId()));
            }
            return true;
        }
        return false;
    }

    public ArrayList<Tarefa> readAll() throws Exception {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        for (ParCategoriaId pci : indiceIndiretoCategoria.read(null)) {
            Tarefa tarefa = super.read(pci.getId());
            if (tarefa != null) {
                tarefas.add(tarefa);
            }
        }
        return tarefas;
    }
}
