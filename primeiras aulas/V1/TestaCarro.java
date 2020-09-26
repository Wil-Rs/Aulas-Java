public class TestaCarro{
	public static void main(String [] args){
		Carro uno = new Carro();

		uno.setMarcha(4);
		uno.setPlaca("QWE123");

		Carro fusca = new Carro(2, "ZAS123");
		fusca.setMarcha(4);
		fusca.setPlaca("GHY456");
		fusca.mostra();
	} 
}