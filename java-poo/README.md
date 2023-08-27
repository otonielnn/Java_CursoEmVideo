# POO
## Vantagens do POO:
- Confiável
- Oportuno
- Manutenível
- Extensível
- Reutilizável
- Natural

# Linguagem de Modelagem Unificada
## Diagrama de Classes:
- Nome da Classe (começando com letra maiúscula)
- Características (Atributos)
- Métodos (Ações)

Caneta      | 
------------| 
(+) Modelo  | 
(+) Cor     | 
(-) Ponta   |
(+) Carga   |
(#) Tampada |
------------|
(+) escrever()|
(+) rabiscar()|
(+) pintar()|
(-) tampar()|
(-) destampar()|


## Modificadores de visibilidade:
Indicam o nível de acesso ao componentes internos de uma classe.
- (+) Público Public
- (-) Privado Private
- (#) Protegido Protected

# Conceitos de Herança

## Fundamentos
- Raiz: Está no Topo da herança.
- Folha: Classe que não possui filho(a).
- Ancestral: Classe que precede e tem parentesco de no minimo 2ºgrau.
- Descendente: inverso de ancestral.
- Generalização: subir para mais próximo da raiz.
- Especialização: descer para mais próximo de uma folha.

## Classe Abstrata
- Não pode ser instanciada. Só pode servir como progenitora.

## Método Abstrato
- Declarado, mas não implementado na progenitora.

## Classe Final
- Não pode ser herdada por outra Classe. Obrigatoriamente folha.

## Método Final
- Não pode ser sobrescrito pelas suas sub-classes. Obrigatoriamente herdado.

# Polimorfismo
Várias formas de se fazer algo.

## Assinatura de Método
- Quantidade e os tipos dos parâmetros

## Tipos de Polimorfismo
- Sobreposição
    Acontece quando substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura.
- Sobrecarga