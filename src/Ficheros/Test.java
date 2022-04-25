package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		Scanner ent = new Scanner(System.in);
		int num = 0;

		try {
			System.out.println("TABLA DE MULTIPLICAR \n" + "Introduce el numero que quieras saber su tabla");
			num = ent.nextInt();
			fw = new FileWriter("La tabla del " + num + ".txt");
			bw = new BufferedWriter(fw);
			for (int i = 1; i <= 10; i++) {

				bw.write(num + " X " + i + "= " + (num * i));
				bw.newLine();

			}

		} catch (IOException ex) {
			System.out.println("Error de E/S");
		} catch (InputMismatchException ex) {
			System.out.println("Introduce un número");
		}

		finally {

			try {
				if (bw != null && fw != null) {
					bw.close();
					fw.close();
				}
			} catch (Exception ex) {
				System.out.println("Error al cerrar");
			}
		}
	}

}
