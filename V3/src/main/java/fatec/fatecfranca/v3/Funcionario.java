package fatec.fatecfranca.v3;

public class Funcionario {
    //sempre criar variavel no classe pai como visibilidade protegida
    
    protected String cpf;
    protected String nome;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, String nome, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override //anotacao de sobrescrever ou anular o metodo herdado
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + '}';
    }
    
    public float calculaSalario(){
        return this.salario;
    }
    
}
