package fatec.fatecfranca.v3;

public class Diretor extends Funcionario {
    private float participacao;

    public Diretor() {
    }

    public Diretor(float participacao, String cpf, String nome, float salario) {
        super(cpf, nome, salario);
        this.participacao = participacao;
    }

    public float getParticipacao() {
        return participacao;
    }

    public void setParticipacao(float participacao) {
        this.participacao = participacao;
    }

    @Override
    public String toString() {
        return "Diretor{" + "participacao=" + participacao + super.toString() + '}';
    }
    
    @Override
    public float calculaSalario() {
        return this.salario + ( this.participacao * this.salario) / 100;
    }
    
}
