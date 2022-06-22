
public class exercicio {
	public static void main(String[] args) {
		
		double salario = 3790.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			double ir = 7.5/100*salario;
			System.out.println("Sua aliquota é de 7.5% e o valor de sua declaração é: " + ir + " reais");
		}else if (salario >= 2800.01 && salario <= 3751.0) {
			double ir2 = 15.0/100*salario;
			System.out.println("Sua aliquota é de 15% e o valor de sua declaração é: " + ir2 + " reais");
		}else if (salario >= 3752.0 && salario <= 4664.0) {
			double ir3 = 22.5/100*salario;
			System.out.println("Sua aliquota é de 22.5% e o valor de sua declaração é: " + ir3 + " reais");
		}
	}

}
