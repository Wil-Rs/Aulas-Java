public class Aluno {
	private int idade;

	// construtor

	public void setIdade(int idade){
		if(idade >= 0){
			this.idade = idade;
		}else {
			System.out.println("idade invalida");
		}
	};

	public int getIdade(){
		return this.idade;
	};
}