package teste_calculadora_java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculadora_teste {

	@Test
	void testSomar() {
	    Calculadora calculadora = new Calculadora();
	    double resultado = calculadora.soma(6, 6);
	    double esperado = 12;
	    assertEquals(esperado, resultado, 0);
	}

	@Test
	void testSubtrair() {
	    Calculadora calculadora = new Calculadora();
	    double resultado = calculadora.subtrair(6, 6);
	    double esperado = 0;
	    assertEquals(esperado, resultado, 0);
	}

	@Test
	void testMultiplicar() {
	    Calculadora calculadora = new Calculadora();
	    double resultado = calculadora.multiplicar(7, 7);
	    double esperado = 49;
	    assertEquals(esperado, resultado, 0);
	}

	@Test
	void testDividir() {
	    Calculadora calculadora = new Calculadora();
	    double resultado = calculadora.dividir(10, 2);
	    double esperado = 5;
	    assertEquals(esperado, resultado, 0);
	}

	@Test
	void testPotenciar() {
	    Calculadora calculadora = new Calculadora();
	    double resultado = calculadora.potenciar(2, 3);
	    double esperado = 8;
	    assertEquals(esperado, resultado, 0);
	}

}
