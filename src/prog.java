import java.util.Scanner;
import java.util.Locale;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double medticket, volume;
		int score, compras, atrasos;
		char pagamento;
		score = 0;
		
		//inicio do cabecalho
		
		System.out.println("SISTEMA DE PERFIL DO CLIENTE");
		System.out.println("------------------------------------");
		System.out.println("");
		
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		//fim do cabecalho
		
		//inicio da leitura do volume
		System.out.printf("Quantas compras o cliente fez no �ltimo ano? ");
		compras = sc.nextInt();
		System.out.printf("Qual o ticket m�dio? ");
		medticket = sc.nextDouble();
		
		
		
		//inicio da leitura de outros dados
		
		System.out.printf("Quantas vezes o cliente atrasou o pagamento? ");
		atrasos = sc.nextInt();
		
		System.out.printf("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		pagamento = sc.next().charAt(0);
		
		//fim da leitura dos outros dados
		 
		//Come�o do calculo de volume
		volume = compras * medticket;
		if (compras >= 0) {
			if (volume <= 3000 && compras == 1) {
				score = score + 20;
			} else {
				if (volume <= 3000 && compras > 1) {
					score = score + 40;
				} else {
					if (volume > 3000) {
						score = score + 60;
					}
				}
			}
			
		}
		
		
		System.out.printf("Score do volume de compras = "+ score+" pontos");
		//fim do c�lculo de volume
		 
		sc.close();
	}

}
