package taller.pkg6;
import java.util.Scanner;
public class PROBLEMA2 {
    public static void main(String[] args) {
        Scanner verga = new Scanner(System.in);
        double verga1, verga2, verga3, verga4, verga5, verga6;
        System.out.println("Ingresa el lado 1");
        verga1 = verga.nextDouble();
        System.out.println("Ingresa el lado 2");
        verga2 = verga.nextDouble();
        System.out.println("Ingresa el lado 3");
        verga3 = verga.nextDouble();
        verga4 = verga1 + verga2;
        verga5 = verga1 + verga3;
        verga6 = verga2 + verga3;
        System.out.println("===============================");
        if ((verga4 < verga3) || (verga5 < verga2) || (verga6 < verga1)){
            System.out.println("No es triangulo");
        } else if ((verga1 == verga2) && (verga2 == verga3)){
            System.out.println("equilatero");
        } else if ((verga1 == verga2) || (verga2 == verga3) || (verga1 == verga3)){
            System.out.println("isosceles");
        } else if ((verga1 != verga2) && (verga2 != verga3) && (verga1 != verga3)){
            System.out.println("escaleno");
        }    
    }
}