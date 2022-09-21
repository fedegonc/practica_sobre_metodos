
package lista3.pkg1;

public class Contagem {
    
     public static void contar(){
            for(int i = 0 ; i <= 10; i++ ){
            
           System.out.print(i+ " ");
          
            }
          }
     
      public static void contar(int inicio){
            for(int i = inicio ; i <= 10; i++ ){
            
           System.out.print(i+ " ");
          
            }
          }
    
    public static void contar(int inicio, int fim){
            for(int i = inicio ; i <= fim; i++ ){
            
           System.out.print(i+ " ");
          
            }
          }
      
    
    public static void contar(int inicio, int fim, int pausa){
            for(int i = 1 ; i <= 10; i++ ){
            
           System.out.print(i+ " ");
           
            try{
                Thread.sleep(pausa * 1000);
            }catch (InterruptedException e){
                System.out.print("Erro");
            }
            }
          }
    
    

}


