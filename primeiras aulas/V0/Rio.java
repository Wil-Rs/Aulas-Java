public class Rio {

	
	public String nome;
	public float nivel;
	public boolean poluido; // se ta poluido (true) se nao (false)
	
	public Rio(String nome, float nivel, boolean poluido){
		this.nome = nome;
		this.nivel = nivel;
		this.poluido = poluido;
	};

	//funcoes da classe
	public void chover(float x){
		this.nivel = this.nivel + x;
	};

	public void ensolarar(float x){
		this.nivel = this.nivel - x;
	};


	public void limpar(){
		this.poluido = false;
	};

	public void sujar(){
		this.poluido = true;
	};

	public String mostrar() {
		return "Nome: " + this.nome + " Nivel: " + this.nivel + " Poluido: " + this.poluido;
	};

}