package Aula3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		SequentialList sQl = new SequentialList(5);
		int num = Integer.parseInt(
				JOptionPane.showInputDialog("Insira um número"));
		
		int vetor [] = new int [5];
		
		sQl.insert(23);
		sQl.insert(-3);
		sQl.insert(1);
		sQl.insert(50);
		sQl.insert(5);
		
		sQl.print();
		
		sQl.insert(4, 5);
		sQl.insert(num, 1);
		System.out.println(sQl.getSize());
		
		sQl.remove(4);
		sQl.remove(2);
		sQl.insert(10,2);
		
		
		for (int i = 0; i < 5; i++){
			
			vetor[i] = sQl.get(i);
			System.out.print("["+vetor[i]+"]");
		}

	}

}
