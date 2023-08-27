# Polimorfismo de Sobreposição
## Diagrama de Classe:

### Classe Pessoa

[abs] Animal| 
------------|
(-) peso|
(-) idade|
(-) membros|
------------|
(+) [abs] locomover()|
(+) [abs] alimentar()|
(+) [abs] emitirSom()|

#### Classe Mamifero

Mamifero| 
------------|
(-) corPelo|
------------|

##### Classe Canguru

Canguru| 
------------|
(-)|
------------|
(+) usarBolsa()|
(+) locomover()|

##### Classe Cachorro

Cachorro| 
------------|
(-)|
------------|
(+) enterrarOsso()|
(+) abanarRabo()|

#### Classe Réptil

Reptil| 
------------|
(-) corEscama|
------------|

##### Classe Cobra

Cobra| 
------------|
(-)|
------------|
(+) ()|

##### Classe Tartaruga

Tartaruga| 
------------|
(-)|
------------|
(+) locomover()|

#### Classe Peixe

Peixe| 
------------|
(-) corEscama|
------------|
(+) soltarBolha()|

##### Classe Goldfish

Goldfish| 
------------|
(-)|
------------|
(+) ()|

#### Classe Ave

Ave| 
------------|
(-) corPena|
------------|
(+) fazerNinho()|

##### Classe Arara

Arara| 
------------|
(-)|
------------|
(+) ()|