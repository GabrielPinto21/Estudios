package parqueadero.modelo;

public class Vehiculo {

	private String placa;
	
	private int modelo;
	
	private String tipoVehiculo;
	
	
	public Vehiculo (String placa, int modelo, String tipoVehiculo) {
		this.placa = placa;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
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

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
	
	
}
