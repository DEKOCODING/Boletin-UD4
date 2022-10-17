import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int thegrefg = 0;
        int num = 0;

        System.out.println("Introduce la cantidad de caracteres que quieres mostrar ");
        num = sc.nextInt();

        for(thegrefg=0; thegrefg<num; thegrefg++){
            System.out.print("_");
        }


        sc.close();
    }
}
