/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5p1_tatianagarcia;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author tatig
 */
public class Lab5P1_TatianaGarcia {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;
        while (op != 0) {
            System.out.println("-------[ MENU ]--------\n");
            System.out.println("0. Salir");
            System.out.println("1. Ahorcado");
            System.out.println("2. Vectores");
            System.out.println("3. Kaprekar");

            System.out.println("Ingrese su eleccion: ");
            op = leer.nextInt();
            if (op == 1) {
                System.out.println("Ingrese la dificultad del juego (1. Facil, 2. Dificil): ");
                int dificultad = leer.nextInt();
                if (dificultad < 1 || dificultad > 2) {
                    System.out.println("No es una opcion valida");
                } else {
                    if (dificultad == 1) {
                        Ahorcado1();
                    }else{
                        Ahorcado2();
                    }

                }

            } else if (op == 2) {

            } else if (op == 3) {

            } else {
                System.out.println("No es una opcion valida");
            }

        }
    }

    public static void Ahorcado1() {
        SecureRandom random = new SecureRandom();

        int r, vidas;
        String palabra = "";

        String[] palarasFacil = {"hangman", "scanner", "validar", "ceviche", "strings", "3arrays",
            "algebra", "program", "calculo", "chatgpt", "pokemon", "strokes", "11yonce"};

        r = random.nextInt(7);
        vidas = 8;
        palabra = palarasFacil[r];
        
        String [] palabras = {"_", "_", "_", "_", "_", "_","_"};
        boolean win = false; 
        int cont = 0; 
        while(vidas>0&&win==false){
            System.out.println("Vidas: "+vidas);
            System.out.print("Progreso: ");
            for (int i = 0; i < palabras.length; i++) {
                System.out.print(palabras[i]+" ");
            }
            System.out.println("\nIngrese un caracter: ");
            char c = leer.next().charAt(0);
            boolean found = false; 
            int con1 = 0; 
            for (int i = 0; i < palabras.length; i++) {
                char c2 = palabra.charAt(i);
                if (c2==c) {
                    palabras[i]=c+"";
                    found = true;
                    con1++;
                }
            }
            if (!found) {
                vidas--;
                System.out.println(c+" no es parte de la cadena");
            }
            else{
                System.out.println(c+" es parte de la cadena");
                cont+=con1;
            }
            System.out.println("->"+cont);
            if (cont>=7) {
                System.out.println("Felicidades, ganaste esta ronda en modo facil");
                break;
            }
        }
        

    }

    public static void Ahorcado2() {
        SecureRandom random = new SecureRandom();

        int r, vidas;
        String palabra = "";
        String[] palabrasDificil = {"abc123bac321", "crabominable", "siguatepeque", "cadenascon12",
            "hollowknight", "thebattlecat", "ventiladores", "programacion", "eloteconatol", "alvaritodiaz"};
        r = random.nextInt(12);
        vidas = 10;
        palabra = palabrasDificil[r];
        
        String [] palabras = {"_", "_", "_", "_", "_", "_","_","_","_","_","_","_"};
        boolean win = false; 
        int cont = 0; 
        while(vidas>0&&win==false){
            System.out.println("Vidas: "+vidas);
            System.out.print("Progreso: ");
            for (int i = 0; i < palabras.length; i++) {
                System.out.print(palabras[i]+" ");
            }
            System.out.println("\nIngrese un caracter: ");
            char c = leer.next().charAt(0);
            boolean found = false; 
            int con1 = 0; 
            for (int i = 0; i < palabras.length; i++) {
                char c2 = palabra.charAt(i);
                if (c2==c) {
                    palabras[i]=c+"";
                    found = true;
                    con1++;
                }
            }
            if (!found) {
                vidas--;
                System.out.println(c+" no es parte de la cadena");
            }
            else{
                System.out.println(c+" es parte de la cadena");
                cont+=con1;
            }
            System.out.println("->"+cont);
            if (cont>=12) {
                System.out.println("Felicidades, ganaste esta ronda en modo facil");
                break;
            }
        }
    }

}
