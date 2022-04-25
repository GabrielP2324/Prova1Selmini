import java.util.Random;
import java.util.Scanner;

public class EX2 {
	public static void main(String[] args) {
//		Escreva um programa em Java que declare uma variável para representar uma plantação de café
//		com x linhas e y colunas. O valor de x e de y deverão ser informados pelo usuário da aplicação. O
//		programa deverá:
//		a) Preencher as células da variável declarada com zeros (falha no plantio) ou uns (região com
//		plantio). O preenchimento deve ser feito em um método.
//		b) Imprima os dados da variável no vídeo. A impressão deve ser no formato de uma tabela. A
//		impressão deve ser feita em um método.
//		c) contar e retornar o total de regiões que tem falha no plantio. A contagem deve ser feita por
//		um método. 

		Scanner in = new Scanner(System.in);
		System.out.print("Quantas linhas tem na plantação de café? ");
		int x = in.nextInt();
		System.out.print("Quantas colunas tem na plantação de café? ");
		int y = in.nextInt();

		int[][] coffee = new int[x][y];

		fill(coffee);

		print(coffee);
		
		System.out.println("Regiões com falha no plantio -> " + countFailed(coffee));
	}

	public static void fill(int[][] x) {
		Random rng = new Random();

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = rng.nextInt(2);
			}
		}
	}

	public static void print(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] == 0) {
					System.out.print("X\t");// falha
				} else {
					System.out.print("O\t");// sucesso
				}
			}
			System.out.println();
		}

	}

	public static int countFailed(int[][] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] == 0) {
					count++;
				}
			}

		}
		return count;
	}
}
