## Participantes do Grupo

- André Leôncio Jales
- Andre Vieira Penchel
- Gustavo Alvarenga Ribeiro Carvalho
- Gustavo Pereira Felix

### Descrição do Trabalho

Nosso trabalho consiste na implementação de um sistema de gerenciamento de tarefas e categorias utilizando estruturas de dados avançadas como Hash Extensível e Árvores B+. O sistema permite a criação, leitura, atualização e exclusão (CRUD) de tarefas e categorias, além de manter índices diretos e indiretos para otimizar as operações de busca e manipulação de dados.

### Classes e Métodos

#### `Main.java`

* **main(String args)** : Método principal que inicializa o sistema, cria tarefas de exemplo, realiza operações CRUD e exibe resultados.

#### `Tarefa.java`

* **Tarefa()** : Construtor padrão.
* **Tarefa(int idCategoria, String nome, LocalDate criacao, short status, short prioridade)** : Construtor com parâmetros.
* **Tarefa(int id, int idCategoria, String nome, LocalDate criacao, LocalDate conclusao, short status, short prioridade)** : Construtor completo.
* **Getters e Setters** : Métodos para acessar e modificar os atributos da classe.
* **toByteArray()** : Serializa o objeto em um array de bytes.
* **fromByteArray(byte b)** : Desserializa um array de bytes em um objeto Tarefa.
* **toString()** : Retorna uma representação em string do objeto.

#### `Categoria.java`

* **Categoria()** : Construtor padrão.
* **Categoria(String n)** : Construtor com nome.
* **Categoria(int i, String n)** : Construtor completo.
* **Getters e Setters** : Métodos para acessar e modificar os atributos da classe.
* **toByteArray()** : Serializa o objeto em um array de bytes.
* **fromByteArray(byte b)** : Desserializa um array de bytes em um objeto Categoria.
* **toString()** : Retorna uma representação em string do objeto.

#### `ParNomeId.java`

* **ParNomeId()** : Construtor padrão.
* **ParNomeId(String n)** : Construtor com nome.
* **ParNomeId(String n, int i)** : Construtor completo.
* **Getters** : Métodos para acessar os atributos.
* **clone()** : Clona o objeto.
* **size()** : Retorna o tamanho do objeto.
* **compareTo(ParNomeId a)** : Compara dois objetos.
* **toByteArray()** : Serializa o objeto em um array de bytes.
* **fromByteArray(byte ba)** : Desserializa um array de bytes em um objeto ParNomeId.
* **transforma(String str)** : Normaliza uma string.

#### `ParCategoriaId.java`

* **ParCategoriaId()** : Construtor padrão.
* **ParCategoriaId(int id)** : Construtor com ID.
* **ParCategoriaId(int id, int idCategoria)** : Construtor completo.
* **Getters** : Métodos para acessar os atributos.
* **clone()** : Clona o objeto.
* **size()** : Retorna o tamanho do objeto.
* **compareTo(ParCategoriaId a)** : Compara dois objetos.
* **toByteArray()** : Serializa o objeto em um array de bytes.
* **fromByteArray(byte ba)** : Desserializa um array de bytes em um objeto ParCategoriaId.

#### `ParIDEndereco.java`

* **ParIDEndereco()** : Construtor padrão.
* **ParIDEndereco(int id, long end)** : Construtor completo.
* **Getters** : Métodos para acessar os atributos.
* **hashCode()** : Retorna o código hash do objeto.
* **size()** : Retorna o tamanho do objeto.
* **toString()** : Retorna uma representação em string do objeto.
* **toByteArray()** : Serializa o objeto em um array de bytes.
* **fromByteArray(byte ba)** : Desserializa um array de bytes em um objeto ParIDEndereco.

#### `VisaoTarefas.java`

* **leTarefa(int idCategoria)** : Lê os dados de uma tarefa a partir da entrada do usuário.
* **leIdTarefa()** : Lê o ID de uma tarefa a partir da entrada do usuário.
* **leIdCategoria()** : Lê o ID de uma categoria a partir da entrada do usuário.
* **mostraTarefa(Tarefa tarefa)** : Exibe os dados de uma tarefa.
* **menu()** : Exibe o menu de opções para tarefas.
* **mostrarCategorias(ArrayList `<Categoria>` categorias)** : Exibe a lista de categorias disponíveis.
* **selecionaCategoria(int totalCategorias)** : Seleciona uma categoria a partir da entrada do usuário.

#### `VisaoCategorias.java`

* **leNomeCategoria()** : Lê o nome de uma categoria a partir da entrada do usuário.
* **mostraCategoria(Categoria categoria)** : Exibe os dados de uma categoria.
* **menu()** : Exibe o menu de opções para categorias.

#### `MenuTarefas.java`

* **MenuTarefas()** : Construtor que inicializa o arquivo de categorias.
* **menu()** : Exibe o menu de opções para tarefas.
* **incluirCategoria()** : Inclui uma nova categoria.
* **buscarCategoria()** : Busca uma categoria pelo nome.
* **alterarCategoria()** : Altera uma categoria existente.
* **excluirCategoria()** : Exclui uma categoria.

#### `ControleTarefas.java`

* **ControleTarefas()** : Construtor que inicializa os arquivos de tarefas e categorias e a visão de tarefas.
* **iniciar()** : Inicia o controle de tarefas, exibindo o menu e executando as operações selecionadas.
* **incluirTarefa()** : Inclui uma nova tarefa.
* **buscarTarefa()** : Busca uma tarefa pelo ID.
* **alterarTarefa()** : Altera uma tarefa existente.
* **excluirTarefa()** : Exclui uma tarefa pelo ID.
* **listarTarefas()** : Lista todas as tarefas.
* **listarTarefasPorCategoria()** : Lista as tarefas por categoria.

#### `ControleCategorias.java`

* **ControleCategorias()** : Construtor que inicializa os arquivos de categorias e tarefas e a visão de categorias.
* **iniciar()** : Inicia o controle de categorias, exibindo o menu e executando as operações selecionadas.
* **incluirCategoria()** : Inclui uma nova categoria.
* **buscarCategoria()** : Busca uma categoria pelo nome.
* **alterarCategoria()** : Altera uma categoria existente.
* **excluirCategoria()** : Exclui uma categoria pelo nome.
* **listarCategorias()** : Lista todas as categorias.

#### `ArquivoTarefa.java`

* **ArquivoTarefa()** : Construtor que inicializa o arquivo de tarefas e o índice indireto de categorias.
* **create(Tarefa t)** : Cria uma nova tarefa.
* **readByCategoria(int categoriaId)** : Lê tarefas por categoria.
* **delete(int tarefaId)** : Exclui uma tarefa.
* **update(Tarefa novaTarefa)** : Atualiza uma tarefa existente.
* **readAll()** : Lê todas as tarefas.

#### `ArquivoCategoria.java`

* **ArquivoCategoria()** : Construtor que inicializa o arquivo de categorias e o índice indireto de nomes.
* **create(Categoria c)** : Cria uma nova categoria.
* **read(String nome)** : Lê uma categoria pelo nome.
* **delete(String nome)** : Exclui uma categoria pelo nome.
* **update(Categoria novaCategoria)** : Atualiza uma categoria existente.
* **readAll()** : Lê todas as categorias.

#### `RegistroHashExtensivel.java`

* **hashCode()** : Retorna o código hash do objeto.
* **size()** : Retorna o tamanho do objeto.
* **toByteArray()** : Serializa o objeto em um array de bytes.
* **fromByteArray(byte ba)** : Desserializa um array de bytes em um objeto.

#### `RegistroArvoreBMais.java`

* **size()** : Retorna o tamanho do objeto.
* **toByteArray()** : Serializa o objeto em um array de bytes.
* **fromByteArray(byte ba)** : Desserializa um array de bytes em um objeto.
* **compareTo(T obj)** : Compara dois objetos.
* **clone()** : Clona o objeto.

#### `Registro.java`

* **setId(int i)** : Define o ID do objeto.
* **getId()** : Retorna o ID do objeto.
* **toByteArray()** : Serializa o objeto em um array de bytes.
* **fromByteArray(byte b)** : Desserializa um array de bytes em um objeto.

#### `HashExtensivel.java`

* **create(T elem)** : Cria um novo elemento no hash.
* **read(int chave)** : Lê um elemento pelo hash.
* **update(T elem)** : Atualiza um elemento existente.
* **delete(int chave)** : Exclui um elemento pelo hash.

#### `ArvoreBMais.java`

* **create(RegistroArvoreBMais objeto)** : Cria um novo elemento na árvore.
* **read(RegistroArvoreBMais objeto)** : Lê um elemento na árvore.
* **delete(RegistroArvoreBMais objeto)** : Exclui um elemento na árvore.

#### `Arquivo.java`

* **Arquivo(String na, Constructor `<T>` c)** : Construtor que inicializa o arquivo de dados e o índice direto.
* **create(T obj)** : Cria um novo objeto no arquivo.
* **read(int id)** : Lê um objeto pelo ID.
* **delete(int id)** : Exclui um objeto pelo ID.
* **update(T novoObj)** : Atualiza um objeto existente.
* **close()** : Fecha o arquivo e o índice direto.

What is the purpose of the `RegistroHashExtensivel` class?()

* ()
* ()
* ()
  ()

Arquivo.java()

* ()

ArvoreBMais.java()

* ()

HashExtensivel.java()

* ()

ParIDEndereco.java()

* ()

Registro.java()

* ()

RegistroArvoreBMais.java()

* ()

RegistroHashExtensivel.java()

* ()

ArquivoCategoria.java()

* ()

ArquivoTarefa.java()

* ()

Categoria.java()

* ()

ControleCategorias.java()

* ()

ControleTarefas.java()

* ()

Main.java()

* ()

MenuTarefas.java()

* ()

ParCategoriaId.java()

* ()

ParNomeId.java()

* ()

Tarefa.java()

* ()

VisaoCategorias.java()

* ()

VisaoTarefas.java()

* ()

README.md()

* ()
* ()
* ()
* ()

README.md()

* PROBLEMS()
  1
* OUTPUT()
* DEBUG CONSOLE()
* TERMINAL()
* PORTS()
* GITLENS()
* COMMENTS()
* powershell()
* ()
  ()
* ()
* ()
* ()
* ()
* ()

### Experiência de Desenvolvimento

Implementamos todos os requisitos especificados. A operação mais difícil foi a implementação do índice indireto e a integração com a árvore B+. Enfrentamos desafios na manipulação de arquivos e na serialização/desserialização de objetos. No entanto, conseguimos alcançar os resultados esperados e o sistema está funcionando corretamente.

### Checklist

- **O CRUD (com índice direto) de categorias foi implementado?**

  - **Sim**. Implementamos as operações de criação, leitura, atualização e exclusão de categorias utilizando um índice direto para acesso rápido.
- **Há um índice indireto de nomes para as categorias?**

  - **Sim**. Implementamos um índice indireto que permite a busca de categorias pelo nome, facilitando a localização e manipulação das categorias.
- **O atributo de ID de categoria, como chave estrangeira, foi criado na classe Tarefa?**

  - **Sim**. A classe `Tarefa`
- **Há uma árvore B+ que registre o relacionamento 1:N entre tarefas e categorias?**

  - **Sim**. Implementamos uma árvore B+ para registrar e gerenciar o relacionamento 1:N entre tarefas e categorias, permitindo uma busca eficiente das tarefas associadas a uma categoria.
- **É possível listar as tarefas de uma categoria?**

  - **Sim**. Utilizando a árvore B+, é possível listar todas as tarefas associadas a uma categoria específica, facilitando a visualização e gerenciamento das tarefas.
- **A remoção de categorias checa se há alguma tarefa vinculada a ela?**

  - **Sim**. Antes de remover uma categoria, o sistema verifica se há tarefas vinculadas a ela. Se houver, a remoção é impedida para evitar inconsistências no banco de dados.
- **A inclusão da categoria em uma tarefa se limita às categorias existentes?**

  - **Sim**. Ao incluir uma categoria em uma tarefa, o sistema verifica se a categoria existe, garantindo que apenas categorias válidas sejam associadas às tarefas.
- **O trabalho está funcionando corretamente?**

  - **Sim**. Realizamos testes extensivos para garantir que todas as funcionalidades estão operando conforme o esperado, sem erros ou falhas.
- **O trabalho está completo?**

  - **Sim**. Implementamos todos os requisitos especificados no projeto, incluindo funcionalidades adicionais para melhorar a usabilidade e eficiência do sistema.
- **O trabalho é original e não a cópia de um trabalho de outro grupo?**

  - **Sim**. Todo o código foi desenvolvido pelo nosso grupo, garantindo a originalidade e autenticidade do trabalho.
