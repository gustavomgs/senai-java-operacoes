package sp.senai.br.calculomedia;

import java.util.Scanner;

public class Operacoes {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static double soma(double valor1, double valor2){
        return valor1 + valor2;
    }
    
    public static double max(double[] vetor){
        
        double max = 0;
        
        for(int i = 0; i < vetor.length; i ++){
            
            if(vetor[i] > max){
                max = vetor[i];
            }
            
        }
        
        return max;
    }
    
    public static double min(double[] vetor){
        
        double min = vetor[0];
        
        for(int i = 0; i < vetor.length; i ++){

            if(vetor[i] < min && vetor[i] != 0){
                min = vetor[i];
            }
            
        }
        
        return min;
    }
    
    public static double media(double[] vetor){
        
        double soma = 0;
        
        for(int i = 0; i < vetor.length; i++){
            // soma = soma + vetor[i];

            soma += vetor[i];          
        }
        
        return soma / vetor.length;
    }
}
