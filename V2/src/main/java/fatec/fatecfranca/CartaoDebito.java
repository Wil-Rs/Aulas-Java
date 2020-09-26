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
public class CartaoDebito {

    //declaração das variaveis privadas
    private String numero;
    private int senha;
    private String validade;
    private String bandeira;
    //variaveis do tipo objeto que representa a associação
    private Conta conta; // Conta é a classe e conta é o objeto desta classe

    public CartaoDebito() {
    }

    public CartaoDebito(String numero, int senha, String validade, String bandeira, Conta conta) {
        this.numero = numero;
        this.senha = senha;
        this.validade = validade;
        this.bandeira = bandeira;
        //associa a conta ao cartão
        this.conta = conta;
    }
    
    //getter
    public String getNumero() {  
        return numero;
    }

    public int getSenha() {
        return senha;
    }

    public String getValidade() {
        return validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public Conta getConta() { // método recebe uma classe que é a conta
        return conta;
    }
    
    //setter
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    //associa a conta ao cartão
    public void setConta(Conta conta) { // método recebe uma classe como parâmetro, que é a conta 
        this.conta = conta;
    }

    public void comprar(float x, int senha, String data){
        //efetive a compra, ou seja, altere o saldo da conta do cartão
        //antes: verifica se a senha está correta e se a validade do cartão está OK

       if(senha == this.senha){
           if((this.conta.getSaldo() - x) >= 0){
               int mesCompra = Integer.parseInt(data.split("/")[0]);
               int anoCompra = Integer.parseInt(data.split("/")[1]);
               int mesValidade = Integer.parseInt(this.validade.split("/")[0]);
               int anoValidade = Integer.parseInt(this.validade.split("/")[1]);
               
               if( (anoValidade <= anoCompra) && ( mesValidade <= mesCompra ) ){
                   this.conta.setSaldo( this.conta.getSaldo() - x );
                   System.out.println("\n\nCompra realizado com sucesso!!!\n\n");
               }else{
                   System.out.println("\n\n\nValidade vencida\n\n\n");
               }
                 
           }else {
               System.out.println("Saldo insuficiente");
           }
       }else {
           System.out.println("Senha incorreta");
       }
        //////////////////////////////////// LEMBRAR //////////////////////////////////////////////////
    }
    
    @Override
    public String toString() {
        return "==> CartaoDebito{" + "->numero=" + numero + ",\n ->senha=" + senha +
                ",\n ->validade=" + validade + ",\n ->bandeira=" + bandeira + ",\n==>conta=" + conta.toString() + '}';
    }
    
      
}
