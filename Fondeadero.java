package ar.unlam.pb2.src;

import java.util.ArrayList;

import org.junit.internal.runners.model.EachTestNotifier;

public class Fondeadero {

	private Integer cantidadMaximaDeAmarras;
	private Yate yate;
	private ArrayList<Yate>yatesAmarradosDelFondeadero = new ArrayList<Yate>();
	private Integer cantidadDeAmarrasDelFondeadero = 0;
	
	public Fondeadero() {
		this.cantidadMaximaDeAmarras = cantidadMaximaDeAmarras;
	}

	public Integer getCantidadMaximaDeAmarras() {
		return cantidadMaximaDeAmarras;
	}

	public void setCantidadMaximaDeAmarras(Integer cantidadMaximaDeAmarras) {
		this.cantidadMaximaDeAmarras = cantidadMaximaDeAmarras;
	}
	
	public Boolean amarrarYate(Yate yate) {
		if(yate.getEstaAmarrado() == false) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean desamarrarYate(Yate yate) {
		if(yate.getEstaAmarrado() == true) {
			yate.setEstaAmarrado(false);
			return true;
		} else {
			return false;
		}
	}
	
	//obtenerCantidadDeYatesAmarrados: devuelve el total de amarras ocupadas.

	public void agregarYate(Yate nuevo) {
		this.yatesAmarradosDelFondeadero.add(nuevo);
	}
	
	public Integer obtenerCantidadDeYatesAmarrados() {
			for (Yate yate : yatesAmarradosDelFondeadero) {
				if(yate.getEstaAmarrado()==true) {
					this.cantidadDeAmarrasDelFondeadero++;
				}
			}
			return cantidadDeAmarrasDelFondeadero;
	}

	//obtenerRecaudacionTotal: devuelve el total recaudado por la ocupación de amarras actual
	/*public Double obtenerRecaudacionTotalDeLasAmarras() {
        Double valorFinal = 0.0;
        for(Yate a : amarras) {
            valorFinal += a.calcularCostoMensual();
        }
        return valorFinal;
    }*/
	public Double obtenerRecaudacionTotal() {
		
		Double recaudacionTotal = 0.0;

		for (Yate yate : yatesAmarradosDelFondeadero) {
			
			recaudacionTotal += obtenerPrecioDeAmarre(yate);
			
		}
		return recaudacionTotal;
	
	}	
	
	public Double obtenerPrecioDeAmarre(Yate yate2) {
		return yate2.obtenerPrecioDeAmarre();
	}

	public void vaciarElFondeadero() {
		yatesAmarradosDelFondeadero.removeAll(yatesAmarradosDelFondeadero);
	}
	
	
}
