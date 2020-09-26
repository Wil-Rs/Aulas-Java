/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.fatecfranca.v3;

public class Notebook extends Computador{
    private float capBateria;

    public Notebook() {
    }

    public Notebook(float capBateria, String marca, String modelo, float preco) {
        super(marca, modelo, preco);
        this.capBateria = capBateria;
    }

    public float getCapBateria() {
        return capBateria;
    }

    public void setCapBateria(float capBateria) {
        this.capBateria = capBateria;
    }

    @Override
    public String toString() {
        return "Notebook{" + "capBateria=" + capBateria + super.toString() + '}';
    }
    
    @Override
    public float calculaPreco(){
        return this.preco * this.capBateria;
    }
    
}
