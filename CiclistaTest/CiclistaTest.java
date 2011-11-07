import static org.junit.Assert.*;

import org.junit.Test;


public class CiclistaTest {
	
	@Test
	public void deveCalcularMediaDistanciaPorTempo () {
		double media = Ciclista.calcularVelocidadeMedia(10.0, 1.0);
		assertEquals( 10.0, media, 0);
	}
	
	@Test(expected = CiclistaException.class)
	public void deveLancarExecaoCasoValorDigitadoSeja0 () throws CiclistaException {
		Ciclista.validaValoresDeEntrada(0.0);
	}
	
	@Test
	public void deveConverte650MetrosPara065Kilometros (){
		double distancia = Ciclista.converteMetrosParaKilometros(2, 650);
		assertEquals(0.65, distancia, 0);
	}
	
	@Test
	public void deveRetornar890Kilometros (){
		double distancia = Ciclista.converteMetrosParaKilometros(1, 890);
		assertEquals(890, distancia, 0);
	}
	
	@Test
	public void deveConverter380MinutosPara6HorasE333333333333333Minutos (){
		double tempo = Ciclista.converteMinutosOuSegundosParaHoras(2, 380);
		assertEquals(6.333333333333333, tempo, 0);
	}
	
	@Test
	public void deveConverter380SegundoPara0HorasE1055555555555556Minutos (){
		double tempo = Ciclista.converteMinutosOuSegundosParaHoras(3, 380);
		assertEquals(0.10555555555555556, tempo, 0);
	}
	
	@Test
	public void deveRetornar380Horas (){
		double tempo = Ciclista.converteMinutosOuSegundosParaHoras(1, 380);
		assertEquals(380, tempo, 0);
	}
	
	@Test
	public void deveConverteKilometrosPorHoraParaMetrosPorSegundo (){
		double metrosPorSegundo = Ciclista.converteKilometrosPorHoraParaMetrosPorSegundo(380);
		assertEquals(105.55555555555556, metrosPorSegundo , 0);
	}
	

}
