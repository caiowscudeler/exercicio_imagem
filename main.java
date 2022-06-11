import java.util.Scanner;

public class ExercicioDesenho {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, j, m[][] = new int[16][16];//declarar variavel de matriz 16x16
		
		System.out.printf("Crie um desenho a partir de uma matriz 16x16\n");//exibir texto ao usuario
	
		for (i = 0; i < 16; i++) {//estrutura de repeticao

			System.out.printf("Cores: Branco(0); Preto(1); Vermelho(2); e Bege(3).\nInforme as cores da %da. linha:\n",
					(i + 1));//informacoes exibidas ao usuario e a contagem
			for (j = 0; j < 16; j++) {//estrutura de repeticao com colunas da matriz
				System.out.printf("m[%d][%d] = ", i, j);//receber coordenada da matriz
				m[i][j] = ler.nextInt();//guardar valor em coordenada
			}
			System.out.printf("\n");//pular linha
		}
		System.out.printf("\n");//pular linha
	
		for (i = 0; i < 16; i++) {//estrutura de repeticao com linhas da matriz
			for (j = 0; j < 16; j++) {//estrutura de repeticao de colunas
				System.out.printf("%d ", m[i][j]);//valor de acordo com as coordenadas
			}
			System.out.printf("\n");//pular linha
		}
	}
}
