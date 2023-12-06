package parqueadero.modelo;

public class Vehiculo {
	
	
	protected String placa;
	protected int modelo;
	protected int dia;

	public Vehiculo (String placa, int modelo, int dia) {
		this.placa = placa;
		this.modelo = modelo;
		this.dia = dia;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
}
