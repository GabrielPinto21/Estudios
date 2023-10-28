package calculadora.modelo;

public class Calculadora {
	
	private double valorMemoria; 
	
	private double numInt2 = 0, numInt1 = 0;
  
	public double getValorMemoria() {
		return valorMemoria;
	}

	public void setValorMemoria(double valorMemoria) {
		this.valorMemoria = valorMemoria;
	}
	
	public String suma(String num1, String num2) {
		
		organizarNumeros(num1, num2);
		double suma = numInt1 + numInt2;
		
		return verificarEntero(suma);
	}
	
	public String resta(String num1, String num2) {
			
			organizarNumeros(num1, num2);
			double resta = numInt1 - numInt2;
			
			return verificarEntero(resta);
		}
	
	public String mult(String num1, String num2) {
			
			organizarNumeros(num1, num2);
			double mult = numInt1 * numInt2;
			
			return verificarEntero(mult);
		}
	
	public String div(String num1, String num2) {
			
			organizarNumeros(num1, num2);
			
			double div=0;
			if(numInt2 != 0) {
			 div = numInt1 / numInt2;
			 return verificarEntero(div);
			}
				
			return "##ERROR##";
		}
	
	public void sumarMemoria (double n) {
		this.valorMemoria = n;
	}
	
	public void restarMemoria () {
		this.valorMemoria = 0;
	}
	
	private void organizarNumeros(String num1, String num2) {
		
		if(!num1.isEmpty())
			numInt1 = Double.parseDouble(num1);
		
		if(!num2.isEmpty())
			numInt2 = Double.parseDouble(num2);
	}
	
	private String verificarEntero(double resultado) {
		
		String rFinal = "";
		if (resultado%1 == 0) {
			rFinal = Integer.toString((int) resultado);
		}else {
			rFinal= String.format("%.2f", resultado);
		}
		
		
		return rFinal;
		
	}

		
			
	}
