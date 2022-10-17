import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota_examen = 0;

        System.out.print("Introduce tu nota para saber tu calificación: ");

        nota_examen = sc.nextInt();

        // Esta estructura de condicionales nos dice que dependiendo de la nota que le metamos nos dirá su calificación.

        if(nota_examen >= 0 && nota_examen <5){
            System.out.println("Palmazo, tienes un SUSPENSO.");
        } else if(nota_examen == 5){
            System.out.println("Por lo menos tienes un SUFICIENTE.");
        } else if(nota_examen < 7){
            System.out.println("Tienes un BIEN.");
        } else if(nota_examen < 9){
            System.out.println("Felicidades, tienes un NOTABLE.");
        } else if(nota_examen <= 10){
            System.out.println("¡TIENES UN SOBRESALIENTE!");
        }
        
        sc.close();
    }
}