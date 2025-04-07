package pos_estacio;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aluno = JOptionPane.showInputDialog(null, "Digite o nome do Aluno:");
		
		String media = JOptionPane.showInputDialog(null, "Digite a Média do Aluno:");
		
		//Conversão de String para Int
		int nota = Integer.parseInt(media);
		String resultadoDoAluno = (nota >= 6 ? "Aprovado" : "Reprovado");
		
		//Resultado no console
		System.out.println("O Aluno " + aluno + " recebeu a média " + nota + " e está " + resultadoDoAluno);
		
		//Resultado na box
		JOptionPane.showMessageDialog(null,"O Aluno " + aluno + " recebeu a média " + nota + " e está " + resultadoDoAluno);
	}

}
