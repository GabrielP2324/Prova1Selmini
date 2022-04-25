import java.util.Random;
import java.util.Scanner;

public class EX2 {
	public static void main(String[] args) {
//		Escreva um programa em Java que declare uma vari�vel para representar uma planta��o de caf�
//		com x linhas e y colunas. O valor de x e de y dever�o ser informados pelo usu�rio da aplica��o. O
//		programa dever�:
//		a) Preencher as c�lulas da vari�vel declarada com zeros (falha no plantio) ou uns (regi�o com
//		plantio). O preenchimento deve ser feito em um m�todo.
//		b) Imprima os dados da vari�vel no v�deo. A impress�o deve ser no formato de uma tabela. A
//		impress�o deve ser feita em um m�todo.
//		c) contar e retornar o total de regi�es que tem falha no plantio. A contagem deve ser feita por
//		um m�todo. 

		Scanner in = new Scanner(System.in);
		System.out.print("Quantas linhas tem na planta��o de caf�? ");
		int x = in.nextInt();
		System.out.print("Quantas colunas tem na planta��o de caf�? ");
		int y = in.nextInt();

		int[][] coffee = new int[x][y];

		fill(coffee);

		print(coffee);
		
		System.out.println("Regi�es com falha no plantio -> " + countFailed(coffee));
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
