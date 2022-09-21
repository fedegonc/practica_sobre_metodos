
package lista3.pkg1;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,6,4,9};
        int retorno = (MeusArrays.buscar(array1, array2, 0));
        System.out.println(retorno);
        
        int[] array3 = (MeusArrays.generarArray(20));
        System.out.println(Arrays.toString(array3));
    }
}

