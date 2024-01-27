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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de Larry: ");
        int larry = scanner.nextInt();
        
        System.out.print("Ingrese el numero de Moe: ");
        int moe = scanner.nextInt();
        
        System.out.print("Ingrese el numero de Curly: ");
        int curly = scanner.nextInt();
        
        int difLarryMoe = Math.abs(larry - moe);
        int difLarryCurly = Math.abs(larry - curly);
        int difMoeCurly = Math.abs(moe - curly);
        
        if (difLarryMoe > difLarryCurly && difLarryMoe > difMoeCurly) {
            System.out.println("¡Larry debe pagar!");
        } else if (difLarryCurly > difLarryMoe && difLarryCurly > difMoeCurly) {
            System.out.println("¡Curly debe pagar!");
        } else if (difMoeCurly > difLarryMoe && difMoeCurly > difLarryCurly) {
            System.out.println("¡Moe debe pagar!");
        } else {
            System.out.println("Los números están muy cerca");
        }
    }
}