package com.iterasys;

public class Main {
    public static void main(String[] args) {
       Main.diviDirTry(20, 0);
       // System.out.println(Main.somar(20, 0));

    }

    public static float somar(float num1, float num2){
        float soma = num1+num2;     
        System.out.println("Soma de: " + num1 + " + " + num2 + " = " + soma);
        return soma; 
    }

    public static float subtrair(float num1, float num2){
        float resultado = num1-num2; 
        System.out.println("Subtração de: " + num1 + " + " + num2 + " = " + resultado);
        return resultado; 
    }

    public static float multiplicacao(float num1, float num2){
        float resultado = num1*num2; 
        System.out.println("Subtração de: " + num1 + " + " + num2 + " = " + resultado);
        return resultado; 
    }

    public static float dividir(float num1, float num2){
        float resultado = 0;
        if(num2 !=0){
            resultado = num1/num2; 
            System.out.println("Divisao de: " + num1 + " + " + num2 + " = " + resultado);          
        }else{
            System.out.println("Não é possível divisão por zero!");
        }
        return resultado;
    }

    public static String diviDirTry(int num1, int num2){
        try {
            return String.valueOf(num1 /num2);
        } catch (Exception e) {
            System.out.println("levandou uma exception çé");
            return "Não é possível divisão por zero!";
        }
    }


}