import java.util.Scanner;

public class EX4 {
	public static void main(String[] args) {
//		Escreva um programa em que:
//			a) Preencha uma matriz quadrada de ordem 4 com valores informados pelo usuário da
//			aplicação. O preenchimento da matriz deverá ser feito em um método.
//			b) Gere e imprima no vídeo uma nova matriz a partir da matriz preenchida obedecendo a
//			seguinte regra: cada posição da nova matriz é a soma de todos os elementos da linha e da
//			coluna em que a posição se encontra. Por exemplo: 
				
		int[][] nums = new int[4][4];
		
		fill(nums);
		
		printsums(nums);
	}

	public static void fill(int[][] x) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<x.length; i++) {
			for(int j = 0; j<x[i].length;j++) {
				System.out.print("Informe o valor da linha "+ (i+1)+ " coluna "+ (j+1)+" -> ");
				x[i][j] = in.nextInt();
				
			}
		}
	}

	public static void printsums(int[][] x) {
		int rowsum =0;
		int colsum =0;
		
		int[] rows = new int[4];
		int[] columns = new int[4];
		for(int i=0;i<x.length;i++) {
			for(int j = 0; j<x[i].length;j++) {
				rowsum += x[i][j];
				colsum += x[j][i];
				
				if(j== x[i].length-1) {
					rows[i] = rowsum;
					columns[i] = colsum;
					rowsum = 0;
					colsum = 0;
				}
			}
		}
		
		for(int i=0;i<x.length;i++) {
			for(int j=0; j<x[i].length;j++) {
				System.out.print(rows[i]+columns[j]-x[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
