package contas;
import classes.Pessoa;
import classes.Taxas;


public final class ContaComum extends Conta implements Taxas{
	
	public ContaComum() {	}
	
	public ContaComum(int numero, Pessoa correntista, float valor) {
		super(numero, correntista, valor);
	}
	
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}
	
	@Override
	public float getTaxaManutencao() {
		return (float) 15.00;
	}
	
	@Override
	public void descontarTaxaManutencao() {
		this.setSaldo(this.getSaldo() - this.getTaxaManutencao());
	}

}
