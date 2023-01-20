package array_02;

import java.util.Arrays;

public class App {
    public static void main(String[] args){
        int[] numeros = {30,20,10,50,40};
        int[] num = new int[5];
        

        // Arrays.sort(numeros);
        // Arrays.fill(num, 5);
        // System.arraycopy(numeros, 0, num, 0, 5);
        // Arrays.equals(numeros, num);

        // if(Arrays.equals(numeros, num)){
        //     System.out.println("Os arrays são iguais");
        // }else{
        //     System.out.println("Os arrays são diferentes");
        // }

        Arrays.sort(numeros);
        int numPesquisa = 30;

        if( Arrays.binarySearch(numeros, numPesquisa) > 0){
            System.out.printf(" %d está no array\n", numPesquisa);
        }else{
            System.out.printf(" %d NÃO está no array\n", numPesquisa);
        }

        // fill especificado
        // int[] vetor = {10,20,30,40,50};
        // Arrays.fill(vetor,0,2, 999);
        // for (int i : vetor) {
        //         System.out.println(i);
        // }






        // for (int i : num) {
        //     System.out.printf("%d - ", i);
        // }
    }
}
