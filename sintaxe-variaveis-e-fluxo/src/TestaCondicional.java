
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int age = 17;
		int quantidadePessoas = 3;
		if (age >= 18) {
			System.out.println("Você tem mais de 18");
			
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não têm 18 mas está acompanhado");
				
			} else {
				System.out.println("Infelizmente, você não tem mais de 18 anos!");
				
			}
		}
	}
}
