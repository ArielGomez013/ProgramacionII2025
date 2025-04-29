/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author ariel
 */
public class Calculadora {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int sumar(){
        return num1+num2;
    }
    public int resta(){
        return num1-num2;
    }
    public int multiplicacion(){
        return num1*num2;
    }
    public int division(){
         return num1/num2;
    }
}

    