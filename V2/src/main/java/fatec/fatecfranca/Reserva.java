/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.fatecfranca;

import java.util.Date;

/**
 *
 * @author tux
 */
public class Reserva {
    private int cod;
    private Date data;
    // associacao
    private Voo voo;
    // associacao
    private Passageiro passageiro;

    public Reserva() {
    }

    public Reserva(int cod, Date data, Voo voo, Passageiro passageiro) {
        this.cod = cod;
        this.data = data;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    public int getCod() {
        return cod;
    }

    public Date getData() {
        return data;
    }

    public Voo getVoo() {
        return voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        return "Reserva{" + "cod=" + cod + ", data=" + data + ", voo=" + voo.toString() + ", passageiro=" + passageiro.toString() + '}';
    }
    
    
    
}