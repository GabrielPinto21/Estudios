package calculadora.modelo;

public class Calculadora {
	
	private double valorMemoria;   
  
	public double getValorMemoria() {
		return valorMemoria;
	}

	public void setValorMemoria(double valorMemoria) {
		this.valorMemoria = valorMemoria;
	}
	
	public String suma(String num1, String num2) {
		
		int numInt1 = 0;
		if(!num1.isEmpty())
			numInt1 = Integer.parseInt(num1);
		
		int numInt2 = 0;
		if(!num2.isEmpty())
			numInt2 = Integer.parseInt(num2);
		
		int suma = numInt1 + numInt2;
		
		
		
		return suma + "";
	}
	
	public String resta(String num1, String num2) {
			
			int numInt1 = 0;
			if(!num1.isEmpty())
				numInt1 = Integer.parseInt(num1);
			
			int numInt2 = 0;
			if(!num2.isEmpty())
				numInt2 = Integer.parseInt(num2);
			
			int suma = numInt1 - numInt2;
			
			
			
			return suma + "";
		}
	
	public String mult(String num1, String num2) {
			
			int numInt1 = 0;
			if(!num1.isEmpty())
				numInt1 = Integer.parseInt(num1);
			
			int numInt2 = 0;
			if(!num2.isEmpty())
				numInt2 = Integer.parseInt(num2);
			
			int suma = numInt1 * numInt2;
			
			
			
			return suma + "";
		}
	
	public String div(String num1, String num2) {
			
			int numInt1 = 0;
			if(!num1.isEmpty())
				numInt1 = Integer.parseInt(num1);
			
			int numInt2 = 0;
			if(!num2.isEmpty())
				numInt2 = Integer.parseInt(num2);
			double suma=0;
			
			if(numInt2!=0) {
			 suma =(double) numInt1 / numInt2;
			return String.format("%.2f", suma);
			}
				
			return "##ERROR##";
		}
	
	public void sumarMemoria (double n) {
		this.valorMemoria = n;
	}
	
	public void restarMemoria () {
		this.valorMemoria = 0;
	}

		
			
	}
