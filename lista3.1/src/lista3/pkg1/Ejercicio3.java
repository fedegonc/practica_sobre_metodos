
package lista3.pkg1;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        int resultado;
        
       int opcion = 0;
        
        while(opcion!= 9){
            opcion = menu();
            switch(opcion){
                case 1:
                    System.out.println("informe un numero");
                    numero = new Scanner(System.in).nextInt();
                     resultado = Matematica.dobro(numero);
                    String2.imprime(resultado);
                    break;
                    
                case 2:
                    System.out.println("informe un numero");
                    numero = new Scanner(System.in).nextInt();
                    resultado = Matematica.triplo(numero);
                    String2.imprime(resultado);
                    break;
                
                case 3:
                    System.out.println("informe un numero");
                    numero = new Scanner(System.in).nextInt();
                    System.out.println("informe otro numero");
                    int numero2 = new Scanner(System.in).nextInt();
                    resultado = Matematica.multiplicacion(numero, numero2);
                    String2.imprime(resultado);
                    break;
                
                case 4:
                    System.out.println("informe un numero");
                    numero = new Scanner(System.in).nextInt();
                    System.out.println("informe otro numero");
                    int numero3 = new Scanner(System.in).nextInt();
                    resultado = Matematica.potencia(numero, numero3);
                    String2.imprime(resultado);
                    break;
                    
                case 5:
                    System.out.println("Digite una palabra");
                    String palabra = new Scanner(System.in).next();
                    palabra = String2.mayusculas(palabra);
                    String2.imprime(palabra);
                    break;
                    
                case 6:
                    System.out.println("Digite una frase");
                    String palabra2 = new Scanner(System.in).next();
                    System.out.println("Digite una palabra");
                    String palabrax = new Scanner(System.in).next();
                    
                    boolean pertence = String2.pertenece(palabra2, palabrax);
                    if (pertence == true)
                        String2.imprime("La palabra esta incluida en la frase");
                    else
                        String2.imprime("La palabra no esta incluida en la frase");
                    break;
                
                case 9:  
                    String2.imprime("EL programa a finalizado");
                
            }
        }
        
    }
    
    public static int menu() {
        System.out.println("bem vindo");  
        System.out.println("1 - dobro");
        System.out.println("2 - triple");
        System.out.println("3 - multi");
        System.out.println("4 - potencia");
        System.out.println("5 - mayusculas");
        System.out.println("6 - pertenece");
        System.out.println("9 - sair ");
        
        int opcion = new Scanner(System.in).nextInt();
        
        return opcion;
}
    
    
    
}

