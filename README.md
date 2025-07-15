# Padrões comportamentais

## Qual a principal vantagem do padrão Observer em sistemas reativos?

O Observer permite que partes diferentes do sistema reajam automaticamente a mudanças de estado, sem depender diretamente umas das outras. Isso traz baixo acoplamento, facilita a adição de novos observadores e é muito útil em interfaces gráficas, como quando lidamos com botões e eventos.


## Por que o Strategy é melhor que muitos if?

Pois mantem código mais flexível, limpo e evita códigos longos e dificeis de manter.

## Dê um exemplo real em que Command seja melhor que apenas chamar métodos diretamente.

Um exemplo prático do uso do padrão Command é em sistemas de desfazer/refazer (undo/redo), como em editores de texto.

Sem Command:
Se métodos forem chamados diretamente (por exemplo: documento.apagarTexto()), fica difícil reverter ou registrar o que foi feito.

Com Command:
Cada ação (como ApagarTextoCommand, InserirTextoCommand) encapsula a lógica da operação e seus dados. Isso permite:

- Armazenar comandos em uma pilha para desfazer/refazer ações.

- Agendar comandos para execução futura.

- Logar operações para auditoria ou repetição automática.

## 1 - Resumo da implementação (qual padrão foi utilizado e como);

## 2 - Exemplo de execução (saída esperada ao rodar a main);
