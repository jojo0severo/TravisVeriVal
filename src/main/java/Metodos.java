

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Metodos implements InterfaceMetodos{

    public Metodos(){}

    public ArrayList<String> fizzbuzz() {
    	ArrayList<String> aux = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    aux.add("FizzBuzz");
                    continue;
                } else {
                    aux.add("Fizz");
                    continue;
                }
            }

            if (i % 5 == 0) {
                aux.add("Buzz");
                continue;
            }

            aux.add(String.valueOf(i));
        }
        return aux;
    }

    public String calculadiferencahorario(String horario1, String horario2) {
        return null;
    }

    public String calculahorario(float milissegundos) {
        return null;
    }

}
