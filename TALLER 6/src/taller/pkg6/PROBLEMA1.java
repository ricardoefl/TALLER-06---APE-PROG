package taller.pkg6;
import java.util.Scanner;
public class PROBLEMA1 {
    public static void main(String[] args) {
        Scanner sexo1 = new Scanner(System.in);
        double sexo3, sexo4, sexo5, sexo6, sexo7, sexo8, sexo9, sexo10, sexo11, sexo12, sexo13, sexo14;
        System.out.println("Hola estimado usuario, a continuacion ingresa el costo de los productos que adquiriste:");
        System.out.println("Ingresa el costo del primer producto, si no lo compraste ingresa 0");
        sexo3 = sexo1.nextDouble();
        System.out.println("Ingresa las unidades que compraste");
        sexo5 = sexo1.nextDouble();
        System.out.println("Ingresa el costo del segundo producto, si no lo compraste ingresa 0");
        sexo6 = sexo1.nextDouble();
        System.out.println("Ingresa las unidades que compraste");
        sexo8 = sexo1.nextDouble();
        System.out.println("Ingresa el costo del envio");
        sexo12 = sexo1.nextDouble();
        sexo4 = sexo3 * sexo5;
        sexo7 = sexo6 * sexo8;
        sexo10 = (sexo3 * sexo5) + (sexo6 * sexo8);
        sexo9 = (sexo3 * sexo5) + (sexo6 * sexo8);
        if (sexo10 <= 1000){
            sexo13 = sexo10 * 12/100;
            sexo14 = sexo9 + sexo13;
            sexo11 = sexo14 * 0.05;
            sexo10 = sexo10 - sexo11 + sexo13 + sexo12;
            System.out.println("==================FACTURA==================");
            System.out.println("Producto 1 : " + sexo3 + " Subtotal 1: " + sexo4);
            System.out.println("Producto 2 : " + sexo6 + " Subtotal 2: " + sexo7);
            System.out.println("Subtotal: " + sexo9);
            System.out.println("IVA: " + sexo13);
            System.out.println("Subtotal + IVA: " + sexo14);
            System.out.println("Descuento: " + sexo11);
            System.out.println("Gasto de envio: " + sexo12);
            System.out.println("TOTAl: $" + sexo10);
        }
        else {
            if (sexo10 <= 5000){
                sexo13 = sexo10 * 12/100;
                sexo14 = sexo9 + sexo13;
                sexo11 = sexo14 * 0.2;
                sexo10 = sexo10 - sexo11 + sexo13 + sexo12;
                System.out.println("==================FACTURA==================");
                System.out.println("Producto 1 : " + sexo3 + " Subtotal 1: " + sexo4);
                System.out.println("Producto 2 : " + sexo6 + " Subtotal 2: " + sexo7);
                System.out.println("Subtotal: " + sexo9);
                System.out.println("IVA: " + sexo13);
                System.out.println("Subtotal + IVA: " + sexo14);
                System.out.println("Descuento: " + sexo11);
                System.out.println("Gasto de envio: " + sexo12);
                System.out.println("TOTAl: $" + sexo10);
            }
            else {
                sexo13 = sexo10 * 12/100;
                sexo14 = sexo9 + sexo13;
                sexo11 = sexo14 * 20/100;
                sexo10 = sexo10 - sexo11 + sexo13;
                System.out.println("==================FACTURA==================");
                System.out.println("Producto 1 : " + sexo3 + " Subtotal 1: " + sexo4);
                System.out.println("Producto 2 : " + sexo6 + " Subtotal 2: " + sexo7);
                System.out.println("Subtotal: " + sexo9);
                System.out.println("IVA: " + sexo13);
                System.out.println("Subtotal + IVA: " + sexo14);
                System.out.println("Descuento: " + sexo11);
                System.out.println("Tu envio sera gratuito");
                System.out.println("TOTAl: $" + sexo10);
            }
        }
    }   
}