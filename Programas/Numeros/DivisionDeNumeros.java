/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.util.Scanner;
/**
 *
 * @author xiomara
 */
public class DivisionDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No es posible dividir por cero.");
        }

        scanner.close();
    }
}

