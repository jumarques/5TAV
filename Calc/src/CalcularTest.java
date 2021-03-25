import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcularTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void TestarMultiplicarNormal() {
		Calcular calc = new Calcular();
		double x = 92;
		double result = calc.multiplicar(23,4);
		assertEquals (x,result);
		
	}
	@Test
	public void TestarMultiplicarNumeroDecimal() {
		Calcular calc = new Calcular();
		double x = 94.4;
		double result = calc.multiplicar(23.6,4);
		assertEquals (x,result);
		
	}
	@Test
	public void TestarMultiplicarDecimalNegativo() {
		Calcular calc = new Calcular();
		double x = -101.48;
		double result = calc.multiplicar((-23.6),4.3);
		assertEquals (x,result);
		
	}
	@Test
	public void TestarDividirNormal()
	{
		Calcular calc = new Calcular();
		double x = 1 ;
		double result = calc.dividir(4,4);
		assertEquals (x,result);
	}
	@Test
	public void TestarDividirDecimal()
	{
		Calcular calc = new Calcular();
		double x = 9.2;
		double result = calc.dividir(18.4,2);
		assertEquals (x,result);
	}
	@Test
	public void TestarDividirDecimalNegativo()
	{
		Calcular calc = new Calcular();
		double x = -5.8125;
		double result = calc.dividir(18.6,(-3.2));
		assertEquals (x,result);
	}
	@Test
	public void TestarSubtrairNormalNegativo()
	{
		Calcular calc = new Calcular();
		double x = -24;
		double result = calc.subtrair((-20),4);
		assertEquals (x,result);
	}
	@Test
	public void TestarSubtrair2()
	{
		Calcular calc = new Calcular();
		double x = -43 ;
		double result = calc.subtrair(4,47);
		assertEquals (x,result);
	}
	@Test
	public void TestarSubtrair3()
	{
		Calcular calc = new Calcular();
		double x = 3;
		double result = calc.subtrair(50.6,47.6);
		assertEquals (x,result);
	}
	@Test
	public void TestarSubtrair4()
	{
		Calcular calc = new Calcular();
		double x = -42;
		double result = calc.subtrair(5.6,47.6);
		assertEquals (x,result);
	}
}