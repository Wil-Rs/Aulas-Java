public class TestaCliente{
	public static void main(String [] args){
		Cliente feliz = new Cliente("234567-8", "23450x", "Fulano", 0);
		feliz.depositar(3000);
		feliz.sacar(300);
		feliz.sacar(400);
		feliz.sacar(100);
		feliz.mostra();

		Cliente triste = new Cliente("789467-8", "7458-x", "siclano", 500);
		triste.depositar(4);
		triste.mostra();
	}
}