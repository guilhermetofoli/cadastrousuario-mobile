# Cadastro de Usuário - App Android

## Descrição
Este projeto é um aplicativo Android simples para cadastro de usuários. Ele permite inserir nome completo e e-mail.

---

## Estrutura do Projeto

### MainActivity (Tela Principal)
Arquivo: `activity_main.xml`

Responsável por:
- Exibir uma lista de usuários cadastrados utilizando `RecyclerView`
- Possuir um botão para iniciar o cadastro de um novo usuário

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
- Adiciona o usuário à lista no formato:
  