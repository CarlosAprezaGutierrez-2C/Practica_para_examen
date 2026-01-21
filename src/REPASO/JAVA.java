package REPASO;

import java.util.Scanner;

public class JAVA {

    public static double IVA=0.16;
    public static double total,subtotal;
    public static double UMBRAL_DESCUENTO=1000;
    public static double DESCUENTO=0.10;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         subtotal = pedirDouble(scanner, "Subtotal: ");
         total =subtotal+(subtotal*IVA);
        Double CalcularDescuento=CalcularDescuento(total);
        System.out.printf("Total a pagar: %.2f%n", CalcularDescuento);
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
    public static double CalcularDescuento(Double Descuento) {
         if (subtotal >UMBRAL_DESCUENTO) {
             total=total-(total*DESCUENTO);
         }

          return total;
    }
}
