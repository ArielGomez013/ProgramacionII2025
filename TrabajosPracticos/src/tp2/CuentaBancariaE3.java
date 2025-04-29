/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CuentaBancariaE3Tp2;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class CuentaBancariaE3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        CuentaBancaria miCuenta= new CuentaBancaria(54321,"Ariel",20000);
        
        System.out.println("Numero de cuenta: "+miCuenta.getNum_cuenta());
        System.out.println("Bienvenido "+miCuenta.getNombre());
        System.out.println("Su saldo es: "+miCuenta.getSaldo());
        
        System.out.println("Deposite su saldo: ");
        float deposito=entrada.nextInt();
        miCuenta.depositar(deposito);
        System.out.println("El saldo actual es de: "+miCuenta.consultar());
        
        System.out.println("Ingrese el monto a retirar: ");
        float retiro=entrada.nextInt();
        miCuenta.retirar(retiro);
        miCuenta.consultar();
        
    }
}
