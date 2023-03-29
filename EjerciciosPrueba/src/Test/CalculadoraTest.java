package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class CalculadoraTest {
	static Calculadora calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc = new Calculadora();
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testSumar() {
		assertEquals("Prueba Sumar", 11, calc.sumar(3, 8), 0);
	}

	@Test
	void testRestar() {
		assertEquals("Prueba Restar", 5, calc.restar(8, 3), 0);
	}

	@Test
	void testMultiplicar() {
		assertEquals("Prueba Multiplicar", 9, calc.multiplicar(3, 3), 0);
	}

	@Test
	void testDividir() {
		assertEquals("Prueba Dividir", 5, calc.dividir(15, 3), 0);
	}

}
