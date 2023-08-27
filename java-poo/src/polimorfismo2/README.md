# Polimorfismo de Sobrecarga
## Diagrama de Classe:

### Classe Pessoa

[abs] Animal| 
------------|
(-) peso|
(-) idade|
(-) membros|
------------|
(+) [abs] emitirSom()|

#### Classe Mamifero

Mamifero| 
------------|
(-) corPelo|
------------|
(+) emitirSom()|

##### Classe Lobo

Lobo| 
------------|
(-)|
------------|
(+) emitirSom()|

##### Classe Cachorro

Cachorro| 
------------|
(-)|
------------|
(+) emitirSom()|
