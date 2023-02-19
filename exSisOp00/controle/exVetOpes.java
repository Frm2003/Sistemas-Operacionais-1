package exSisOp00.controle;

public class exVetOpes {
	public void op1000() {
		StringBuffer buffer = new StringBuffer();
		long vet[] = new long [1000];
		
		double tInit = System.nanoTime();
		
		for (long num : vet) {
			buffer.append("Texto");
		}
		
		double tFinal = System.nanoTime();
		System.out.print("Buffer 1000: " + (tFinal - tInit) / Math.pow(10, 9) + "\n");
	}
	
	public void op10000() {
		StringBuffer buffer = new StringBuffer();
		long vet[] = new long [10000];
		
		double tInit = System.nanoTime();
		
		for (long num : vet) {
			buffer.append("Texto");
		}
		
		double tFinal = System.nanoTime();
		System.out.print("Buffer 10000: " + (tFinal - tInit) / Math.pow(10, 9) + "\n");
	}
	
	public void op100000() {
		StringBuffer buffer = new StringBuffer();
		long vet[] = new long [100000];
		
		double tInit = System.nanoTime();
		
		for (long num : vet) {
			buffer.append("Texto");
		}
		
		double tFinal = System.nanoTime();
		System.out.print("Buffer 100000: " + (tFinal - tInit) / Math.pow(10, 9));
	}
}
