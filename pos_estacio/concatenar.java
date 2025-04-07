package pos_estacio;

import javax.swing.JOptionPane;

public class concatenar {

	public static void main(String[] args) {
		// TODO Entada de dados concatenado
		String nome = JOptionPane.showInputDialog(null,"Qual o seu nome?");
		String sobreNome = JOptionPane.showInputDialog(null,"Qual o seu sobrenome?");
		String idade = JOptionPane.showInputDialog(null,"Qual o sua idade?");
		
		System.out.println("Olá" + " " + nome + " " + sobreNome + " vc tem " + idade + " anos de idade");
		JOptionPane.showMessageDialog(null, "Olá" + " " + nome + " " + sobreNome + " vc tem " + idade + " anos de idade");
	}

}
