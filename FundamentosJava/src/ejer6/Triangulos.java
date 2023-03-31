package ejer6;
import java.util.Scanner;
public class Triangulos {

    public static void tiposTriangulos(float ladoA, float ladoB, float ladoC){
        if ((ladoA == ladoB) && (ladoC != ladoA) && (ladoC != ladoB)){
            System.out.println("es un triangulo isosceles");
        }else if ((ladoA == ladoB) && (ladoA == ladoC) && (ladoB == ladoC)){
            System.out.println("es un triangulo equilatero");
        } else if  ((ladoA != ladoB) && (ladoC != ladoA) && (ladoC != ladoB)) {
            System.out.println("es un triangulo escaleno");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el lado A:");
        float ladoA = sc.nextFloat();

        System.out.println("Introduce el lado B:");
        float ladoB = sc.nextFloat();

        System.out.println("Introduce el lado C:");
        float ladoC = sc.nextFloat();

        tiposTriangulos(ladoA,ladoB,ladoC);
    }
}
