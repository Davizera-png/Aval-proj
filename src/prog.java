import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int compras;
		double ticket;
		
		//leitura de dados
		
		System.out.println("SISTEMA DE PERFIL DO CLIENTE");
		System.out.println("------------------------------------");
		System.out.println("");
		
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		//fim do cabecalho
		
		System.out.printf("Quantas compras o cliente fez no �ltimo ano? ");
		compras = sc.nextInt();
		System.out.printf("Qual o ticket m�dio? ");
		ticket = sc.nextDouble();
		
		sc.close();
	}

}
