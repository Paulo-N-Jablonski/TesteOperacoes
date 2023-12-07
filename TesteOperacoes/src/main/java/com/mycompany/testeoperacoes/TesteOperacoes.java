package com.mycompany.testeoperacoes;

import java.util.Scanner;

public class TesteOperacoes {
    
    public int Adicao(int numero1, int numero2) {
        int soma = numero1 + numero2;
        return soma;
    }
    
    public int Subtracao(int numero1, int numero2){
        
        int subtracao = numero1 - numero2;
        return subtracao;
    }

    public int Divisao(int numero1, int numero2){
        int divisao = numero1 / numero2;
        return divisao;
    }
    
    public int Multiplicacao(int numero1, int numero2){
        
        int multiplicacao = numero1 * numero2;
        return multiplicacao;
    }
    
    public static void main(String[] args) {
        
        TesteOperacoes teste = new TesteOperacoes();
        
        Scanner lerTeclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int numeroDigitado1 = lerTeclado.nextInt();
        System.out.println("Digite o segundo número");
        int numeroDigitado2 = lerTeclado.nextInt();
        
        teste.Adicao(numeroDigitado1, numeroDigitado2);
        teste.Subtracao(numeroDigitado1, numeroDigitado2);
        teste.Divisao(numeroDigitado1, numeroDigitado2);
        teste.Multiplicacao(numeroDigitado1, numeroDigitado2);
    }
}
