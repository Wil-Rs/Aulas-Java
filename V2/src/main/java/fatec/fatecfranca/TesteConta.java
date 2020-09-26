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
public class TesteConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criamos o objeto parte
        Conta conta1 = new Conta("4379", "0102341-1", 5000, "Fulano");
        //criamos o objeto todo
        CartaoDebito cartao1 = new CartaoDebito("1111", 1234, "12/2022", "Visa", conta1);
        cartao1.comprar(3000, 1234, "12/2023");
        
        
        
        Conta conta2 = new Conta("7895", "7898454-4", 45, "alfalfa");
        CartaoDebito cartao2 = new CartaoDebito("2222", 4565, "11/2020", "inter", conta2);
                
        cartao2.comprar(3000, 4565, "12/2023");
        
        
        
        
        cartao1.toString();
        cartao2.toString();
        
        
        


        
    }
    
}
