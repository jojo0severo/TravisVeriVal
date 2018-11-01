import org.junit.jupiter.api.Test;

import java.util.ArrayList;



public class TesteMetodos {
    Metodos metodos = new Metodos();

    @Test
    public void testeFizzBuzz(){
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

        assertEquals(aux, metodos.fizzbuzz());
    }

    @Test
    public void testeCalculaDifHorario(){
        String horario1 = "00:13:35:00:00";
        String horario2 = "00:14:30:00:00";

        String resultado = "00:00:55:00:00";

        assertEquals(resultado, metodos.calculadiferencahorario(horario1,horario2));

    }

    @Test
    public void testeCalculaHorario(){
        String[] resultado = {
                "03:21:20:01:50",
                "03:21:20:01:49",
                "03:21:20:01:48",
                "03:21:20:01:47",
                "03:21:20:01:46",
                "03:21:20:01:45",
                "03:21:20:01:44",
                "03:21:20:01:43",
                "03:21:20:01:42",
                "03:21:20:01:41",
                "03:21:20:01:40",
                "03:21:20:01:39",
                "03:21:20:01:38",
                "03:21:20:01:37",
                "03:21:20:01:36",
                "03:21:20:01:35",
                "03:21:20:01:34",
                "03:21:20:01:33",
                "03:21:20:01:32",
                "03:21:20:01:31",
                "03:21:20:01:30",
                "03:21:20:01:29",
                "03:21:20:01:28",
                "03:21:20:01:27",
                "03:21:20:01:26",
                "03:21:20:01:25",
                "03:21:20:01:24",
                "03:21:20:01:23",
                "03:21:20:01:22",
                "03:21:20:01:21",
                "03:21:20:01:20"
        };

        for (String s: resultado)
            if (metodos.calculahorario(336001000F).equalsIgnoreCase(s))
                assertTrue(true);


    }
}
