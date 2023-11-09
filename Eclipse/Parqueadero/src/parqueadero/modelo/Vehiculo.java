package parqueadero.modelo;

public class Vehiculo {

	protected String placa;
	protected int modelo;

	public Vehiculo (String placa, int modelo) {
		this.placa = placa;
		this.modelo = modelo;
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
}
