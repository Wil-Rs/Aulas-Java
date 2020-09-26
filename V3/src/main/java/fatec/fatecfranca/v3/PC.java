/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.fatecfranca.v3;

public class PC extends Computador{
    private float tamGabinete;

    public PC() {
    }

    public PC(float tamGabinete, String marca, String modelo, float preco) {
        super(marca, modelo, preco);
        this.tamGabinete = tamGabinete;
    }

    public float getTamGabinete() {
        return tamGabinete;
    }

    public void setTamGabinete(float tamGabinete) {
        this.tamGabinete = tamGabinete;
    }

    @Override
    public String toString() {
        return "PC{" + "tamGabinete=" + tamGabinete + super.toString() + '}';
    }
    
    @Override
    public float calculaPreco(){
        return this.preco * this.tamGabinete;
    }
    
}
