/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testeoperacoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeAll;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

public class TesteOperacoesTest {
    
    Scanner lerTeclado = new Scanner(System.in);
    Scanner lerTeclado2 = new Scanner(System.in);
    
    int numeroDigitado1;
    int numeroDigitado2;
    
    public TesteOperacoesTest() {
        numeroDigitado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        numeroDigitado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
    }  

    @Test
    public void testMetodoAdicao() {
        
        TesteOperacoes operacoes = new TesteOperacoes();
        Assertions.assertEquals(15, operacoes.Adicao(numeroDigitado1, numeroDigitado2));
    }  
    
    @Test
    public void testMetodoSubtracao() {
        
        TesteOperacoes operacoes = new TesteOperacoes();
        Assertions.assertEquals(5, operacoes.Subtracao(numeroDigitado1, numeroDigitado2));
    }  
    
    @Test
    public void testMetodoDivisao() {
        
        TesteOperacoes operacoes = new TesteOperacoes();
        Assertions.assertEquals(2, operacoes.Divisao(numeroDigitado1, numeroDigitado2));
    }  
    
    @Test
    public void testMetodoMultiplicacao() {
        
        TesteOperacoes operacoes = new TesteOperacoes();
        Assertions.assertEquals(50, operacoes.Multiplicacao(numeroDigitado1, numeroDigitado2));
    }  
}
