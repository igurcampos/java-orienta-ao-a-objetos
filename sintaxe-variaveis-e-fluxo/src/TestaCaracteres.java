
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;
		System.out.println(valor);
		//Isto ocorre pois na tabela Unicode o 65 corresponde à letra a
		valor = (char) (valor + 5);
		System.out.println(valor);
		
		String palavra = "Cursando cursos da alura!";
		String palavra2 = " Concatenandos trings";
		palavra = palavra + palavra2;
		System.out.println(palavra);
		
	}
	
	
}
