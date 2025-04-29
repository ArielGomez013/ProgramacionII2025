/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaBancariaE3Tp2;

/**
 *
 * @author ariel
 */
public class CuentaBancaria {
    public int num_cuenta;
    public String nombre;
    public float saldo;
    

    public CuentaBancaria(int num_cuenta, String nombre, float saldo) {
        this.num_cuenta = num_cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(float cantidad){
        this.saldo=this.saldo+cantidad;
    }
    public void retirar(float cantidad){
        if(cantidad>saldo){
           System.out.println("Error, el saldo es menor que la cantidad a retirar");
        }
        else{
        this.saldo=this.saldo-cantidad;
           System.out.println("EL saldo ahora es de: "+this.saldo);
        }
    }
    public float consultar(){
        return saldo;
    }
    
}
