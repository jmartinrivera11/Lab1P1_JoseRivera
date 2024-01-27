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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();
        if (año < 2024 || año > 2040) {
            System.out.println("El año no es valido");
            return;
        }

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("El mes no es valido");
            return;
        }

        System.out.print("Ingrese el dia: ");
        int dia = scanner.nextInt();

        if (mes == 2) {
            if (dia < 1 || dia > 28) {
                System.out.println("El dia no es valido");
                return;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30) {
                System.out.println("El dia no es valido");
                return;        
            }
        } else {
            if (dia < 1 || dia > 31) {
                System.out.println("El dia no es valido");
                return;
            }    
        }
        
        System.out.println("Se ha programado su evento para el " + dia + "/" + mes + "/" + año);
    }
}