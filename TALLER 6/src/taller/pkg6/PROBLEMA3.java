package taller.pkg6;
import java.util.Scanner;
public class PROBLEMA3 {
    public static void main(String[] args) {
        Scanner puta = new Scanner(System.in);
        double puta3;
        String puta4;
        System.out.println("Ingresa tu region (local, nacional, ...)");
        puta4 = puta.nextLine();
        System.out.println("Ingresa el peso del paquete");
        puta3 = puta.nextDouble();
        if ((puta3 < 5) && (puta4.equals("local"))){
            System.out.println("El costo vale $5");
        } else if (((puta3 >= 5) && (puta3 <=10)) && (puta4.equals("nacional"))){
            System.out.println("El costo vale $10");
        } else {
            System.out.println("El costo vale $15");
        }
    }
}