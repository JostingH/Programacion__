package tarea;

public class App {

	public static void main(String[] args) {
		Nissan350Z Nissan350Z = new Nissan350Z("Nissan","jdk15", 210.0,false, true, 2, false, true, "blanco",2 );
		Nissan350Z.manejo();
		Nissan350Z.Neutro();
		Nissan350Z.Pisarembrage();
		Nissan350Z.Primera();
		Nissan350Z.acelerar();
		Nissan350Z.Pisarembrage();
		Nissan350Z.Segunda();
		Nissan350Z.acelerar();
		Nissan350Z.Pisarembrage();
		Nissan350Z.Frenar();
		Nissan350Z.giroderecho(60);
		Nissan350Z.acelerar();
		

	}

}
