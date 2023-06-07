package ar.unlam.pb2.prueba;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.unlam.pb2.src.Fondeadero;
import ar.unlam.pb2.src.Motor;
import ar.unlam.pb2.src.Vela;
import ar.unlam.pb2.src.Yate;

public class pruebaDeYates {

	@Test
	public void queSePuedaCrearElFondeadero() {
		
		Fondeadero fondeadero = new Fondeadero();
		
		assertNotNull(fondeadero);
	}
	
	@Test
	public void queSePuedaCorroborarLaCantidadMaximaDeAmarrasDelFondeadero() {
		
		Fondeadero fondeadero = new Fondeadero();

		fondeadero.setCantidadMaximaDeAmarras(70);
		
		Integer cantidadEsperada = 70;
		
		assertEquals(fondeadero.getCantidadMaximaDeAmarras(), cantidadEsperada);
		
	}

	@Test
	public void queSePuedaAmarrarElYate() {
		
		Fondeadero fondeadero2 = new Fondeadero();
		
		Vela yateVela = new Vela();
		
		yateVela.setEstaAmarrado(false);
		
		Boolean resultadoObtenido = fondeadero2.amarrarYate(yateVela);
		
		Boolean resultadoEsperado = true;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
		
	}
	
	@Test
	public void queSePuedaDesamarrarElYate() {
		
		Fondeadero fondeadero3 = new Fondeadero();
		
		Motor yateMotor = new Motor();
		
		yateMotor.setEstaAmarrado(true);
		
		Boolean resultadoObtenido = fondeadero3.desamarrarYate(yateMotor);
		
		Boolean resultadoEsperado = true;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
		
	}
	
	@Test
	public void obtenerCantidadDeAmarras() {
		
		Fondeadero fondeadero4 = new Fondeadero();
		
		Motor yateMotor = new Motor();
		
		yateMotor.setEstaAmarrado(true);
		
		Motor yateMotor2 = new Motor();
		
		yateMotor2.setEstaAmarrado(true);
		
		Motor yateMotor3 = new Motor();
		
		yateMotor3.setEstaAmarrado(true);
		
		Motor yateMotor4 = new Motor();
		
		yateMotor4.setEstaAmarrado(true);
		
		fondeadero4.agregarYate(yateMotor);
		fondeadero4.agregarYate(yateMotor2);
		fondeadero4.agregarYate(yateMotor3);
		fondeadero4.agregarYate(yateMotor4);
		
		Integer resultadoObtenido = fondeadero4.obtenerCantidadDeYatesAmarrados();
		
		Integer resultadoEsperado = 4;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
		
	}
	
	@Test
	public void obtenerCantidadDeAmarrasLibresDelFondeadero() {
		
		//5. obtenerCantidadDeAmarrasDisponibles: devuelve el total de amarras libres.
		
		
		Fondeadero fondeadero5 = new Fondeadero();
		
		Motor yateMotor = new Motor();
		
		yateMotor.setEstaAmarrado(true);
		
		Motor yateMotor2 = new Motor();
		
		yateMotor2.setEstaAmarrado(true);
		
		Motor yateMotor3 = new Motor();
		
		yateMotor3.setEstaAmarrado(true);
		
		Motor yateMotor4 = new Motor();
		
		yateMotor4.setEstaAmarrado(true);
		
		fondeadero5.agregarYate(yateMotor);
		fondeadero5.agregarYate(yateMotor2);
		fondeadero5.agregarYate(yateMotor3);
		fondeadero5.agregarYate(yateMotor4);
		
		fondeadero5.setCantidadMaximaDeAmarras(70);
		
		Integer resultadoObtenido = (fondeadero5.getCantidadMaximaDeAmarras() - fondeadero5.obtenerCantidadDeYatesAmarrados());
		
		Integer resultadoEsperado = 66;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
		
	}
	
	@Test
	public void obtenerElValorMensualQueDebeAbonarEnPesosElDuenioDelFondeadero() {
		
		Fondeadero fondeadero6 = new Fondeadero();
		
		Motor yateMotor = new Motor();
		
		yateMotor.setEstaAmarrado(true);

		fondeadero6.agregarYate(yateMotor);
		
		Double resultadoObtenido = fondeadero6.obtenerPrecioDeAmarre(yateMotor);
		
		Double resultadoEsperado = 13000.0;
		
		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}
	
	//obtenerRecaudacionTotal: devuelve el total recaudado por la ocupación de amarras actual

	@Test
	public void queSeObtengaLaRecaudacionTotalDeAmarrasDelFondeadero() {
		
		Fondeadero fondeadero7 = new Fondeadero();
		
		fondeadero7.vaciarElFondeadero();
		
		Motor yateMotor = new Motor();
		
		yateMotor.setEstaAmarrado(true);
		
		Motor yateMotor2 = new Motor();
		
		yateMotor2.setEstaAmarrado(true);
		
		Vela yateVela = new Vela();
		
		yateVela.setEstaAmarrado(true);
		
		Vela yateVela2 = new Vela();
		
		yateVela2.setEstaAmarrado(true);
		
		fondeadero7.agregarYate(yateMotor);
		fondeadero7.agregarYate(yateMotor2);
		fondeadero7.agregarYate(yateVela);
		fondeadero7.agregarYate(yateVela2);
		
		Double resultadoObtenido = fondeadero7.obtenerRecaudacionTotal();
		
		Double resultadoEsperado = 26000.0 + 22000.0;
		
		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
		
	}
}
