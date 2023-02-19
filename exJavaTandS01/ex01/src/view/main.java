package exJavaTandS01.ex01.src.view;

import java.util.concurrent.Semaphore;
import exJavaTandS01.ex01.src.controller.controle;

public class main {
	
	public static Semaphore s1;
	
	public static void main(String[] args) {
		int qtdPar = 0;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 5 == 0) {
				qtdPar++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + qtdPar);
		
		//s1 = new Semaphore(1);
		
		/*for (int i = 0; i < 21; i++) {
			Thread t = new controle(s1);
			t.start();
		}*/
	}
}
