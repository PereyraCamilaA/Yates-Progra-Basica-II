package ar.unlam.pb2.src;

public class Motor extends Yate{

	private Integer desplazamiento;
	private String propulsion;
	private Integer potenciaEnKw;
	private Integer velocidadEnNudos;
	private Integer autonomiaEnMn; 
	
	public Motor() {
		super();
		this.nombre = "AZ1";
		this.duenio = "Andres Borgeat";
		this.mangaAncho = 18.87;
		this.calado = 5.15;
		this.esloraLargo = 119.0;
		this.tripulacion = 37;
		this.pesoEnKilos = 5500.0;
		this.desplazamiento = 5959;
		this.propulsion = "2 × motores diesel MAN RK2805";
		this.potenciaEnKw = 9000;
		this.velocidadEnNudos = 23;
		this.autonomiaEnMn = 6500;
		this.valorMensualDeLaAmarra = 10000.0;
		this.valorMensualDeLaEslora = 3000.0;
	}

	public Integer getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(Integer desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

	public String getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}

	public Integer getPotenciaEnKw() {
		return potenciaEnKw;
	}

	public void setPotenciaEnKw(Integer potenciaEnKw) {
		this.potenciaEnKw = potenciaEnKw;
	}

	public Integer getVelocidadEnNudos() {
		return velocidadEnNudos;
	}

	public void setVelocidadEnNudos(Integer velocidadEnNudos) {
		this.velocidadEnNudos = velocidadEnNudos;
	}

	public Integer getAutonomiaEnMn() {
		return autonomiaEnMn;
	}

	public void setAutonomiaEnMn(Integer autonomiaEnMn) {
		this.autonomiaEnMn = autonomiaEnMn;
	}
	
	
}
