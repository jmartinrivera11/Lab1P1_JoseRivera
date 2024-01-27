/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1p1_joserivera;
import java.util.Scanner;
/**
 *
 * @author jmpin
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada en x del punto P: ");
        double xP = scanner.nextDouble();
        System.out.print("Ingrese la coordenada en y del punto P: ");
        double yP = scanner.nextDouble();

        System.out.print("Ingrese la coordenada en x del punto Q: ");
        double xQ = scanner.nextDouble();
        System.out.print("Ingrese la coordenada en y del punto Q: ");
        double yQ = scanner.nextDouble();


        System.out.print("Ingrese la coordenada en x del punto R: ");
        double xR = scanner.nextDouble();
        System.out.print("Ingrese la coordenada en y del punto R: ");
        double yR = scanner.nextDouble();


        double pendientePQ = (yQ - yP) / (xQ - xP);
        double pendientePR = (yR - yP) / (xR - xP);

        if (pendientePQ == pendientePR) {
            System.out.print("¡Los puntos son colineales! Sí forman una recta");
        } else {
            System.out.print("Los puntos no son colineales, no forman una recta");
        }
    }
}