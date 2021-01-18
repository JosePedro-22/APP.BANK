package apps;

import classes.Pessoa;
import contas.ContaEspecial;

public class appContaEspecial {

	public static void main(String[] args) {
		Pessoa p1;
		ContaEspecial e1;
		
		p1 = new Pessoa("Fulano","fulano@gmail.com");
		e1 = new ContaEspecial(12345, p1, 00.00f, -1000.00f);
		
		System.out.println("Saldo na conta inicial �: " + e1.getSaldo());
		System.out.println("\nO Limite da conta �: " + e1.getLimite());
		
		
		if(e1.sacar(1500.00f))
			System.out.println("\nOpera�ao realizada com sucesso!");
		else 
			System.out.println("\nOpera�ao nao pode ser realizada!");
		
		System.out.println("\nO saldo atual da conta �: "+ e1.getSaldo());
		
		e1.descontarTaxaManutencao();
		System.out.println("\nSaldo apos desconto de taxa de manuten��o: " + e1.getSaldo());
		
	}
}

