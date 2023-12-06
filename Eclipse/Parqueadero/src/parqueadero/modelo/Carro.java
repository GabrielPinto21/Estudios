package parqueadero.modelo;

public class Carro extends Vehiculo{

	public Carro (String placa, int modelo, int dia) {
		super (placa, modelo, dia);
	}
	
	public boolean verificarPlaca() {
		
		if (placa.trim().length()== 6) return true;
		else return false;
	}

	public String toString () {
		return   "Tipo: Carro - Placa: " + placa + " - Modelo: " + modelo + " - Dias transcurridos: " + dia;
	}
	}
