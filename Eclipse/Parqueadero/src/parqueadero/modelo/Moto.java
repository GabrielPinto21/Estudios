package parqueadero.modelo;

public class Moto extends Vehiculo{
	
	public Moto (String placa, int modelo, int dia) {
		super (placa, modelo, dia);
	}
	
	public boolean verificarPlaca() {
		if (placa.trim().length()== 5) return true;
		else return false;
	}

	public String toString () {
		return   "Tipo: Moto - Placa: " + placa + " - Modelo: " + modelo + " - Dias transcurridos: " + dia;
	}
}
