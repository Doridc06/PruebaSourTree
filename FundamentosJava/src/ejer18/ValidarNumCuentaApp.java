package ejer18;

import java.util.Scanner;

import static ejer18.ValidarNumCuenta.*;

public class ValidarNumCuentaApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las cuatro cifras del banco: ");
        String banco = sc.nextLine();
        int[] numeros2 = {9, 7, 3, 6};

        calcularDigitosBanco(banco);

        System.out.println("Introduce las cuatro cifras de la sucursal: ");
        String sucursal = sc.nextLine();

        ValidarNumCuenta.calcularDigitosSucursal(sucursal);

        int sumaA = calcularDigitosBanco(banco);
        int sumaB = calcularDigitosSucursal(sucursal);
        int sumaTotal = calcularDigitosBanco(banco) + calcularDigitosSucursal(sucursal);
        System.out.println("La suma de SumaA y SumaB es: " + sumaTotal);

        int restoC = sumaTotal % 11;
        System.out.println("Resto C: " + restoC);
        int primerDigito = 11 - restoC;
        System.out.println("Es el primer dígito de control de nuestra CCC: " + primerDigito);


        System.out.println("Introduce las diez cifras del numero de cuenta: ");
        String numCuenta = sc.nextLine();



        int sumaD = calcularNumeroCuenta(numCuenta);
        int restoD = sumaD % 11;
        System.out.println("Resto D: " + restoD);
        int segundoDigito = 11 - restoD;
        System.out.println("Es el segundo dígito de control de nuestra CCC: " + segundoDigito);




        //sumaA = funA
        //sumaB = funB
        //sumatotal = funA + funB


    }
}