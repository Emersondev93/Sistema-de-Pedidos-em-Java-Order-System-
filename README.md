📦 Sistema de Pedidos em Java (Order System)

Este projeto foi desenvolvido como parte de um curso de Java, com o objetivo de praticar Programação Orientada a Objetos (POO), uso de enumerações, listas, datas, e entrada de dados via console.

O sistema simula um pedido de compra, permitindo cadastrar cliente, produtos, itens do pedido e calcular o valor total.

🛠️ Tecnologias Utilizadas

Java

Programação Orientada a Objetos (POO)

java.time (LocalDate, LocalDateTime)

ArrayList

Enum

Scanner (entrada de dados)

DecimalFormat (formatação monetária)

📚 Estrutura do Projeto
src/
├── entidades/
│   ├── Cliente.java
│   ├── Produto.java
│   ├── ItemPedido.java
│   ├── Pedido.java
│   └── Principal.java
│
└── entidadesEnum/
    └── StatusPedido.java

🧩 Descrição das Classes
🔹 Cliente

Representa o cliente que realiza o pedido.

Atributos:

nome

email

dataNascimento

🔹 Produto

Representa um produto disponível para compra.

Atributos:

nome

preco

🔹 ItemPedido

Representa um item do pedido, associando um produto à quantidade comprada.

Atributos:

produto

quantidade

preco

Método importante:

subTotal() → calcula o valor total do item.

🔹 Pedido

Representa o pedido realizado pelo cliente.

Atributos:

momento (data e hora do pedido)

status (enum StatusPedido)

lista de itens

Métodos principais:

adicionarPedido(ItemPedido)

removerPedido(ItemPedido)

total() → calcula o valor total do pedido

🔹 StatusPedido (Enum)

Define os possíveis estados de um pedido:

PAGAMENTO_PENDENTE

PROCESSANDO

ENVIADO

ENTREGUE

🔹 Principal

Classe responsável pela execução do programa.

Funções principais:

Entrada de dados do cliente

Entrada de dados do pedido e dos itens

Exibição do resumo do pedido

Cálculo e exibição do valor total

▶️ Como Executar o Projeto

Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git


Abra o projeto em uma IDE Java (Eclipse, IntelliJ, VS Code)

Execute a classe:

Principal.java


Insira os dados solicitados no console.

📌 Exemplo de Saída
RESUMO DO PEDIDO:
Momento do pedido: 14/01/2026 19:30:12
Status do pedido: PROCESSANDO
Cliente: João Silva (15/08/2000) - joao@email.com

Itens do pedido:
Produto: Notebook
Preço unitário: 3500.00
Quantidade: 1
Subtotal: 3500.00

Preço total: 3500.00

🎯 Objetivo do Projeto

Este projeto tem como finalidade:

Fixar conceitos de POO

Trabalhar com relacionamento entre classes

Utilizar Enum para controle de estados

Praticar listas e cálculos

Simular um sistema real de pedidos

🚀 Autor

Projeto desenvolvido por Emerson Amorim
📘 Estudante de Análise e Desenvolvimento de Sistemas
💻 Em aprendizado contínuo em Java e Back-end
