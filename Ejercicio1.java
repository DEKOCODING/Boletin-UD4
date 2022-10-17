import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = 0;

        System.out.print("Introduce el número secreto: ");

        codigo = sc.nextInt();

        if(codigo == 241){
            System.out.println("Enhorabuena, has acertado el código");
        } else if(codigo != 241){
            System.out.println("Código incorrecto");
        }      
        
        sc.close();
    }

}