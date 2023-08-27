# Projeto Final

## Diagrama de Classe:
### Interface
<<Interface>> AcoesVideo| 
------------|
(+) play()|
(+) pause()|
(+) like()|

### Classe Video
Video| 
------------|
(-) titulo|
(-) avalicao|
(-) views|
(-) curtidas|
(-) reproduzindo|

### Pessoa
Pessoa| 
------------|
(#) Nome|
(#) idade|
(#) sexo|
(#) experiencia|
------------|
(#) ganharExp()

### Gafanhoto
Gafanhoto| 
------------|
(-) login|
(-) totAssistido|
------------|
(+) viuMaisUm()

### Visualizacao
Visualizacao| 
------------|
(-) espectador|
(-) filme|
------------|
(+) avaliar()
(+) avaliar(nota)
(+) avaliar(porc)
