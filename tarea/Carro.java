package tarea;

public class Carro extends Vehiculo {
private int NumeroDePuertas; 
private boolean EsAutomatico;
private boolean TieneTurbo;

	public Carro(String marca, String NumeroDeSerie, double VelocidadTope, boolean TieneSeisVelocidades,
			boolean TieneCincoVelocidades,int NumeroDePuertas,boolean EsAutomatico, boolean TieneTurbo) {
		super(marca, NumeroDeSerie, VelocidadTope, TieneSeisVelocidades, TieneCincoVelocidades);
		this.NumeroDePuertas = NumeroDePuertas;
		this.EsAutomatico = EsAutomatico;
		this.TieneTurbo = TieneTurbo;
		 
	}
	public void cambio() {
		System.out.println("Usted desea cambiar su auto por un Nissan 350Z");
	}

}
