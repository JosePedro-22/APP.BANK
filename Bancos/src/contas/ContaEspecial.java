package contas;
import classes.Pessoa;
import classes.Taxas;

public final class ContaEspecial extends Conta implements Taxas{ // extends, é a extenssao de uma outra funçao a qual eu posso utilizar todo o seus parametros
	private float limite;
	
	public ContaEspecial() {	}
	
	public ContaEspecial(int numero, Pessoa correntista, float valor, float limite) {
		super(numero,correntista,valor); //construtor de uma classe gerenica faz a passagem da informaçao (super())
		this.setLimite(limite);
	}
	
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public float getLimite() {
		return limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() - valor >= this.getLimite()) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}else 
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
