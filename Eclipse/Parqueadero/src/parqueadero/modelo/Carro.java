package parqueadero.modelo;

public class Carro extends Vehiculo{

	public Carro (String placa, int modelo) {
		super (placa, modelo);
	}
	
	public boolean verificarPlaca() {
		
		if (placa.trim().length()== 6) return true;
		else return false;
	}

	public String toString () {
		return   "Tipo: carro - Placa: " + placa + " - Modelo: " + modelo;
	}
	}
