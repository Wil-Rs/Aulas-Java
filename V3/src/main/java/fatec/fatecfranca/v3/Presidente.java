package fatec.fatecfranca.v3;

public class Presidente extends Funcionario {
        private int acoes;

    public Presidente() {
    }

    public Presidente(int acoes, String cpf, String nome, float salario) {
        super(cpf, nome, salario);
        this.acoes = acoes;
    }

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        return "Presidente{" + "acoes=" + acoes + super.toString() + '}';
    }
    
    @Override
    public float calculaSalario () {
        return this.salario + ( this.acoes * 30 );
    }
    
}
