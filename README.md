# Sistema de Controle Financeiro (POO em Java)

Um sistema de controle de despesas pessoais desenvolvido em Java com base nos princípios da Programação Orientada a Objetos (POO).  
Permite gerenciar gastos, categorias e usuários, tudo via console, de forma simples e organizada.

---

## Funcionalidades

- Cadastro de despesas (alimentação, moradia, lazer etc.)
- Registro de pagamentos e valores
- Gerenciamento de usuários
- Listagem e totalização de despesas
- Aplicação de interfaces, herança e polimorfismo
- Armazenamento temporário em memória (ArrayList)

---

## Estrutura do Projeto

src/
└── main/
└── java/
└── com.lucascauan.financeiro/
├── app/ # Contém as classes principais e menus
│ ├── AppFinanceira.java
│ ├── MenuPrincipal.java
│ ├── TelaAnotarPagamento.java
│ ├── TelaCadastroDespesa.java
│ ├── TelaGerenciarUsuarios.java
│ └── TelaListarDespesas.java
│
├── model/ # Modelos de dados (entidades)
│ ├── Categoria.java
│ ├── Despesa.java
│ ├── DespesaAlimentacao.java
│ ├── DespesaMoradia.java
│ ├── Gasto.java
│ ├── Pagavel.java
│ └── Usuario.java
│
├── repository/ # Repositórios e simulação de banco
│ └── RepositorioGastos.java
│
└── service/ # Regras de negócio e interfaces
├── GerenciadorDespesas.java
├── GerenciadorFinanceiro.java
├── GerenciadorUsuarios.java
├── IGerenciadorFinanceiro.java
└── Seguranca.java


---

## Tecnologias Utilizadas

- Java 17+
- Paradigma POO
- Collections (ArrayList)
- Interfaces e herança

---

## Como Executar

 Clone o repositório:
   ```bash
   git clone https://github.com/Lucascauan1604/ControleFinanceiroPOO.git
```
Abra o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code, etc.)

Localize a classe principal:
  ```bash
com.lucascauan.financeiro.app.AppFinanceira
  ```

Execute o programa (Run)

Conceitos de POO Aplicados

Encapsulamento: controle de acesso via getters e setters.

Herança: classes de despesas específicas (ex: DespesaAlimentacao herda de Despesa).

Polimorfismo: uso da interface Pagavel e classes concretas que a implementam.

Abstração: divisão clara entre camadas (model, service, repository, app).

| Arquivo             | Descrição                                |
| ------------------- | ---------------------------------------- |
| `despesas.txt`      | Lista de despesas registradas (simulada) |
| `tipos_despesa.txt` | Tipos de gastos pré-cadastrados          |
| `.gitignore`        | Arquivos ignorados pelo Git              |
| `README.md`         | Documentação do projeto                  |


Autor

Lucas Cauan Inomata
Projeto acadêmico desenvolvido para disciplina de Programação Orientada a Objetos (POO).
Repositório reformulado com foco em boas práticas e modularização do código.
