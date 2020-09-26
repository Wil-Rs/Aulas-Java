package fatec.fatecfranca.v3;

//classe gerente é filha da classe funcionario
public class Gerente extends Funcionario{
    private float bonus;

    public Gerente() {
    }

    public Gerente(float bonus, String cpf, String nome, float salario) {
        // chamada ao construtor da superclasse
        super(cpf, nome, salario); // reutilização do codigo do construtor da superclasse
        this.bonus = bonus;
    }
    
    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonus=" + bonus + super.toString() + '}'; //reutilizacao de código
    }
    
    @Override
    public float calculaSalario(){
        return this.salario + this.bonus;
    }
    
}
