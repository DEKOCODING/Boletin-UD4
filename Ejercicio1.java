import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = 0;

        System.out.print("Introduce el número secreto: ");

        code = sc.nextInt();

        if(code == 241){
            System.out.println("Enhorabuena, has acertado el código");
        } else if(code != 241){
            System.out.println("Código incorrecto");
        }else {
            System.out.println("Formato incorrecto");
        }
        
        sc.close();
    }

}