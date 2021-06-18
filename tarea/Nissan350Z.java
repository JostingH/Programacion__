package tarea;

public class Nissan350Z extends Carro {
	
	private String color;
	private int numerodeacientos; 

	public Nissan350Z(String marca, String NumeroDeSerie, double VelocidadTope, boolean TieneSeisVelocidades,
			boolean TieneCincoVelocidades, int NumeroDePuertas, boolean EsAutomatico, boolean TieneTurbo,
			String color, int numerodeacientos) {
		super(marca, NumeroDeSerie, VelocidadTope, TieneSeisVelocidades, TieneCincoVelocidades, NumeroDePuertas, EsAutomatico,
				TieneTurbo);
		this.color = color;
		this.numerodeacientos = numerodeacientos;
		
		
	}
	public void manejo() {
		System.out.println("Usted se subio al auto ");
		System.out.println("Usted esta manejando el Nissan");
		}	
	public void Neutro() {
		System.out.println("El auto esta en neutro");

	}
	public void Pisarembrage() {
		System.out.println("Usted ha pisado el embrage");
	}
	public void Primera() {
		System.out.println("Usted ha puesto el cambio 1.");
	}
	
	public void Segunda() {
		System.out.println("Usted ha puesto el cambio 2.");
	}
	public void tercera() {
		System.out.println("Usted ha puesto el cambio 3.");
	}
	public void cuarta() {
		System.out.println("Usted ha puesto el cambio 4.");
	}
	public void quinta() {
		System.out.println("Usted ha puesto el cambio 5.");
	}
	public void retroseso() {
		System.out.println("Usted ha puesto el cambio Retroseso.");
	}
	
	public void acelerar() {
		System.out.println("Usted esta acelerando");
	}
	public void Frenar() {
		System.out.println("Usted esta frenando");
	}
	
	
	
	
	public void giroizquierdo(double gradodegiroI) {
		System.out.println(" Usted esta girando ala izquierda");
		System.out.println("Usted giro el volante "+gradodegiroI+ " grados " );
	}
	public void giroderecho(double gradodegiroD) {
		System.out.println(" Usted esta girando ala Derecha");
		System.out.println("Usted giro el volante "+gradodegiroD+ " grados " );
	}

}
