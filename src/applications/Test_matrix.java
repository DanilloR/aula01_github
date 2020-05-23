package applications;

import java.util.Scanner;

public class Test_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter matrix elements");
		System.out.println();
		System.out.print("Lines: ");
		int line = sc.nextInt();
		System.out.print("Columns: ");
		int column = sc.nextInt();
		
		int [][] mat = new int [line][column];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				System.out.print("Enter "+i+","+j+" element: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		sc.close();

	}

}
