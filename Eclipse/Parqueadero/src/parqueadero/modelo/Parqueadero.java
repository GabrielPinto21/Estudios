package parqueadero.modelo;

import java.util.ArrayList;

public class Parqueadero {

	private ArrayList<Vehiculo> vehiculo;
	
	private int contMotos = 0, contCarros = 0;
	
	public ArrayList<Vehiculo> getVehiculo() {
		return vehiculo;
	}

	public int getContMotos() {
		return contMotos;
	}

	public int getContCarros() {
		return contCarros;
	}

	public Parqueadero () {
		vehiculo = new ArrayList<Vehiculo>();
	}
	
	public String anadir (String placa, String modelo, String tipo) {
		
		int modeloInt = Integer.parseInt(modelo);
		
		for (Vehiculo vh1 : vehiculo) {
			if(placa.equalsIgnoreCase(vh1.getPlaca())) {
				return "Vehiculo ya se encuentra registrado";
			}			
		}
		
		if (tipo.equalsIgnoreCase("carro")){
				Carro carro = new Carro (placa,modeloInt);
				if(carro.verificarPlaca() == false) {
				return "Placa no valida, deben ser 6 caracteres";
				}else {
					vehiculo.add(carro);
					contCarros++;
				}
			}
		else {
			Moto moto = new Moto (placa, modeloInt);
			if(moto.verificarPlaca() == false) {
				return "Placa no valida, deben ser 5 caracteres";
		}else {
			vehiculo.add(moto);
			contMotos++;
			}
		
		}
		return "Vehiculo registrado con exito";
	}
	
	public void reiniciar() {
		vehiculo.clear();
		contMotos=0;
		contCarros=0;
	}

	public String totalizar() {
		int gananciasCarros = 0, gananciasMotos = 0;
		
		if (contCarros == 0 && contMotos == 0) return "No se encuentran vehiculos registrados.";
		
		for (Vehiculo vh1 : vehiculo) {
			if(vh1 instanceof Carro) {
				if (vh1.getModelo()<2012) {
					gananciasCarros += 2000;
				}else {
					gananciasCarros += 2500;
				}
				if (vh1.getModelo() >= 2024) {
					gananciasCarros += 500;
				}
			}else {
				if (vh1.getModelo()<2012) {
					gananciasMotos += 1000;
				}else {
					gananciasMotos += 1200;
				}
				if (vh1.getModelo() >= 2024) {
					gananciasMotos += 120;
				}
			}
		}
		
		
		return "El total de carros es " + contCarros + " con un valor de " + gananciasCarros + ", el total de motos es " + contMotos + 
				" para un valor de " + gananciasMotos + ", el total de vehículos fue " + (contCarros+contMotos) +" y el total recaudado " + 
				(gananciasCarros+gananciasMotos) + ".";
		
	}

	public String eliminar(Vehiculo vhSeleccionado) {
		
		int i = 0;
		for(Vehiculo vh1 : vehiculo) {
			if(vh1.getPlaca().equalsIgnoreCase(vhSeleccionado.getPlaca())) {
				if(vh1 instanceof Carro) {
				contCarros--;
			}else contMotos--;
		
				vehiculo.remove(vh1);
				return "Vehiculo eliminado correctamente.";
			}
		}
		return"Vehiculo no registrado";
	}

	
}
