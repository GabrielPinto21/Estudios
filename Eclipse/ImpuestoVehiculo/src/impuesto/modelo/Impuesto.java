package impuesto.modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Impuesto {
private ArrayList<Vehiculo> vhc; 
	
	public Impuesto() {
		vhc = new ArrayList<Vehiculo>();
	}
	
	public String anadirVehiculo(String placa, String marca, String linea, int modelo, Double valor, boolean cbPronto, boolean cbServicio, boolean cbTraslado, double resultado) {
		
		if(placa.isEmpty() && marca.isEmpty() && linea.isEmpty() && valor == 0) return "Ingrese todos los datos";
		
		for(Vehiculo vhcI : vhc) {
			if(placa.equalsIgnoreCase(vhcI.getPlaca())) {
				return "Este vehículo ya se encuentra registrado";
			}
		}
		
		Vehiculo v1 = new Vehiculo(placa, marca, linea, modelo, valor, cbPronto, cbServicio, cbTraslado, resultado);
		vhc.add(v1);
		return "Vehiculo registrado con exito";
		
	}
	
	public String calcularImpuestos(String precio, boolean cbPago, boolean cbServicio, boolean cbTraslado) {
		
		
		
		double precioDouble = Double.parseDouble(precio);
		double precioTotal;
		
		System.out.println("precioDouble = "+precioDouble);
		
		
		if(precioDouble >= 0 && precioDouble <= 30000000) {
			precioTotal = (precioDouble * 0.015);
		}
		else if(precioDouble > 30000000 && precioDouble <= 70000000) {
			precioTotal =(precioDouble * 0.02);
			
			DecimalFormat df = new DecimalFormat("#");
	        df.setMaximumFractionDigits(3);
	        System.out.println("nuevoPrevio = "+df.format(precioTotal));
			
			System.out.println("precioTotal = "+precioTotal);

		}
		else if(precioDouble > 70000000 && precioDouble <= 200000000) {
			precioTotal = (precioDouble * 0.025);

		}
		else {
			precioTotal = (precioDouble * 0.04);
		}
		
		System.out.println("AAAAAAA " + precioTotal);
		
		if(cbPago == true) {
			precioTotal -= precioTotal * 0.10;
			System.out.println("AAAAAA1 " + precioTotal);
		}
		if(cbServicio == true) {
			precioTotal -= 50000;
			System.out.println("AAAAAA2 " + precioTotal);
		}
		if(cbTraslado == true) {
			precioTotal -= precioTotal * 0.05;
			System.out.println("AAAAAA3 " + precioTotal);
		}
		
		return String.valueOf(precioTotal);
	}
	
	public String eliminarVehiculo(String placa) {
		
		for(Vehiculo vh1 : vhc) {
			if(placa.equalsIgnoreCase(vh1.getPlaca())) {
				vhc.remove(vh1);
				return "Vehiculo eliminado exitosamente.";
			}
		}
		return "Este vehiculo no se encuentra registrado.";
	}
	
	public Vehiculo buscarVehiculo(String placa) {
		
		System.out.println("Imouestos.buscar");
		
		System.out.println(vhc.size());
		
		for(Vehiculo vh1 : vhc) {
			
			System.out.println(vh1.getPlaca()+ " ::: "+placa);
			
			if(placa.equalsIgnoreCase(vh1.getPlaca())) {
				System.out.println("Encontro");
				return vh1;
			}
		}
		return null;
	}

	public Vehiculo mostrarPrimero() {
		if (vhc.isEmpty()) return null;
		return vhc.get(0);
	}
	
	public Vehiculo mostrarUltimo() {
		if (vhc.isEmpty()) return null;
		return vhc.get(vhc.size()-1);
	}
	
	public Vehiculo mostrarSiguiente(String placa) {
		int i = 0;
		for(Vehiculo vhc1 : vhc) {
			if(vhc1.getPlaca().equalsIgnoreCase(placa)) {
				if(i< vhc.size()-1) {
					System.out.println("Siguiente");
					return vhc.get(i+1);
				}
				else 
					System.out.println("No se ejecuto siguiente");
					return vhc1;
			}
			i++;
		}
		return null;
	}
	
	public Vehiculo mostrarAnterior(String placa) {
		int i = 0;
		for(Vehiculo vhc1 : vhc) {
			if(vhc1.getPlaca().equalsIgnoreCase(placa)) {
				if(i>0) {
					System.out.println("Anterior");
					return vhc.get(i-1);
				}
				else
					System.out.println("No se ejecuto anterior");
					return vhc1;
			}
			i++;
		}
		return null;
	}
}
