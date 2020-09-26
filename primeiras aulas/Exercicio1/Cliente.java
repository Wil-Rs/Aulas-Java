public class Cliente{

	private String numeroConta;
	private String numeroAgencia;
	private String nome;
	private float saldo;

	public Cliente(){

	}

	public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
		this.setConta(numeroConta); // prevencao de mal uso
		this.setAgencia(numeroAgencia);
		this.setNome(nome);
		this.setSaldo(saldo);
	}

	//getters
	public String getNumeroConta(){
		return this.numeroConta;
	}

	public String getNumeroAgencia(){
		return this.numeroAgencia;
	}

	public String getNome(){
		return this.nome;
	}

	public float getSaldo(){
		return this.saldo;

	}

	//seters
	public final void setConta(String numero){
		if ( ( numero.length() == 8 ) && ( numero.charAt(6) == "-".charAt(0) ) ){
			this.numeroConta = numero;
		} else {
			System.out.println("Numero da conta invalido!!!");
		}
	}

	public final void setAgencia(String numero){
		if( (numero.length() == 6) ){
			this.numeroAgencia = numero;
		}else {
			System.out.println("Agencia invalida!!!");
		}
	}

	public final void setNome(String nome){
		if( nome.length() <= 30 ){
			this.nome = nome;
		}
	}

	public final void setSaldo(float saldo){
		if( saldo >= 0 ){
			this.saldo = saldo;
		}else {
			System.out.println("Saldo invalido!!!");
		}
	}

	public void depositar(float x){
		this.setSaldo( this.saldo + x );
	}

	public void sacar(float x){
		this.setSaldo( this.saldo - x );
	}

	public void mostra(){
		System.out.println( "nro da conta: " + this.numeroConta + 
			"\nagencia: " + this.numeroAgencia + 
			"\nnome: " + this.nome +
			"\nsaldo: " + this.saldo );
	}

}