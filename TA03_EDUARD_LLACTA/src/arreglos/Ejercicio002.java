
package arreglos;
import java.util.Scanner;
public class Ejercicio002 {
    
    public static void main(String[] args) {
        // declarando y inicializando  la listas 
        int[] numero = new int[10];
        int[] resultado = new int [10];
        
        // declarando y inicializando las variables respectivas
        int contador = 0;
        int cont_lista = 0;
        int primo = 0;
        int prueba = 0;
                
        // creando la clase scanner
        Scanner teclado = new Scanner(System.in);
        
        // pidiendo al usuario 10 numero 
        System.out.println("ESCRIBE 10 NUMEROS: ");
        
        // UTILIZANDO LA ESTRUCTURA DE CONTROL 
        for(int i = 0 ; i<10;i++){
            numero[i] = teclado.nextInt();
        }
        
        System.out.println("**************************************************");
        System.out.println("Índice\tValor");
        // MOSTRANDO LA LISTA DE NUMEROS
        for(int i =0;i<10;i++){
             System.out.println(i + "\t" + numero[i]);           
        }
        
        // INDICANDO AL USUARIO QUE ESCRIBA EL INDICE DEL NUMERO               
        for(int i = 0;i<10;i++){
            do{
                primo++;
                prueba=numero[i]%primo;
                
                if(prueba==0){
                    contador++;
                }
                
            }while(primo!=numero[i]);
            
            if (contador!=2){
            resultado[cont_lista]=numero[i];
            contador++;
            }
            
            
        contador = 0;
        primo=0;
        
        }// final de for
        
        // ahora ponemos en la lista los que quedan
        
        for(int i =0;i<10;i++){
            do{
                primo++;
                prueba=numero[i]%primo;
                
                if(prueba==0){
                    contador++;                    
                }
                
            }
            while(primo!=numero[i]);
            
            if(contador==2){
                resultado[cont_lista]=numero[i];
                cont_lista++;
                
            }            
            
            contador=0;
            primo=0;
         }
        
        System.out.println("\nLista final");
        ////////////////////////
        System.out.println("Índice\tValor");
        //MOSTRANDO LA LISTA RESULTANTE
        for(int i =0;i<10;i++){
            System.out.println(i + "\t" + resultado[i]);
        }
    }    
}
