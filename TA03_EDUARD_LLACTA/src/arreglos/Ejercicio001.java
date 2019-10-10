
package arreglos;
import java.util.Scanner;

public class Ejercicio001 {
    
    public static void main(String[] args) {
        
        //DECLARANDO LOS COLORES EN LA LISTA EN EL RESULTADO FINAL
        String verde = "\033[32m";
        String morado = "\033[35m";
    
       
        // declarando y inicializando el arreglo
        int [] numero = new int [100];
        
        
        //utilisando la esctructura de control for
        // donde inicializamos en cero y que sea menor a 100, incrementando en uno
        for (int i = 0;i<100; i++){
            numero[i] = (int)(Math.random()*21);
            //mostrando la lista delos numeros en pantalla
            System.out.print(numero[i]+"  ");
        }
        System.out.println("****************************************");
        System.out.println("*****************************************");
        
        
        // delcarando la clase escaner
        Scanner teclado = new Scanner(System.in);
        
        //pidiendo al usuario que introduzca por panttalla un valor
        System.out.print("ESCRIBE UN NUMERO QUE SE MOSTRO POR LA PANTALLA: ");
        int a = teclado.nextInt();
        System.out.print("ESCRIBE OTRO NUMERO POR QUE LO VA A SUSTITUIR: ");
        int b = teclado.nextInt();
        
        // utlizando la esctructura de control
        for(int i = 0;i<100;i++){
            // utilizando la sentencia if - else
            if(numero[i]==a){
                numero[i]=b;
                System.out.print(verde + "\"" + numero[i] + "\"  ");                
            }
            else{
                System.out.print(morado + numero[i] + "  ");
            }            
        } 
        System.out.println();
    }    
}
