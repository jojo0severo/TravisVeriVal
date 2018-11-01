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
