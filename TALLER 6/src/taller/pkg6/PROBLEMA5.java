package taller.pkg6;
import java.util.Scanner;
public class PROBLEMA5 {
    public static void main(String[] args) {
        Scanner FERXXO = new Scanner(System.in);
        int BADBUNNY;
        System.out.println("Selecciona el tipo de operacion");
        System.out.println("  [1] SUMA\n  [2] RESTA\n  [3] MULTIPLICACION\n  [4] DIVISION");
        BADBUNNY = FERXXO.nextInt();
        switch (BADBUNNY){


            case 1 -> System.out.println("SUMA");
            case 2 -> System.out.println("RESTA");
            case 3 -> System.out.println("MULTIPLICACION");
            case 4 -> System.out.println("DIVISION");
            default -> System.out.println("SOLO HAY 4 HIJUEPUUTA");
        }
    }
}