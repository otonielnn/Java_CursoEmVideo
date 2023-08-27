# Ultra Emoji Combat

## Diagrama de Classe:

### Classe Lutador
Lutador| 
------------|
(-) nome|
(-) nacionalidade|
(-) idade|
(-) altura|
(-) peso|
(-) categoria|
(-) vitorias|
(-) derrotas|
(-) empates|
------------|
(+) apresentar()|
(+) status()|
(+) ganharLuta()|
(+) perderLuta()|
(+) empatarLuta()|

### Lutadores
#### Pretty boy
- nome: Pretty Boy
- nacionalidade: França
- idade: 31
- altura: 1.75m
- peso: 68.9Kg
- categoria: Leve
- vitorias: 11
- derrotas: 3
- empates: 1

#### Putscript
- nome: Putscript
- nacionalidade: Brasil
- idade: 29
- altura: 1.68m
- peso: 57.8Kg
- categoria: Leve
- vitorias: 14
- derrotas: 2
- empates: 3

#### Snapshadow
- nome: Snapshadow
- nacionalidade: EUA
- idade: 35
- altura: 1.65m
- peso: 80.9Kg
- categoria: Médio
- vitorias: 12
- derrotas: 2
- empates: 1

#### Dead Code
- nome: Dead Code
- nacionalidade: Australia
- idade: 28
- altura: 1.93m
- peso: 81.6Kg
- categoria: Médio
- vitorias: 13
- derrotas: 0
- empates: 2

#### Ufocobol
- nome: Ufocobol
- nacionalidade: Brasil
- idade: 37
- altura: 1.70m
- peso: 119.3Kg
- categoria: Pesado
- vitorias: 5
- derrotas: 4
- empates: 3

#### Nerdaard
- nome: Nerdaard
- nacionalidade: EUA
- idade: 30
- altura: 1.81m
- peso: 105.7Kg
- categoria: Pesado
- vitorias: 12
- derrotas: 2
- empates: 4

## Classe Luta
Luta| 
------------|
(-) desafiado|
(-) desafiante|
(-) round|
(-) aprovada|
------------|
(+) marcarLuta()|
(+) lutar()|

### Regras da Luta
- Só pode ser marcada luta entre lutadores da mesma categoria.
- Desafiado e desafiante devem ser lutadores diferentes.
- Só pode acontecer se estiver aprovada.
- Só pode ter como resultado a vitória de um dos lutadores ou o empate.