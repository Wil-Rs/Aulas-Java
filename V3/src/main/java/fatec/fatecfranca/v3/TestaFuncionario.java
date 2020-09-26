package fatec.fatecfranca.v3;

import java.util.ArrayList;

public class TestaFuncionario {
    //exemplo de polimorfismo
    public static void mostraCalcularSalario( Funcionario obj ){
        // obj.toString() => polimorfismo
        // obj.calculaSalario() => polimorfismo
        System.out.println(obj.toString() + " Salario final " + obj.calculaSalario());
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        Gerente ge = new Gerente(1000, "123-4", "Diego", 3000);
        Diretor ge1 = new Diretor(50, "174-5", "Diego", 5000);
        Presidente ge2 = new Presidente(300, "557-4", "Diego", 8000);
        
        ArrayList<Funcionario> vetor = new ArrayList();
        
        vetor.add(ge);
        vetor.add(ge2);
        vetor.add(ge1);
        
        mostraCalcularSalario( vetor.get(0) ); // passando um gerente como parametro
        mostraCalcularSalario( vetor.get(1) );
        mostraCalcularSalario( vetor.get(2) );
        
    }
    
}
