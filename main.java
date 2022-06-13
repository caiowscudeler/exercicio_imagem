import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, n1, m[][] = new int[16][16];//declarar variaveis da matriz
		
		System.out.printf("Crie um desenho a partir de uma matriz 16x16\n");// texto exibido ao usuario
		
		for (n = 0; n < 16; n++) {//estrutura de repeticao
			System.out.printf("Cores: Branco(0); Preto(1); Vermelho(2); e Bege(3).\nInforme as cores da %da. linha:\n",
					(n + 1)); //texto exibido ao usuario co  a contagem
			for (n1 = 0; n1 < 16; n1++) {//estrutura de repeticao
				System.out.printf("m[%d][%d] = ", n, n1); //receber coordeenada da matriz do usuario
				m[n][n1] = ler.nextInt();//guardar valor na matriz
			}
			System.out.printf("\n");// Pular linha
		}
		System.out.printf("\n");// Pular linha
		for (n = 0; n < 16; n++) {//estrutura de repticao por linhas
			for (n1 = 0; n1 < 16; n1++) {//estrutura de repeticao por colunas
				System.out.printf("%d ", m[n][n1]);//exibir valores da coordenada da matriz
			}
			System.out.printf("\n");// Pular linha 
		}
	}
}
