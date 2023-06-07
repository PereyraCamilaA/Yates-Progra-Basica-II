package ar.unlam.pb2.src;

public class Vela extends Yate{
	
	private Double alturaDelMastilEnMetros;
	private Integer superficieVelicaMayorEnMetrosCuadrados;
	private Integer superficieTotalEnMetrosCuadrados;
	
	public Vela() {
		super();
		this.nombre = "XXR";
		this.duenio = "Sebastian Pardo";
		this.mangaAncho = 6.90;
		this.calado = 2.7;
		this.esloraLargo = 13.45;
		this.tripulacion = 5;
		this.pesoEnKilos = 1400.0;
		this.alturaDelMastilEnMetros = 21.5;
		this.superficieVelicaMayorEnMetrosCuadrados = 85;
		this.superficieTotalEnMetrosCuadrados = 133;
		this.valorMensualDeLaAmarra = 90000.0;
		this.valorMensualDeLaEslora = 2000.0;
	}

	public Double getAlturaDelMastilEnMetros() {
		return alturaDelMastilEnMetros;
	}

	public void setAlturaDelMastilEnMetros(Double alturaDelMastilEnMetros) {
		this.alturaDelMastilEnMetros = alturaDelMastilEnMetros;
	}

	public Integer getSuperficieVelicaMayorEnMetrosCuadrados() {
		return superficieVelicaMayorEnMetrosCuadrados;
	}

	public void setSuperficieVelicaMayorEnMetrosCuadrados(Integer superficieVelicaMayorEnMetrosCuadrados) {
		this.superficieVelicaMayorEnMetrosCuadrados = superficieVelicaMayorEnMetrosCuadrados;
	}

	public Integer getSuperficieTotalEnMetrosCuadrados() {
		return superficieTotalEnMetrosCuadrados;
	}

	public void setSuperficieTotalEnMetrosCuadrados(Integer superficieTotalEnMetrosCuadrados) {
		this.superficieTotalEnMetrosCuadrados = superficieTotalEnMetrosCuadrados;
	}
	
}
