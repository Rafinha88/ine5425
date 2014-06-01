# Trabalho Prático - Modelagem e Simulação

## Envolvidos

### Autor

* [Thiago Senhorinha Rose](https://github.com/thisenrose)
* [Rafael Schmidt Melchert](https://github.com/Rafinha88/)

### Orientador

* [Paulo José de Freitas Filho](http://www.inf.ufsc.br/~freitas/)

## Como executar

## O que fazer

# Simulador em linguagem de propósito geral 

![Esquema de telefonia](http://s30.postimg.org/cwsd1jtb5/esquema_de_telefonia.png)

## Variáveis

Consiste em simular um sistema de telefonia composto das variáveis: 

 * **Células:** Onde estão as estações de rádio base.
 * **Número de canais:** Determinam a sobrecarga do sistema.
 * **Movimentação entre células:** Podem ocasionar perda de sinal ou falta de canal.
 * **Chamadas:** Ocupam por um determinado tempo um canal em uma célula origem e destino. Podendo ser o destino igual a origem.
 
 
## Estatísticas
 
* Número de Chamadas no Sistema (mínimo; máximo e média).
* Taxa Média de Ocupação dos Canais.
* Tempo das Chamadas.
* Contadores de Chamadas Completadas.
* Contador de Chamadas perdidas por falta de canal de comunicação (por célula).
* Contador de Chamadas perdidas por falta de canal de comunicação devido a deslocamento par fora da área de cobertura.
 
## Itens que devem ser contemplados
 
* Permita que o usuário possa (de alguma forma) acompanhar a evolução da simulação (use variáveis na tela, gráficos, etc.).
* Permita que o usuário possa (de alguma forma) acompanhar o avanço do tempo com passo variável, de acordo com calendário de eventos. 
* Permita a parada/continuação da simulação e a observação das estatísticas até aquele momento.
* Emita um relatório final contendo todas as estatísticas desejadas.
* Interface do usuário é muito importante em programas de simulação.
 
