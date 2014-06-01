# Trabalho Pr�tico - Modelagem e Simula��o

## Envolvidos

### Autor

* [Thiago Senhorinha Rose](https://github.com/thisenrose)
* [Rafael Schmidt Melchert](https://github.com/Rafinha88/)

### Orientador

* [Paulo Jos� de Freitas Filho](http://www.inf.ufsc.br/~freitas/)

## Como executar

## O que fazer

# Simulador em linguagem de prop�sito geral 

![Esquema de telefonia](http://s30.postimg.org/cwsd1jtb5/esquema_de_telefonia.png)

## Vari�veis

Consiste em simular um sistema de telefonia composto das vari�veis: 

 * **C�lulas:** Onde est�o as esta��es de r�dio base.
 * **N�mero de canais:** Determinam a sobrecarga do sistema.
 * **Movimenta��o entre c�lulas:** Podem ocasionar perda de sinal ou falta de canal.
 * **Chamadas:** Ocupam por um determinado tempo um canal em uma c�lula origem e destino. Podendo ser o destino igual a origem.
 
 
## Estat�sticas
 
* N�mero de Chamadas no Sistema (m�nimo; m�ximo e m�dia).
* Taxa M�dia de Ocupa��o dos Canais.
* Tempo das Chamadas.
* Contadores de Chamadas Completadas.
* Contador de Chamadas perdidas por falta de canal de comunica��o (por c�lula).
* Contador de Chamadas perdidas por falta de canal de comunica��o devido a deslocamento par fora da �rea de cobertura.
 
## Itens que devem ser contemplados
 
* Permita que o usu�rio possa (de alguma forma) acompanhar a evolu��o da simula��o (use vari�veis na tela, gr�ficos, etc.).
* Permita que o usu�rio possa (de alguma forma) acompanhar o avan�o do tempo com passo vari�vel, de acordo com calend�rio de eventos. 
* Permita a parada/continua��o da simula��o e a observa��o das estat�sticas at� aquele momento.
* Emita um relat�rio final contendo todas as estat�sticas desejadas.
* Interface do usu�rio � muito importante em programas de simula��o.
 
