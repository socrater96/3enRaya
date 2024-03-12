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
					System.out.println("Introduzca 0/1 en fila "+(i+1)+" y columna "+(j+1));
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
	static void fila(int [][] tablero) {
		boolean coincide=false;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(tablero[i][0]==tablero[i][j]) {
					coincide=true;
				}
				else
					coincide=false;
			}
			if(coincide) {
				System.out.println("Hay una fila con 3 en raya");
				break;
			}
		}
	}
	static void columna(int [][] tablero) {
		boolean coincide=false;
		for(int j=0;j<3;j++) {
			coincide=true;
			for(int i=0;i<3;i++) {
				if(tablero[0][j]!=tablero[i][j]) {
					coincide=false;
					break;
				}
			}
			if(coincide) {
				System.out.println("Hay una columna con 3 en raya");
				break;
			}
		}
	}
	static void diagonal(int [][] tablero) {
		boolean coincide=false;
		for(int i=0;i<3;i++) {
			if(tablero[0][0]==tablero[i][i]) {
				coincide=true;
			}
			else
				coincide=false;
		}
		if(coincide) {
			System.out.println("Hay una diagonal con 3 en raya");
		}
			
	}
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int[][] tablero = new int[3][3];
		tablero=llenadoTablero(in);
		visualizarTablero(tablero);
		fila(tablero);
		columna(tablero);
		diagonal(tablero);
		
	}
	static void visualizarTablero(int[][] tablero) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(tablero[i][j]+"\t");
			}
		System.out.println("");
		}
	}
}
