package pos_estacio;

public class juntarStrings {

	public static void main(String[] args) {
		
		//Assim consome mais memória		
		String resultado = " ";
		
		resultado = resultado + "Alexandre 1\n";
		resultado = resultado + " Vanessa 2\n";
		
		System.out.println(resultado);

		//Forma mais eficiente
		
		StringBuilder resultad = new StringBuilder();
		resultad.append("Alexandre Carvalho 1\n");
		resultad.append("Vanessa Vale 2\n");
		String stringResultanto = resultad.toString();
		System.out.println(stringResultanto);
	}

}
