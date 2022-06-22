
public class TesteExercicio {
	public static void main (String[] args) {
    	double salario = 56.66; 
    	System.out.println("Meu salario é: " + salario);

        if(salario >=4200.0) {
            salario = 4200.0;
            System.out.println("Você foi promovido");
        } else {
            salario = 3800.0;
            System.out.println("Voce não foi promovido");
        }
        
        
    }
}
