package exercices.tp1.exercice1;
import java.util.Scanner;

public class CalculerMoyenne {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

int [] notes = new int[3];
System.out.println("Veuillez saisir trois notes :");
int somme = 0;

for (int index = 1;  index <= notes.length; index++){
    System.out.print("Note" + index + ":");
    notes[index] = scanner.nextInt();

    if (notes[index] <= 0 && notes[index] >= 20){
        System.out.println("Erreur : la note doit être entre 0 et 20.");
        return;
    }

    somme += notes;
}
int moyenne = somme /3;
System.out.println("La moyenne des notes est : " + moyenne);

    }
}
