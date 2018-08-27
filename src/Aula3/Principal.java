package Aula3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		SequentialList sQl = new SequentialList(5);
		int num = Integer.parseInt(
				JOptionPane.showInputDialog("Insira um numero"));
		
		int vetor [] = new int [5];
		
		sQl.insert(23);
		sQl.insert(-3);
		sQl.insert(1);
		sQl.insert(50);
		sQl.insert(5);
		
		sQl.print();
		
		sQl.remove(4);
		sQl.insert(4, 4);
		sQl.remove(0);
		sQl.insert(num, 0);
		System.out.println("\n");
		System.out.println("Tamanho da lista: = " + sQl.getSize());
		System.out.println("\n");
		sQl.remove(4);
		sQl.insert(0, 4);
		sQl.remove(1);
		sQl.insert(10, 1);
		
		
		
		for (int i = 0; i <= 4; i++){
			
			vetor[i] = sQl.get(i);
			System.out.print("["+vetor[i]+"]");
		} 
	}
	
		
	
	} // uma lista é dinamica , quer dizer ela aumenta o seu tamanho de acordo com a necessidade
	// diferente do vetor que tem um valor limitado.


