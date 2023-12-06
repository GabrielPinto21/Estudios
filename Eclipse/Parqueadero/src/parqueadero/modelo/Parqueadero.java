package parqueadero.modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class Parqueadero {

	private ArrayList<Vehiculo> vehiculo;
	private ArrayList<String> dia;
	
	private int contMotos = 0, contCarros = 0, diasAcomulados = 0;
	private int diaAcutal = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	
	public ArrayList<Vehiculo> getVehiculo() {
		return vehiculo;
	}
	
	public ArrayList<String> getDia() {
		return dia;
	}

	public int getContMotos() {
		return contMotos;
	}

	public int getContCarros() {
		return contCarros;
	}

	public Parqueadero () {
		vehiculo = new ArrayList<Vehiculo>();
		dia = new ArrayList<String>();
		
		dia.add("1");
		dia.add("2");
		dia.add("3");
		dia.add("4");
		dia.add("5");
		dia.add("6");
		dia.add("7");
		dia.add("8");
		dia.add("9");
		dia.add("10");
		dia.add("11");
		dia.add("12");
		dia.add("13");
		dia.add("14");
		dia.add("15");
		dia.add("16");
		dia.add("17");
		dia.add("18");
		dia.add("19");
		dia.add("20");
		dia.add("21");
		dia.add("22");
		dia.add("23");
		dia.add("24");
		dia.add("25");
		dia.add("26");
		dia.add("27");
		dia.add("28");
		dia.add("29");
		dia.add("30");
		
		
	}
	
	public String anadir (String placa, String modelo, String tipo, String dia) {
		
		int modeloInt = Integer.parseInt(modelo);
		int diaInt = Integer.parseInt(dia);
		
		
		for (Vehiculo vh1 : vehiculo) {
			if(placa.equalsIgnoreCase(vh1.getPlaca())) {
				return "Vehiculo ya se encuentra registrado";
			}
		}
		
		if (diaInt > diaAcutal) {
			return "La fecha no cumple, debe ser menor o igual";
		}else {
			diasAcomulados = (diaAcutal - diaInt) + 1;
		}
			
		
		if (tipo.equalsIgnoreCase("carro")){
				Carro carro = new Carro (placa,modeloInt,diasAcomulados);
				if(carro.verificarPlaca() == false) {
				return "Placa no valida, deben ser 6 caracteres";
				}else {
					vehiculo.add(carro);
					contCarros++;
				}
			}
		else {
			Moto moto = new Moto (placa, modeloInt,diasAcomulados);
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
		int gananciasCarros = 0, gananciasMotos = 0, tarifaDia = 0;;
		
		if (contCarros == 0 && contMotos == 0) return "No se encuentran vehiculos registrados.";
		
		for (Vehiculo vh1 : vehiculo) {
			if(vh1 instanceof Carro) {
				
				
				if (vh1.getModelo()<2012) {
					tarifaDia += 2000;
				}else {
					tarifaDia += 2500;
				}
				if (vh1.getModelo() >= 2024) {
					tarifaDia += 500;
				}
				
				gananciasCarros = tarifaDia * ( diaAcutal - vh1.getDia());
				
			}else {
				if (vh1.getModelo()<2012) {
					tarifaDia += 1000;
				}else {
					tarifaDia += 1200;
				}
				if (vh1.getModelo() >= 2024) {
					tarifaDia += 120;
				}
				
				gananciasMotos = tarifaDia * ( diaAcutal - vh1.getDia()); 
			}
		}
		
		
		return "El total de carros es " + contCarros + " con un valor de " + gananciasCarros + ", el total de motos es " + contMotos + 
				" para un valor de " + gananciasMotos + ", el total de vehículos fue " + (contCarros+contMotos) +" y el total recaudado " + 
				(gananciasCarros+gananciasMotos) + ".";
		
	}

	public String eliminar(Vehiculo vhSeleccionado) {
		
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
