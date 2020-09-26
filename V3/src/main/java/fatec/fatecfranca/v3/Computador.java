/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.fatecfranca.v3;

/**
 *
 * @author tux
 */
public class Computador {
    protected String marca;
    protected String modelo;
    protected float preco;

    public Computador() {
    }

    public Computador(String marca, String modelo, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + '}';
    }
    
    public float calculaPreco(){
        return this.preco;
    }
    
}
