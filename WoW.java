package com.mycompany.misproyectos;

import java.util.Scanner;

public class WoW {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Introduce una palabra (STOP para acabar el programa)");
        String entrada = scan.nextLine();
        boolean isName = false;

        while(!entrada.equalsIgnoreCase("STOP")){
            for (int i = 0; i < entrada.length(); i++) {
                if(entrada.charAt(i) != entrada.charAt(0)){
                    isName = true;
                }
            }
            if(isName){
                System.out.println(entrada + "SI");
            }else{
                System.out.println(entrada + "NO");   
            }
            System.out.println("Introduce una palabra (STOP para acabar el programa)");
            entrada = scan.nextLine();
            isName = false;
        }
        System.out.println("Programa cerrado");
    }   
}
