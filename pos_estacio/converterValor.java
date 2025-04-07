package pos_estacio;

import javax.swing.JOptionPane;

public class converterValor {

	public static void main(String[] args) {
		// TODO Conversão de Valores
		
		//Tipo Real - Soma
		String aluno = JOptionPane.showInputDialog(null, "Informe o nome do aluno:");
		String valor1 = JOptionPane.showInputDialog(null, "Informe um valor:");
		String valor2 = JOptionPane.showInputDialog(null, "Informe outro valor:");
		
		//Converta os valores
		int num1 = Integer.parseInt(valor1);
		int num2 = Integer.parseInt(valor2);
		
		//Soma dos valores convertidos
		int soma = num1 + num2;
		
		System.out.println("Olá " + aluno + " a Soma dos valores é " + soma);
		
		//Exibição em Caixa
		JOptionPane.showMessageDialog(null,"Olá " + aluno + " a Soma dos valores é " + soma);
		
		//Tipo Double - Média
		String nota1 = JOptionPane.showInputDialog(null, "Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog(null, "Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog(null, "Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog(null, "Informe a nota 4");
		
		//Conversão de String em Double
		double nota_1 = Double.parseDouble(nota1);
		double nota_2 = Double.parseDouble(nota2);
		double nota_3 = Double.parseDouble(nota3);
		double nota_4 = Double.parseDouble(nota4);
		
		//Cálculo da Média
		
		double media = (nota_1 + nota_2 + nota_3 + nota_4) / 4;
		
		System.out.println("Oi " + aluno + " as Notas lançadas foram " + nota1 + " " + nota2 + " " + nota3 + " " + " e " + nota4 + " com isso tua Média ficou em: " + media );
		
		JOptionPane.showMessageDialog(null, "Oi " + aluno + " as Notas lançadas foram " + nota1 + " " + nota2 + " " + nota3 + " " + " e " + nota4 + " com isso tua Média ficou em: " + media);
		
	}

}
