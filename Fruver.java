// ANALISIS
/*
* Descripcion: Consola de resultados detallados, subtutal de cada producto, total sin descuento aplicado y el total final
* Entradas: numero de manzanas, numero de bananos (int)
* Salidas: 4 por cada operacion aritmetica (double)
* Ejemplo: si el usuario compra 2 manzanas y un banano, el subtotal de cada producto seria 2.000 por las manzanas, 800, total 2.800 y con el descuento: 2.520
*/
import java.util.Scanner;

public class Fruver {

    public static void main(String[] args) {

        final double PRECIO_MANZANA = 1000;
        final double PRECIO_BANANO = 800;

        Scanner entrada = new Scanner(System.in); 
        double Nmanzana, Nbanano; 
        System.out.println("El valor de las manzanas es: " + PRECIO_MANZANA);
        System.out.println("Ingrese el numero de manzanas: ");
        Nmanzana = entrada.nextDouble(); 
        entrada.nextLine();
        System.out.println("El numero que ingresaste es: " + Nmanzana);

        System.out.println("El valor de los bananos es: " + PRECIO_BANANO);
        System.out.println("Ingrese el numero de bananos: ");
        Nbanano = entrada.nextDouble(); 
        entrada.nextLine();
        System.out.println("El numero que ingresaste es: " + Nbanano);

        double subtotalM, subtotalB, totalC, totalD;
        subtotalM =  calcularSubtotal(PRECIO_MANZANA, Nmanzana);
        subtotalB = calcularSubtotalB(PRECIO_BANANO, Nbanano);
        totalC = totalFrutas(subtotalM, subtotalB);
        totalD = total(totalC);



        System.out.println("El subtotal de manzanas es: " + subtotalM);
        System.out.println("El subtotal de bananos es: " + subtotalB);
        System.out.println("El subtotal de su compra es: " + totalC);
        System.out.println("El total de su compra es: " + totalD);


    }

    public static double calcularSubtotal(double precio, double cantidad) {
        return precio * cantidad;
    }


    public static double calcularSubtotalB(double precio, double cantidad) {
        return precio * cantidad;
    }

    public static double totalFrutas(double manzanas, double bananos) {
        return manzanas + bananos;
    }

        public static double total(double totalFrutas) {
        return totalFrutas * 0.10;
    }





}
