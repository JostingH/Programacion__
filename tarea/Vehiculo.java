package tarea;

public class Vehiculo {
	
	private String marca;
	private String NumeroDeSerie;
	private double Velocidadtope;
	private boolean TieneSeisVelocidades;
	private boolean TieneCincoVelocidades;
	public Vehiculo (String marca,String NumeroDeSerie, double VelocidadTope, boolean TieneSeisVelocidades,boolean TieneCincoVelocidades) {
		this.marca= marca;
		this.NumeroDeSerie = NumeroDeSerie;
		this.Velocidadtope = Velocidadtope;
		this.TieneCincoVelocidades = TieneCincoVelocidades;
		this.TieneSeisVelocidades =TieneSeisVelocidades;
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNumeroDeSerie() {
		return NumeroDeSerie;
	}
	public void setNumeroDeSerie(String numeroDeSerie) {
		NumeroDeSerie = numeroDeSerie;
	}
	public double getVelocidadtope() {
		return Velocidadtope;
	}
	public void setVelocidadtope(double velocidadtope) {
		Velocidadtope = velocidadtope;
	}
	public boolean isTieneSeisVelocidades() {
		return TieneSeisVelocidades;
	}
	public void setTieneSeisVelocidades(boolean tieneSeisVelocidades) {
		TieneSeisVelocidades = tieneSeisVelocidades;
	}
	public boolean isTieneCincoVelocidades() {
		return TieneCincoVelocidades;
	}
	public void setTieneCincoVelocidades(boolean tieneCincoVelocidades) {
		TieneCincoVelocidades = tieneCincoVelocidades;
	}
	

}
