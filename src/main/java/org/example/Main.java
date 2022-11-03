package org.example;

import org.example.models.Operacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        Scanner lector = new Scanner(System.in);
        int total=0;
        System.out.println("Ingresar el tipo de operacion a realizar (suma o resta)");
        operacion.setTipo(lector.nextLine());
        System.out.println("Ingrese primer valor ");
        operacion.setValor1(lector.nextInt());
        System.out.println("Ingrese segundo valor ");
        operacion.setValor2(lector.nextInt());
        switch (operacion.getTipo()){
            case "suma": {
                total = operacion.getValor1() + operacion.getValor2();
                break;
            }
            case "resta":{
                total = operacion.getValor1() - operacion.getValor2();
                break;
            }
        }
        System.out.println("Suma: "+total);
    }
}