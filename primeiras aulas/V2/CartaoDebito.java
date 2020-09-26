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

        int dataConvertida = Integer.parseInt( data.substring(3) ) ; //pega o ano da data
        int dataConvertida2 = Integer.parseInt( this.validade.substring(3) );//pega o ano da validade

        int mes1 = Integer.parseInt( data.substring(0, 2) );//pega o mes da data
        int mes2 = Integer.parseInt( this.validade.substring(0, 2) ); //pega o mes da validade

        if ( (senha == this.senha) && (dataConvertida <=  dataConvertida2) && (mes1 <= mes2) && (x >= 0)){
            this.conta.setSaldo( this.conta.getSaldo() - x );
        } else {
            System.out.println("erro comprar");
        }
        //////////////////////////////////// LEMBRAR //////////////////////////////////////////////////
    }
    
    @Override
    public String toString() {
        return "CartaoDebito{" + "numero=" + numero + ", senha=" + senha +
                ", validade=" + validade + ", bandeira=" + bandeira + ", conta=" + conta.toString() + '}';
    }
    
      
}
