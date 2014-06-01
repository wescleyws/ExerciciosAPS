import org.junit.Test;

import artigotdd.calculadora.teste.Calculadora;
import static org.junit.Assert.*;

/** * * @author Fabio Gomes Rocha */
public class TestCalculo { 
	public TestCalculo() { } 
	
@Test /** * * @Description Testa o método soma */ 
public void testSoma(){ System.out.println("Soma");
int a = 10;
int b = 20; 
int expResult = 30;
int result = Calculo.Soma(a, b);
assertEquals(expResult, result); } 

@Test /** * * @Description Testa o método subtração */ 
public void testSubtracao(){
	System.out.println("Subtração");
int a = 20; 
int b = 10;
int expResult = 10; 
int result = Calculo.Subtracao(a, b);
assertEquals(expResult, result); }

@Test /** * * @Description Testa o método multiplicação */
public void testMultiplicacao(){
	System.out.println("Multiplicação");
	int a = 5; int b = 10; 
	int expResult = 50;
	int result = Calculo.Multiplicacao(a, b);
	assertEquals(expResult, result); }

@Test /** * * @Description Testa o método divisão */
public void testDivisao(){ System.out.println("Divisão");
float a = 20; 
float b = 10;
float expResult = 2; 
float result = Calculo.Divisao(a, b); 
assertEquals(expResult, result,0); } 

@Test /** * * @Description Testa Porcentagem */
public void testPorcentagem(){
	System.out.println("Porcentagem");
	float a = 100;
	float b= 10;
	float expResult = 10;
	float result = Calculo.Porcentagem(a,b);
	assertEquals(expResult, result, 0);
	
}@Test 
public void somadoisvalores () throws Exception{
	int valorA = 1;
	int valorB = 2;
	Calculo calculadora = new Calculo(); 
	int soma = calculadora.soma(valorA, valorB);
	assertEquals(3, soma);			
	}

@Test public void subraivalores() throws Exception {
	Calculo calculadora = new Calculo();
	int valorA = 4; int valorB = 2; 
	int soma = calculadora.subtrai(valorA, valorB); 
	assertEquals(2, soma); }



}


