
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando Escopos");
		int age = 22;
		int quantidadePessoas = 2;
		Boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		 //System.out.println("valor de acompanhado = " + acompanhado);
		
		if (age >= 18 && acompanhado ) {
			System.out.println("Você já é maior de 18 anos e está acompanhado, pode entrar!" + acompanhado);
		} else {
			System.out.println("Você é menor de 18 e não pode entrar");
		}
	}

}
