import java.util.Scanner;

public class Test06Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX_ALUMNOS = 20;
		
		int[] notas = new int[20];
		
		// Pedir las notas al usuario y guardalas en el array
		for(int i = 0; i < notas.length; i++) {
			notas[i] = sc.nextInt();
		}
		
		for(int i = 0; i < notas.length; i++) {
			if (notas[i] >= 0 && notas[i] <= 10) {
				if (notas[i] >= 5) {
					System.out.println("Aprovado");
				} else if (notas[i] < 5) {
					System.out.println("Suspendido");
			} else {
					System.out.println("No válido");
			}
		}
	}
		
	}
}
