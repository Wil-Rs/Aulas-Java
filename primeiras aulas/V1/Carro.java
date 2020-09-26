public class Carro {
	// variaveis privadas
	private int marcha; //-1 1 2 3 4 5
	private String placa; // xxx2222

	public Carro(){
		this.marcha = 0; // valor default
		this.placa = "xxx1111"; // valor default
	}

	public Carro(int marcha, String placa){
		this.setMarcha(marcha); // vamos tomar cuidado para nao deixar as classes filhas sobreescrever este metodo
		this.setPlaca(placa); // garante o encapsulamento
	}

	//seter
	public final void setMarcha(int marcha){
		if( marcha >= -1 && marcha <= 6 ){
			this.marcha = marcha;
		}else {
			System.out.println("Marcha invalida!!!");
		}
	}

	public final void setPlaca(String placa){
		String parte1 = placa.substring(0, 3);
		String parte2 = placa.substring(3);

		if ( (placa.length() == 6) && parte1.matches("[A-Z]*") && parte2.matches("[0-9]*") ){
			this.placa = placa;
		} else {
			System.out.println("Valor invalido placa!!!");
		}
	}

	//getter
	public String getPlaca(){
		return this.placa;
	}

	public int getMarcha(){
		return this.marcha;
	}

	public void mostra(){
		System.out.println("Placa: " + getPlaca() + " Marcha: " + getMarcha() );
	}

	public String mostra1(){
		return "Placa: " + getPlaca() + " Marcha: " + getMarcha() ;
	}
}