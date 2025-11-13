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
