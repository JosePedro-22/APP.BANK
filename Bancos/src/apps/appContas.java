package apps;

import classes.Pessoa;
import contas.Conta;
import contas.ContaComum;
import contas.ContaEspecial;

public class appContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Ciclano", "ciclano@gmail.com");
		ContaComum c1 = new ContaComum(123456,p1,150.00f);
		
		System.out.println("\nNumero de contas instanciadas ate o momento: "+ c1.getNumeroContas());
		
		ContaEspecial e1 = new ContaEspecial(1432456, p1, 2500.00f, 5500.00f);
		
		System.out.println("\nNumero de contas instanciadas ate o momento: "+ e1.getNumeroContas());
	
	/*
		if(c1.sacar(1000.00f)) {
			System.out.println("\nSaque realizado com sucesso...");
		}
		else
			System.out.println("\nImpossivel realizar o saque...");
	*/
		if(c1.movimentar(1000.00f, Conta.SACAR)) {// Conta.SACAR atributo  final tem um valor constante, definido como atributo de classe.
			System.out.println("\nSaque realizado com sucesso...");
		}
		else
			System.out.println("\nImpossivel realizar o saque...");
		
		
		System.out.println("Nome do correntista: "+c1.getCorrentista());// ao chamar getcorrentista ja se referencia ao nome, pelo fato de ter usado o toString para modificar 
		// a chamada do metodo.
	}

}
