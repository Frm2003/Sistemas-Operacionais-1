package exJavaThreads.ex04.view;

import exJavaThreads.ex04.controller.threadSapo;

public class main {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread sapo = new threadSapo();
			sapo.start();
		}	
	}
}
