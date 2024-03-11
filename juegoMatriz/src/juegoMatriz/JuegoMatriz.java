//Hacer un tres en raya en la cual vayas llenando una matriz bidimensional (3x3) con 0 y 1 y cuando acabes indique si hay almenos una linea 
// horizontal, una vertical y otra diagonal.
package juegoMatriz;
import java.util.InputMismatchException;
import java.util.Scanner;
public class JuegoMatriz {
	public static int[][] llenadoTablero(Scanner in) {
		int[][] tablero = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				do {
					System.out.println("Introduzca 0/1 en columna "+i+" y fila "+j);
					try {
						tablero[i][j]=in.nextInt();
						in.nextLine();
					}catch(InputMismatchException ioe) {
						in.nextLine();
						tablero[i][j]=-1;
					}
				}while(tablero[i][j]!=1 && tablero[i][j]!=0);
			}
		}
		return tablero;
	}
	static boolean fila(int [][] tablero) {
		boolean coincide=false;
		for(int i=0;i<3;i++) {
			coincide=true;
			for(int j=0;j<2;j++) {
				if(tablero[i][j]!=tablero[i][j+1]) {
					coincide=false;
				}
				else
					coincide=true;	
			}
			if(coincide) {
				System.out.println("Hay una fila con 3 en raya");
				return true;
			}	
		}
		return false;
	}
	static boolean columna(int [][] tablero) {
		return false;
	}
	static boolean diagonal(int [][] tablero) {
		return false;
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int[][] tablero = new int[3][3];
		boolean hay=false;
		tablero=llenadoTablero(in);
		visualizarTablero(tablero);
		hay=fila(tablero);
		hay=columna(tablero);
		hay=diagonal(tablero);
		
	}
	static void visualizarTablero(int[][] tablero) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(tablero[i][j]+"\t");
			}
		System.out.println("");
		}
	}
}
