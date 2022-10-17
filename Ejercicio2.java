import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota = 0;

        System.out.print("Introduce tu nota para saber tu calificación: ");

        nota = sc.nextInt();

        if(nota >= 0 && nota <5){
            System.out.println("Palmazo, tienes un SUSPENSO.");
        } else if(nota == 5){
            System.out.println("Por lo menos tienes un SUFICIENTE.");
        } else if(nota < 7){
            System.out.println("Tienes un BIEN.");
        } else if(nota < 9){
            System.out.println("Felicidades, tienes un NOTABLE.");
        } else if(nota <= 10){
            System.out.println("¡TIENES UN SOBRESALIENTE!");
        }
        
        sc.close();
    }
}