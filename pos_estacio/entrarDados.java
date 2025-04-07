package pos_estacio;

import javax.swing.JOptionPane;

public class entrarDados {

	public static void main(String[] args) {
		//Instrução para entrada de dados
		String seunom = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
		
		JOptionPane.showConfirmDialog(null,"Seja bem vindo " + seunom);

	}

}
