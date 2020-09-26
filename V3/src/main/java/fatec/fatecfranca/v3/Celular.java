/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.fatecfranca.v3;

public class Celular extends Computador{
    private float tamanhoTela;

    public Celular() {
    }

    public Celular(float tamanhoTela, String marca, String modelo, float preco) {
        super(marca, modelo, preco);
        this.tamanhoTela = tamanhoTela;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String toString() {
        return "Celular{" + "tamanhoTela=" + tamanhoTela + super.toString() + '}';
    }
    
    @Override
    public float calculaPreco(){
        return this.preco * this.tamanhoTela;
    }
    
}
