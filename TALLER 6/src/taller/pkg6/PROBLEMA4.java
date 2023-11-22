package taller.pkg6;
import java.util.Scanner;
public class PROBLEMA4 {
    public static void main(String[] args) {
        Scanner mor = new Scanner(System.in);
        int mor1;
        System.out.println("A continuacion ingresa un numero");
        mor1 = mor.nextInt();
        switch (mor1){

            case 1 -> System.out.println("ENERO");
            case 2 -> System.out.println("FEBRERO");
            case 3 -> System.out.println("MARZO");
            case 4 -> System.out.println("ABRIL");
            case 5 -> System.out.println("MAYO");
            case 6 -> System.out.println("JUNIO");
            case 7 -> System.out.println("JULIO");
            case 8 -> System.out.println("AGOSTO");
            case 9 -> System.out.println("SEPTIEMBRE");
            case 10 -> System.out.println("OCTUBRE");
            case 11 -> System.out.println("NOVIEMBRE");
            case 12 -> System.out.println("DICIEMBRE");
            default -> System.out.println("EXISTEN SOLO 12 MESES");
        }
    }
}
