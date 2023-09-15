/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monedas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura=new Scanner (System.in);
System.out.println("ingrese una cantidad de pesos a convertir en otra moneda");
double pesos = lectura.nextDouble();
double dolar = 17.07;
double euro = 18.21;
double libra = 21.18;
double yen = 0.12;
System.out.println("La cantidad de pesos en dolares es " + pesos/dolar);
System.out.println("La cantidad de pesos en euros es " + pesos/euro);
System.out.println("La cantidad de pesos en libras es " + pesos/libra);
System.out.println("La cantidad de pesos en yenes es " + pesos/yen);

lectura.close();

    }
    
}
