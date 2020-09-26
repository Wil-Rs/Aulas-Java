public class Conta {
    //declaração das variáveis
    private String nroAgencia;
    private String nroConta;
    private float saldo;
    private String nome;

    public Conta() {
    }

    public Conta(String nroAgencia, String nroConta, float saldo, String nome) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.saldo = saldo;
        this.nome = nome;
    }
    
    
    //getters
    public String getNroAgencia() {
        return nroAgencia;
    }

    public void setNroAgencia(String nroAgencia) {
        this.nroAgencia = nroAgencia;
    }

    public String getNroConta() {
        return nroConta;
    }
    
    //setters
    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override // Esse método vai anular o método toString() da classe pai, a classe object
    public String toString() {
        return "Conta{" + "nroAgencia=" + nroAgencia + ", nroConta=" + nroConta + ", saldo=" + saldo + ", nome=" + nome + '}';
    } 
    
}
