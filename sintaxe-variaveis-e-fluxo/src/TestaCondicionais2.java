
public class TestaCondicionais2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int age = 23;
		int quantidadePessoas = 2;
		Boolean acompanhado = quantidadePessoas >= 2;
		
		if (age >= 18 && acompanhado ) {
			System.out.println("Você já é maior de 18 anos e está acompanhado, pode entrar!");
		} else {
			System.out.println("Você é menor de 18 e não pode entrar");
		}
		
		
	}
}

