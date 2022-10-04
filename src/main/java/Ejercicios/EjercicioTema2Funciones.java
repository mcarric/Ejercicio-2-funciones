package Ejercicios;

public class EjercicioTema2Funciones {

    public static void main(String[] args) {


        double price = 1000;
        double iva = 210;

        double priceSuma = getPrice(1000, 210);
        System.out.println(getPrice(price, iva));




    }

    private static double getPrice(double price, double iva) {
        return price + iva;






    }


}
