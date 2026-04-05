# Sistema de Processamento de Contratos (Interfaces & DI)

Este projeto em Java foi desenvolvido para praticar a aplicação de interfaces, visando o baixo acoplamento e a inversão de controle no processamento de contratos e parcelas.

## 🚀 Funcionalidades

* **Geração de Parcelas**: Calcula e gera automaticamente um cronograma de parcelas com base no número de meses informado.
* **Cálculo de Juros e Taxas**: Aplica juros mensais simples (1%) e uma taxa de pagamento fixa (2%) através do serviço PayPal.
* **Gestão de Datas**: Utiliza a API `java.time` para atualizar automaticamente as datas de vencimento mês a mês.

## 🛠️ Conceitos de POO Aplicados

* **Interfaces**: Uso da interface `OnlinePaymentService` para definir o contrato de serviços de pagamento, permitindo a troca de implementações sem alterar as regras de negócio.
* **Injeção de Dependência**: A lógica de serviço utiliza a interface para realizar os cálculos, promovendo flexibilidade no sistema.
* **Composição**: A classe `Contract` mantém uma lista de objetos `Installment`, representando a relação entre um contrato e suas parcelas.
* **Encapsulamento**: Atributos privados com métodos de acesso garantem a integridade dos dados financeiros.

## 📂 Estrutura do Projeto

* `Contract`: Entidade que representa o contrato (número, data e valor total).
* `Installment`: Entidade que representa cada parcela gerada.
* `OnlinePaymentService`: Interface que define as operações de juros e taxas.
* `PaypalService`: Implementação específica do serviço de pagamento com regras de 1% de juros e 2% de taxa.
* `ContractService`: Serviço responsável por orquestrar a criação das parcelas e aplicar as taxas.

## 💻 Como Executar

1. Compile e execute a classe `Program.java`.
2. Insira o número do contrato, o valor total e a data inicial.
3. Informe a quantidade de parcelas desejada.
4. O sistema processará os valores e exibirá o resumo das parcelas com vencimentos e valores finais calculados.

---
*Projeto desenvolvido para consolidar o uso de interfaces e serviços em Java.*
