import java.util.ArrayList;

public interface InterfaceMetodos {

    /**
     Construa um algoritmo que retorna uma lista de numeros e palavras:
     Se o numero for divisivel por 3 inserir Fizz na lista

     Se o numero for divisivel por 5 inserir Buzz na lista

     Se o numero for divisivel por 3 E por 5 inserir FizzBuzz na lista

     Se nao, inserir o proprio numero na lista
     **/

    public ArrayList<String> fizzbuzz();




    /**
     Construa um algoritmo que retorne quantos numeros primos
     existem entre 999999900até 999999950

     Se nao conseguir(tempo de execucao talvez seja insuficiente para o tempo da aula)
     retorne a quantidade de primos de 0 a 100
     **/

    public Integer verificaprimo(int inicio, int fim);




    /**
     Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer
     no plano, P(x1,y1) e P(x2, y2),retorne a distância entre eles.

     A entrada deve ter o formato de tupla, ou seja, duas tuplas com o x e y
     Exemplo:coord =(10,30)


     Formula base para resolucao:
     ______________________
     d = v(x2 -x1)^2+(y2 -y1)^2

     d igual a raiz de x2 menos x1 elevado ao quadrado, mais y2 menos y1 elevado ao quadrado
     **/

    public Float calculadistancia(String[] coord1, String[] coord2);




    /**
     Construa um algoritmo que dada duas entradas no formato dd:hh:mm:ss
     retorne a diferenca entre os dois horarios
     **/

    public String calculadiferencahorario(String horario1, String horario2);




    /**
     Construa um algoritmo que dada uma entrada em  milissegundos
     retorne o  horario no formato dd:hh:mm:ss
     **/

    public String calculahorario(float milissegundos);
}
