/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabillon_cristina_tarea_2;
import java.util.Scanner;
/**
 *
 * @author Laura Sabillon
 */
public class Sabillon_Cristina_Tarea_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        int renglones = 0;
    
        while (true){
            //MENU
            System.out.println("\n --------------------------------------------------------------- ");
            System.out.println("|                 ***** MENU *****                             |");
            System.out.println(" --------------------------------------------------------------");
            System.out.println("| a.- El ingreso de una palabra e imprimir de manera diagonal. |");
            System.out.println("| b.- Piramide de numero.                                      | ");
            System.out.println("| c.- Listado de Palindromo y No.                              |");
            System.out.println("| d.- Salir del Sistema                                        |");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Favor ingresar la letra de la ventana a la que desea acceder.");
            String ventana = scan.next().toLowerCase();

            //RESTRICCION
            while (!(ventana.equals("a") || ventana.equals("b") || ventana.equals("c") || ventana.equals("d"))) {
                    System.out.println("ERROR. INGRESO INVALIDO. Intente de nuevo");
                     ventana = scan.next().toLowerCase();
                }        

            // ** VENTANA A **
            if (ventana.equals("a")){
                
                //EJERCICIO DIAGONAL
                System.out.println("\nImprimir de manera diagonal.");
                String palabra = "";
                char diagonal = 0;

                System.out.println("Ingrese una palabra: ");
                palabra = scan.next().toUpperCase();

                for (int index = 0; index < palabra.length(); index++) {
                    diagonal = palabra.charAt(index);
                    for (int espacio = 0; espacio < index; espacio++) {
                        System.out.print(" ");
                    }
                    System.out.println(diagonal);
                }

                for (int index = palabra.length() - 1; index >= 0; index--) {
                    diagonal = palabra.charAt(index);                    
                    for (int espacio = 0; espacio < index; espacio++) {
                        System.out.print(" ");
                    }
                    System.out.println(diagonal);
                }            
            }

            // ** VENTANA B **
            if(ventana.equals("b")){
                
                //PIRAMIDE DE NUMEROS INVERSA
                System.out.println("\nPiramide de Numeros.");
                System.out.println("Ingrese el numero de renglones:");
                renglones = scan.nextInt();

                while( renglones <= 0){
                    System.out.println("No se vale el ingreso de 0 o numeros negativos. Intente de nuevo.");
                    renglones = scan.nextInt();
                }

                for (int columna = 1; columna <= renglones; columna++) {
                    for (int espacio = 1; espacio < columna; espacio++) {
                        System.out.print("  ");
                    }
                    for (int numero = columna; numero <= renglones; numero++) {
                        System.out.print(numero + " ");
                    }
                    for (int numero = renglones - 1; numero >= columna; numero--) {
                        System.out.print(numero + " ");
                    }
                    System.out.println();
                }
            }

            // ** VENTANA C **
            if (ventana.equals("c")){
                
                //PALINDROMA, NO PALINDROMA
                System.out.println("\nLista de Palindroma y No Palindroma");
                String palabras = "", palabra_alreves = "", non, save = "", une = "";
                int cantidad, contador = 0, numero = 0, num = 0;

                System.out.println("Ingresar la cantidad de palabras: ");
                cantidad = scan.nextInt();

                while (cantidad <= 0){
                    System.out.println("No se vale el ingreso de 0 o numeros negativos. Intente de nuevo.");
                    cantidad = scan.nextInt();
                }

                while(contador < cantidad){

                    palabra_alreves = "";
                    contador++;
                    System.out.print("Palabra # " + contador + ": ");
                    palabras = scan.next().toLowerCase();

                    for ( int i = palabras.length()-1; i>=0 ; i--){
                        palabra_alreves += palabras.charAt(i);
                        }

                    if (palabras.equals(palabra_alreves)){
                        numero++;
                        save +=numero + ".- " + palabra_alreves + "\n";
                    }else{
                        num++;
                        non = palabras;
                        une += num + ".- " + non + " \n";        
                    }
                }
                System.out.println("\nPalindroma: ");
                System.out.println(save);
                System.out.println("No Palindroma: ");
                System.out.println(une);
            }

            //SALIR DEL SISTEMA
            if (ventana.equals("d")){
                System.out.println("Saliendo del Sistema....");
                System.exit(0);
            }
        }
    }
}
