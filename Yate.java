package ar.unlam.pb2.src;

public abstract class Yate {

	protected String nombre;
	protected String duenio;
	protected Double mangaAncho;
	protected Double calado;
	protected Double esloraLargo;
	protected Integer tripulacion;
	protected Double pesoEnKilos;
	protected Boolean estaAmarrado;
	protected Double valorMensualDeLaAmarra;
	protected Double valorMensualDeLaEslora;
	
	public Yate() {
		this.nombre = nombre;
		this.duenio = duenio;
		this.mangaAncho = mangaAncho;
		this.calado = calado;
		this.esloraLargo = esloraLargo;
		this.tripulacion = tripulacion;
		this.pesoEnKilos = pesoEnKilos;
		this.estaAmarrado = false;
		this.valorMensualDeLaAmarra = valorMensualDeLaAmarra;
		this.valorMensualDeLaEslora = valorMensualDeLaEslora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public Double getMangaAncho() {
		return mangaAncho;
	}

	public void setMangaAncho(Double mangaAncho) {
		this.mangaAncho = mangaAncho;
	}

	public Double getCalado() {
		return calado;
	}

	public void setCalado(Double calado) {
		this.calado = calado;
	}

	public Double getEsloraLargo() {
		return esloraLargo;
	}

	public void setEsloraLargo(Double esloraLargo) {
		this.esloraLargo = esloraLargo;
	}

	public Integer getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}

	public Double getPesoEnKilos() {
		return pesoEnKilos;
	}

	public void setPesoEnKilos(Double pesoEnKilos) {
		this.pesoEnKilos = pesoEnKilos;
	}

	public Boolean getEstaAmarrado() {
		return estaAmarrado;
	}

	public void setEstaAmarrado(Boolean estaAmarrado) {
		this.estaAmarrado = estaAmarrado;
	}

	public Double getValorMensualDeLaAmarra() {
		return valorMensualDeLaAmarra;
	}

	public void setValorMensualDeLaAmarra(Double valorDeLaAmarra) {
		this.valorMensualDeLaAmarra = valorDeLaAmarra;
	}

	public Double getValorMensualDeLaEslora() {
		return valorMensualDeLaEslora;
	}

	public void setValorDeLaEslora(Double valorDeLaEslora) {
		this.valorMensualDeLaEslora = valorDeLaEslora;
	}
	
	public Double obtenerPrecioDeAmarre() {
		
		Double precioDelAmarre = 0.0; 
		
		if(getEstaAmarrado()==true) {
			precioDelAmarre = getValorMensualDeLaAmarra() + getValorMensualDeLaEslora();
			return precioDelAmarre;
		}
		return precioDelAmarre;
	}
	
	
}
