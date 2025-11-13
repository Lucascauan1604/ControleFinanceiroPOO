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

```
ControleFinanceiro/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── lucascauan/
│                   └── financeiro/
│                       ├── app/
│                       │   ├── AppFinanceira.java
│                       │   ├── MenuPrincipal.java
│                       │   ├── TelaAnotarPagamento.java
│                       │   ├── TelaCadastroDespesa.java
│                       │   ├── TelaGerenciarUsuarios.java
│                       │   └── TelaListarDespesas.java
│                       ├── model/
│                       │   ├── Categoria.java
│                       │   ├── Despesa.java
│                       │   ├── DespesaAlimentacao.java
│                       │   ├── DespesaMoradia.java
│                       │   ├── Gasto.java
│                       │   ├── Pagavel.java
│                       │   └── Usuario.java
│                       ├── repository/
│                       │   └── RepositorioGastos.java
│                       └── service/
│                           ├── GerenciadorDespesas.java
│                           ├── GerenciadorFinanceiro.java
│                           ├── GerenciadorUsuarios.java
│                           ├── IGerenciadorFinanceiro.java
│                           └── Seguranca.java
├── despesas.txt
├── tipos_despesa.txt
├── usuarios.txt
└── docs/
    └── README.md
```

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

---

## Conceitos de POO Aplicados

- Encapsulamento: controle de acesso via getters e setters.
- Herança: classes de despesas específicas (ex: DespesaAlimentacao herda de Despesa).
- Polimorfismo: uso da interface Pagavel e classes concretas que a implementam.
- Abstração: divisão clara entre camadas (model, service, repository, app).

---

| Arquivo             | Descrição                                |
| ------------------- | ---------------------------------------- |
| `despesas.txt`      | Lista de despesas registradas (simulada) |
| `tipos_despesa.txt` | Tipos de gastos pré-cadastrados          |
| `usuarios.txt`      | Lista de usuários simulada               |
| `README.md`         | Documentação do projeto                  |

---

## Autor

Lucas Cauan Inomata
Projeto acadêmico desenvolvido para disciplina de Programação Orientada a Objetos (POO).
Repositório reformulado com foco em boas práticas e modularização do código.

## Changelog da Entrega

### 2025-11-12
- Estrutura de pacotes e classes principais criada
- Implementação das classes: Despesa, Gasto, Categoria, Usuario
- Métodos específicos em Despesa (fixa, paga, detalhar, calcular com juros)
- Atualização do arquivo `despesas.txt` para refletir novos campos
- Gerenciadores de despesas e usuários
- Telas de cadastro, listagem, anotação de pagamento e gerenciamento de usuários
- Arquivos TXT para simulação de persistência
- Documentação inicial do projeto

