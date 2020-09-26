import java.util.Date;

public class Produto {
    //definir as variáveis
    public int codigo;
    public String nome;
    public float preco;
    public int qtde;
    public Date validade;
    
    //cria construtor com parâmetros
    //tem o mesmo nome da classe
    //static significa que o método é de classe
    public Produto(int codigo, String nome, float preco, int qtde, Date validade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
        this.validade = validade;
    }
    // cria construtor sem parâmetros
    //tem o mesmo nome da classe
    public Produto(){
        
    }
    //método de instância
    public void comprar(int a){
        this.qtde = this.qtde + a;
    }
    
    //método de instância
    public void vender(int a){
        this.qtde = this.qtde - a;
    }
    
    //método de instância
    public void acrescimo(float a){
        this.preco = this.preco + a;
    }
    
    //método de instância
    public void desconto(float a){
        this.preco = this.preco - a;
    }
    
    public String objetoParaString(){
        return "Código: " + this.codigo + "Nome: " + this.nome + "Qtde: " + this.qtde + "Preço: " + this.preco + "Validade" + this.validade;
    }
}
