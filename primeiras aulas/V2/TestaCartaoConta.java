public class TestaCartaoConta {

    public static void main(String[] args) {
        //criamos o objeto parte
        Conta conta1 = new Conta("4379", "0102341-1", 100, "Fulano");
        //criamos o objeto todo
        CartaoDebito cartao1 = new CartaoDebito("1111", 1234, "12/2022", "Visa", conta1);

        cartao1.comprar(154, 1234, "12/2022");


        System.out.println(cartao1.toString());

        System.out.println( "12/2022".substring(0, 2) );



    }
    
}
