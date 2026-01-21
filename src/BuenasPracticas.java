
import java.util.Scanner;
public class BuenasPracticas {

    public static int Numeros;
    public static double SUMA=0.0;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     double CalcularSuma=CalcularSuma(sc);
     double CalcularPromedio=CalcularPromedio(CalcularSuma);
     System.out.println("La suma total es: "+CalcularSuma);
     System.out.println("El promedio de la suma es :  "+CalcularPromedio);



}

public static double CalcularSuma(Scanner sc){
    System.out.println("Ingresa cuantos numeros quieres calcular");
     Numeros=sc.nextInt();
     for(int i=1;i<=Numeros;i++){
         System.out.println("Ingresa el numero "+i);
     SUMA+=sc.nextDouble();
     }
    return SUMA;
    }
    public static double CalcularPromedio(Double SUMA){

        return SUMA/Numeros;
    }
}


