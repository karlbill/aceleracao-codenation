# Aceleração Codenation
#### Repositório criado para armazenar os desafios realizados na Aceleração da empresa Codenation, hoje Trybe.

## Módulo 1: Desafio 3 - Calculadora de Salário Líquido

Neste desafio, vamos implementar um algoritmo que será responsável por receber como parâmetro o <b>salário bruto</b> e retornar o <b>salário líquido</b>, 
já com todos os descontos de <b>INSS</b> e <b>IRRF</b>. Esse algoritmo deve ser implementado na classe <b>CalculadoraSalario</b> no método <b>calcularSalarioLiquido</b>, 
esse método deve receber um valor do tipo <b>double</b> e retornar um valor do tipo <b>int</b></br> (Utilize o método <b>Math.round()</b> para arredondar o resultado final).

<b>Observações:</b> O desafio da Codenation foi simplificado, sendo utilizados valores fictícios e não os valores oficiais das tabelas de alíquotas da Previdência Social e 
Receita Federal. </br>
<b>Diferentemente do desafio proposto, aqui foram utilizados os valores reais e o cálculo do desconto do INSS e IRRF também é feito conforme a realidade.</b></br>

* Alíquotas do <b>INSS</b>:

  | SALÁRIO DE CONTRIBUIÇÃO           | ALÍQUOTA PARA FINS DE RECOLHIMENTO AO INSS    |
  | ----------------------------------|-----------------------------------------------|
  | até 1.100,00                      |                       7,5%                    |
  | de 1.100,01 até 2.203,48          |                       9,0%                    |
  | de 2.203,49 até 3.305,22          |                      12,0%                    |
  | de 3.305,23 até 6.433,57          |                      14,0%                    |
  
Para um salário de <b>R$3.000,00</b>, o cálculo é feito da seguinte forma: </br>

1ª faixa salarial: <b>1.100,00 x 0,075 = 82,50</b></br>
2ª faixa salarial: <b>(2.203,48 – 1.100,00) x 0,09 = 1.103,48 x 0,09 = 99,31</b></br>
Faixa que atinge o salário: <b>(3.000,00 – 2.203,48) x 0,12 = 796,52 x 0,12 = 95,58</b></br>
Total a recolher: <b>95,58 + 99,31 + 82,50 = 277,40</b></br>

* Alíquotas do <b>IRRF</b>:

  | <b>SALÁRIO DE CONTRIBUIÇÃO</b>    |<b> ALÍQUOTA PARA FINS DE RECOLHIMENTO AO IRRF<b>|
  | ----------------------------------|-------------------------------------------------|
  |  de R$ 1.903,99 a R$ 2.826,65     |                       7,5%                      |
  |  de R$ 2.826,66 a R$ 3.751,05     |                      15,0%                      |
  |  de R$ 3.751,06 a R$ 4.664,68     |                      22,5%                      |
  |  a partir de R$ 4.664,69          |                      27,5%                      |
  
Para um salário de <b>R$3.000,00</b>, o cálculo é feito da seguinte forma: </br>

Primeiro, desconta-se o valor recolhido para o <b>INSS(RS277,40)</b>.</br>
Base de cálculo IRRF = <b>R$ 3.000 – R$ 277,40 = R$2.722,60</b></br>

No exemplo acima, o cálculo é simples, pois a pessoa caiu no primeiro nível e terá um desconto simples de <b>7.5%</b> sobre o <b>salário-base</b>.</br> 
Caso o salário-base fosse superior, por exemplo, <b>R$3.500,00</b>, seria feito o desconto no primeiro nível (<b>7.5%</b>), relativo ao valor de <b>R$2.826,00</b> e, 
em seguida, calculada a diferença entre <b>R$3.500,00</b> e os <b>R$2.826,65</b> anteriormente descontados, no nível de <b>15%</b>.</br>

Ou seja:</br>
1ª faixa salarial: <b>2.826,65 x 0,075 = 212,00</b></br>
2ª faixa salarial: <b>(3.500,00 – 2.826,65) x 0,15 = 101,00</b></br>
Total a recolher: <b>212,00 + 101,00 = 313,00</b></br>
  
