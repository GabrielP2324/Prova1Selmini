import java.util.Scanner;

public class EX3 {
	public static void main(String[] args) {
//		Escreva um programa em Java que preencha um vetor com 10 números inteiros informados via
//		teclado. O seu programa deverá calcular e imprimir no vídeo o valor do desvio padrão do conjunto
//		seguindo as instruções dadas acima. O programa deverá ter obrigatoriamente um método para
//		calcular e retornar a média aritmética do conjunto e outro método para calcular e retornar o desvio
//		padrão do conjunto
		
		int[] nums = new int[10];
		
		fill(nums);
		
		System.out.println("Média -> "+ avgCalc(nums));
		System.out.printf("Desvio Padrão -> %.2f", avgStdDev(nums));
	
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
