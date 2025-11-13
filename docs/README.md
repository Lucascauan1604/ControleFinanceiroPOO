# ControleFinanceiro

Versão reformulada de um sistema de controle de despesas para entrega acadêmica.

## Sobre
Aplicação em Java (console) que permite registrar, listar e remover gastos. Os dados são mantidos em memória (ArrayList) — ao encerrar a aplicação, os dados são perdidos.

## Estrutura
- Pacotes: `com.lucascauan.financeiro.model`, `repository`, `service`, `app`.

## Como executar
1. Abra a pasta do projeto e compile os arquivos Java (por exemplo usando `javac`).
2. Execute a classe principal `com.lucascauan.financeiro.app.AppFinanceira`.

Exemplo (Linux / Mac / Windows com terminal):

```bash
# dentro da pasta src
javac -d out $(find . -name "*.java")
java -cp out com.lucascauan.financeiro.app.AppFinanceira
```

## Notas
- Os nomes de classes e pacotes foram alterados para diferenciar do repositório original.
- Mantive a simplicidade: persistência em memória usando `ArrayList`.

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

