import java.util.Scanner;

public class EX1 {
	public static void main(String[] args) {
//		Escreva um programa em Java que leia uma data no formato dd/mm/aaaa. O seu programa
//		gerar e imprimir no vídeo a data no formato americano aaaa-dd-mm. 
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Por favor informe a data no formato dd/mm/aaaa ->");//Por favor colocar com as barras para q o código funcione
		String date = in.nextLine();
		String adate="";
		String aux="";
		
		aux = date.substring(6,10);
		adate = adate.concat(aux+ "/");
		
		aux = date.substring(0,3);
		adate = adate.concat(aux);
		
		aux = date.substring(3, 5);
		adate = adate.concat(aux);
		
		adate = adate.replace('/', '-');
		
		System.out.println(adate);
	}
}
