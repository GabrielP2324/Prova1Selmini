import java.util.Scanner;

public class EX3 {
	public static void main(String[] args) {
//		Escreva um programa em Java que preencha um vetor com 10 n�meros inteiros informados via
//		teclado. O seu programa dever� calcular e imprimir no v�deo o valor do desvio padr�o do conjunto
//		seguindo as instru��es dadas acima. O programa dever� ter obrigatoriamente um m�todo para
//		calcular e retornar a m�dia aritm�tica do conjunto e outro m�todo para calcular e retornar o desvio
//		padr�o do conjunto
		
		int[] nums = new int[10];
		
		fill(nums);
		
		System.out.println("M�dia -> "+ avgCalc(nums));
		System.out.printf("Desvio Padr�o -> %.2f", avgStdDev(nums));
	
	}

	public static double avgStdDev(int[] x) {
		double avg = avgCalc(x);
		double[] values = new double[x.length];
		for(int i = 0; i<x.length;i++) {
			values[i] = x[i]-avg;
		}
		double total=0;
		for(int i = 0; i<x.length;i++) {
			total+= Math.pow(values[i],2);
		}
		
		return Math.sqrt(total/x.length);
	}

	public static double avgCalc(int[] x) {
		double sum = 0;
		double avg;
		for(int i = 0; i<x.length;i++) {
			sum +=x[i];
		}
		avg = sum/x.length;
		return avg;
	}

	public static void fill(int[] x) {
		Scanner in = new Scanner(System.in);

		for(int i = 0; i<x.length;i++) {
			System.out.print("Informe o valor "+ (i+1) + " do vetor");
			x[i] = in.nextInt();
		}
	}
}
