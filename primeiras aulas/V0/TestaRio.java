import javax.swing.JOptionPane;

public class TestaRio {
	public static void main(String[] args) {

		Rio nilo = new Rio("Nilo", 209.4f, false);
		nilo.chover(30);
		nilo.sujar();

		Rio tiete = new Rio("tiete", 120.0f, true);
		tiete.ensolarar(4.8f);
		tiete.limpar();

		JOptionPane.showMessageDialog( null, nilo.mostrar() );
		JOptionPane.showMessageDialog( null, tiete.mostrar() );
	}
}