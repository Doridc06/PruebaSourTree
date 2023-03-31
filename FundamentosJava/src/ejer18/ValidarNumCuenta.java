package ejer18;

import java.util.ArrayList;

public class ValidarNumCuenta {
    public static int calcularDigitosBanco(String banco) {
        int[] numeros = {4, 8, 5, 10};
        int sumaA = 0;


        ArrayList<Integer> digitosBanco = new ArrayList<>();
        String[] list = banco.split("");
        for (String number : list)
            digitosBanco.add(Integer.parseInt(number));


        int resultado = 0;
        if (digitosBanco.size() == numeros.length) {
            for (int i = 0; i < numeros.length; i++) {
                resultado = digitosBanco.get(i) * numeros[i];
                sumaA += resultado;
                System.out.println(digitosBanco.get(i) + "*" + numeros[i] + "=" + resultado);
            }
            System.out.println("la sumaA es de:" + sumaA);
        }
        return sumaA;
    }


    public static int calcularDigitosSucursal(String sucursal) {
        int[] numeros2 = {9, 7, 3, 6};

        int sumaB = 0;
        int resultado = 0;

        if (sucursal.length() == numeros2.length) {
            for (int i = 0; i < numeros2.length; i++) {
                int caracter = Integer.parseInt(String.valueOf(sucursal.charAt(i)));
                resultado = caracter * numeros2[i];
                sumaB += resultado;
                System.out.println(caracter + "*" + numeros2[i] + "=" + resultado);
            }
            System.out.println("la sumaB es de:" + sumaB);
        }
        return sumaB;
    }


    public static int calcularNumeroCuenta(String numCuenta) {
        int[] numeros3 = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};

        int sumaD = 0;
        int resultado = 0;

        if (numCuenta.length() == numeros3.length) {
            for (int i = 0; i < numeros3.length; i++) {
                int caracter = Integer.parseInt(String.valueOf(numCuenta.charAt(i)));
                resultado = caracter * numeros3[i];
                sumaD += resultado;
                System.out.println(caracter + "*" + numeros3[i] + "=" + resultado);
            }
            System.out.println("la sumaD es de:" + sumaD);
        }
        return sumaD;
    }
    }

