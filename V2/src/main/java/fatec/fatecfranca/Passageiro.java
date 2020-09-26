/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.fatecfranca;

/**
 *
 * @author tux
 */
public class Passageiro {
    
    private String rg;
    private String cpf;

    public Passageiro() {
    }

    public Passageiro(String rg, String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setRg(String rg) {
        this.rg = rg;
    }

    public final void setCpf(String cpf) {
        if(cpf.length() == 11){
            this.cpf = cpf;
        }
        
    }

    @Override
    public String toString() {
        return "Passageiro{" + "rg=" + rg + ", cpf=" + cpf + '}';
    }
    
    
    
}
