# Criando uma conta bancaria

## Diagrama de Classe:
### Interface
<<Interface>> Controlador| 
------------|
(+) ligar()|
(+) desligar()|
(+) abrirMenu()|
(+) fecharMenu()|
(+) maisVolume()|
(+) menosVolume()|
(+) ligarMudo()|
(+) desligarMudo()|
(+) play()|
(+) pause()|

### Classe
ControleRemoto| 
------------|
(-) volume|
(-) ligado|
(-) tocando|
------------|
(+) ligar()|
(+) desligar()|
(+) abrirMenu()|
(+) fecharMenu()|
(+) maisVolume()|
(+) menosVolume()|
(+) ligarMudo()|
(+) desligarMudo()|
(+) play()|
(+) pause()|
