# Padrões comportamentais

## Qual a principal vantagem do padrão Observer em sistemas reativos?

O Observer permite que partes diferentes do sistema reajam automaticamente a mudanças de estado, sem depender diretamente umas das outras. Isso traz baixo acoplamento, facilita a adição de novos observadores e é muito útil em interfaces gráficas, como quando lidamos com botões e eventos.

---

## Por que o Strategy é melhor que muitos if?

Pois mantem código mais flexível, limpo e evita códigos longos e dificeis de manter.

---

## Dê um exemplo real em que Command seja melhor que apenas chamar métodos diretamente.

Um exemplo prático do uso do padrão Command é em sistemas de desfazer/refazer (undo/redo), como em editores de texto.

Sem Command:
Se métodos forem chamados diretamente (por exemplo: documento.apagarTexto()), fica difícil reverter ou registrar o que foi feito.

Com Command:
Cada ação (como ApagarTextoCommand, InserirTextoCommand) encapsula a lógica da operação e seus dados. Isso permite:

- Armazenar comandos em uma pilha para desfazer/refazer ações.

- Agendar comandos para execução futura.

- Logar operações para auditoria ou repetição automática.

---

## 1 - Resumo da implementação (qual padrão foi utilizado e como);
### Command: 
- Objetivo: Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar solicitações, e suportar operações de desfazer.
- Implementação: Criado o ComandoImprimir, que encapsula a ação de imprimir em uma impressora. Ele implementa a interface Comando, com os métodos executar() e desfazer().

### Observer:
- Objetivo: Permite que objetos sejam notificados automaticamente quando há mudanças em outro objeto.
- Implementação: Criado o Canal, que contém uma lista de observadores e notifica todos quando uma nova mensagem de uma determinada categoria é publicada.

### Strategy:
- Objetivo: Permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis.
- Implementação: Criado o sistema de assinatura com as estratégias PlanBasic, PlanPadrao e PlanPremium, cada uma implementando o método calcularPreco() de forma diferente.

---

## 2 - Exemplo de execução (saída esperada ao rodar a main);

### 🔸 Observer: Notificação por Categoria

### O que faz?
Permite que usuários escolham as categorias de interesse (tecnologia, esporte, política). Ao publicar uma mensagem, apenas os interessados recebem a notificação.

### Saida esperada
```yaml
Mensagem recebida da categoria TECNOLOGIA: Nova tecnologia lançada!
Mensagem recebida da categoria ESPORTE: Time X venceu o campeonato
Mensagem recebida da categoria POLITICA: Nova lei foi aprovada
```

### 🔸 Command: Impressora com ação de desfazer

### 🧩 O que faz?
Permite encapsular comandos como objetos. Neste caso, o comando de imprimir um documento é encapsulado, podendo ser executado ou desfeito.

### Saida esperada
```yaml
Imprimindo: RelatórioFinal.pdf
Cancelando impressão de: RelatórioFinal.pdf
```

### 🔸 Strategy: Sistema de Assinatura
 
### 💡 O que faz?
Permite escolher dinamicamente o tipo de plano de assinatura. Cada plano tem seu próprio algoritmo para cálculo de preço.

### Saída esperada
``` yaml
Você escolheu o plano: Premium
O preço do plano é: R$ 50.90 por mês
```
