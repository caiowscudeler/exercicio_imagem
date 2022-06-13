import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, m[][] = new int[16][16];//declarar variavel de matriz 16x16
		
		System.out.printf("Crie um desenho a partir de uma matriz 16x16\n");//exibir texto ao usuario
	
		for (n1 = 0; n1 < 16; n1++) {//estrutura de repeticao

			System.out.printf("Cores: Branco(0); Preto(1); Vermelho(2); e Bege(3).\nInforme as cores da %da. linha:\n",
					(n1 + 1));//informacoes exibidas ao usuario e a contagem
			for (n2 = 0; n2 16; n2) {//estrutura de repeticao com colunas da matriz
				System.out.printf("m[%d][%d] = ", i, j);//receber coordenada da matriz
				m[n1][n2] = ler.nextInt();//guardar valor em coordenada
			}
			System.out.printf("\n");//pular linha
		}
		System.out.printf("\n");//pular linha
	
		for (n1 = 0; n1 < 16; n1++) {//estrutura de repeticao com linhas da matriz
			for (n2 = 0; n2 < 16; n2++) {//estrutura de repeticao de colunas
				System.out.printf("%d ", m[i][j]);//valor de acordo com as coordenadas
			}
			System.out.printf("\n");//pular linha
		}
	}
}
