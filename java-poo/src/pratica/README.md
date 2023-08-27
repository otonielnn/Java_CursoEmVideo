# Criando uma conta bancaria

## Diagrama de Classe:

ContaBanco      | 
------------| 
(+) numConta  | 
(#) tipo     | 
(-) dono   |
(-) saldo   |
(-) status |
------------|
(+) abrirConta()|
(+) fecharConta()|
(+) depositar()|
(+) sacar()|
(+) pagarMensal()|


### tipo de contas
#### cc
    - começa com 50 reais
#### cp
    - começa com 150 reais

### Métodos
#### abrirConta()
    - mudar status para verdadeiro ao criar a conta;

#### fecharConta()
    - apenas conta com 0 de saldo (sem dever e sem dinheiro)
    - apenas contas com status verdadeiro

#### depositar()
    - apenas contas com status verdadeiro

#### sacar()
    - apenas contas com status verdadeiro
    - ter saldo suficiente para o saque.
    
#### pagarMensal()
    - debitar direto do saldo (cc=12 cp=15)