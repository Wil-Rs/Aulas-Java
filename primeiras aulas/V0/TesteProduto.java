import java.util.Date;
import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        // criando instancias
        // criar objeto prod1
        Produto prod1 = new Produto();
        prod1.codigo = 1;
        prod1.nome = "Máscara";
        prod1.preco = 3.0f; //f indica que é float
        prod1.qtde = 20;
        prod1.validade = new Date(); //cria uma data com o dado atual
        prod1.comprar(2);
        prod1.vender(1);
        prod1.acrescimo(10);
        // criar objeto prod2
        //new produto alterando o metodo construtor
        Produto prod2 = new Produto(2, "Álcool em gel", 12.0f, 40, new Date());
        prod2.comprar(2);
        prod2.vender(1);
        prod2.desconto(3);
        
        Produto y = new Produto(9, "lampada", 7.0f, 40, new Date());
        y.comprar(10);
        y.vender(1);
        y.acrescimo(3);
            
        
        Produto x = new Produto(9, "gilette", 13.0f, 50, new Date());
        x.comprar(5);
        y.vender(2);
        y.desconto(1);
        
        Produto prod3 = new Produto();
        prod3.codigo = Integer.parseInt (JOptionPane.showInputDialog("Informe o código"));
        prod3.nome = JOptionPane.showInputDialog("Informe o nome");
        prod3.preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço"));
        prod3.qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe o qtde"));
        prod3.validade = new Date();
        prod3.comprar(6);
        prod3.vender(1);
        prod3.desconto(3);
        JOptionPane.showMessageDialog(null, "Nome do obj1 " + prod1.nome);
        JOptionPane.showMessageDialog(null, "Preço do obj2 " + prod2.preco);
        JOptionPane.showMessageDialog(null, "Qtde do obj3 " + prod3.qtde);
        
        
    }
  
}
