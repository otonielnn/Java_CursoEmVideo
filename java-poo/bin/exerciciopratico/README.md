# Exercício Prático

## Diagrama de Classe:

### Classe Pessoa

Pessoa| 
------------|
(-) nome|
(-) idade|
(-) sexo|
------------|
(+) fazerAniversario()|

### Classe Livro

Livro| 
------------|
(-) titulo|
(-) autor|
(-) totalPaginas|
(-) paginaAtual|
(-) aberto|
(-) leitor|
------------|
(+) detalhes()

### Interface Publicação
<<Interface>> Publicacao| 
------------|
(+) abrir()|
(+) fechar()|
(+) folhear()|
(+) avançarPag()|
(+) voltarPag()|
