package Cours.heritage;


import java.time.LocalDate;

public class Main {
    public static void main(String[] ARGS){
        Salarie michel = new Salarie(
                "Quezak",
                "Michel",
                LocalDate.of(1980,12,31),
                30,
                LocalDate.now()
        );

        Stagiaire titouan = new Stagiaire(
                "Quezak",
                "Titouan",
                LocalDate.of(2000,03,30),
                LocalDate.now(),
                LocalDate.of(2024,01,04)
        );

        System.out.println();
    }
}
