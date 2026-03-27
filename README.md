# Cadastro de Usuário - App Android

## Descrição
Este projeto é um aplicativo Android simples para cadastro de usuários. Ele permite inserir nome completo e e-mail.

---

## Estrutura do Projeto

### MainActivity (Tela Principal)
Arquivo: `activity_main.xml` e `MainActivity.java`

Responsável por:
- Exibir uma lista de usuários cadastrados utilizando `RecyclerView`
- Possuir um botão para iniciar o cadastro de um novo usuário
- Gerenciar a lista estática `listaNomes` que armazena os dados em memória
- Atualizar a lista visualmente através do método `onResume`

Componentes principais:
- `RecyclerView` (`@+id/recycler_view`)
- `Button` (`@+id/btnCadastrar`)

---

### Tela de Cadastro
Arquivo: `create_user.xml`

Responsável por:
- Capturar os dados do usuário

Componentes:
- `TextView` (título da tela)
- `TextInputEditText` para nome completo (`@+id/nome_completo`)
- `TextInputEditText` para e-mail (`@+id/email`)
- `Button` para salvar (`@+id/btnSalvar`)

---

### Classe de Cadastro
Arquivo: `CreateUser.java`

Responsável por:
- Controlar a lógica da tela de cadastro
- Capturar os dados inseridos
- Adicionar os dados na lista da `MainActivity`

#### Funcionamento:
- Obtém os valores digitados nos campos
- Verifica se o nome não está vazio
- Adiciona o usuário à lista no formato: `Nome (email)`
- Finaliza a activity para retornar à tela principal

---

### Classe Adaptadora
Arquivo: `UserAdapter.java`

Responsável por:
- Gerenciar a criação e o preenchimento dos itens na `RecyclerView`
- Utilizar o padrão `ViewHolder` para otimizar a performance
- Vincular a lista de Strings ao layout `simple_list_item_1` do Android

#### Funcionamento:
- Infla o layout de cada linha da lista
- Define o texto no `TextView` correspondente à posição do item
- Retorna a contagem total de itens para o sistema