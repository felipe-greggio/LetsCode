package Aula07_POO;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {


        Jogador[] time = {
                new Jogador(1, "Washington Sebastián", "Loco Abreu", LocalDate.parse("1975-06-04"), 1, "Atacante", 80, 0, 0, false),
                new Jogador(2,  "Marcos Augusto", "Marcola", LocalDate.parse("1980-12-17"), 4, "Atacante", 65, 0, 0, false),
                new Jogador(3,  "Jorge Niedzywisc", "Muralha", LocalDate.parse("1976-01-03"), 11, "Goleiro", 72, 0, 0, false),
                new Jogador(4,  "Felipe Hortegs", "Marreco", LocalDate.parse("1979-02-25"), 2, "Zagueiro", 53, 0, 0, false),
                new Jogador(5,  "Arnaldo Swein", "Pinguim", LocalDate.parse("1984-06-13"), 7, "Zagueiro", 87, 0, 0, false),
                new Jogador(6,  "Lauro Fordazo", "Ferrugem", LocalDate.parse("1984-07-30"), 9, "Volante", 76, 0, 0, false),
                new Jogador(7,  "Robson Neto", "Neto", LocalDate.parse("1979-08-03"), 10, "Meio Campo", 68, 0, 0, false),
                new Jogador(8,  "Thiago Turmina", "Pinduca", LocalDate.parse("1978-02-26"), 3, "Lateral Esquerda", 69, 0, 0, false),
                new Jogador(9,  "Gilberto Novaes", "Gil Baiano", LocalDate.parse("1975-11-28"), 8, "Lateral Direito", 79, 0, 0, false),
                new Jogador(10,  "Pericles Marea", "Pirulito", LocalDate.parse("1977-10-13"), 5, "Zagueiro", 83, 0, 0, false),
                new Jogador(11,  "Marcos Sassiado", "Marcos Saci", LocalDate.parse("1980-01-19"), 6, "Atacante", 88, 0, 0, false)
        };

        time[0].aplicarCartaoVermelho();
        time[0].sofrerLesao();
        System.out.println();

        for (Jogador jogador : time){
            System.out.println(jogador.toString());
        }
    }
}
