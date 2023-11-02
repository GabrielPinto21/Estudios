package impuesto.modelo;

public class Vehiculo {
	private String marca;
	private String linea;
	private String placa;
	private int modelo;
	private double valor;
	private double resultado;
	private boolean cbPronto;
	private boolean cbServicio;
	private boolean cbTraslado;
	
	public Vehiculo(String placa, String marca, String linea, int modelo, double valor, boolean cbPronto, boolean cbServicio, boolean cbTraslado, double resultado) {
		this.placa = placa;
		this.marca = marca;
		this.linea = linea;
		this.modelo = modelo;
		this.valor = valor;
		this.cbPronto = cbPronto;
		this.cbServicio = cbServicio;
		this.cbTraslado = cbTraslado;
		this.resultado = resultado;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isCbPronto() {
		return cbPronto;
	}
	public void setCbPronto(boolean cbPronto) {
		this.cbPronto = cbPronto;
	}
	
	public boolean isCbServicio() {
		return cbServicio;
	}
	public void setCbServicio(boolean cbServicio) {
		this.cbServicio = cbServicio;
	}

	public boolean isCbTraslado() {
		return cbTraslado;
	}
	public void setCbTraslado(boolean cbTraslado) {
		this.cbTraslado = cbTraslado;
	}

	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
