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
public class Voo {
    private int nro;
    private String origem;
    private String destino;

    public Voo() {
    }

    public Voo(int nro, String origem, String destino) {
        this.nro = nro;
        this.origem = origem;
        this.destino = destino;
    }

    public int getNro() {
        return nro;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Voo{" + "nro=" + nro + ", origem=" + origem + ", destino=" + destino + '}';
    }
    
    
    
}
