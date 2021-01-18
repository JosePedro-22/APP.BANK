package contas;
import classes.Pessoa;
//Um atributo final de uma classe pode ter seu valor atribuído uma única vez, seja na própria declaração ou no construtor.
/**
 * A Classe <b>Conta</b> define um tipo de dados abstrato para a criacao da estrutura de classes de contas bancarias.
 * 
 * @author José Pedro S. Mesquita
 * @since jan 2021
 * @version 1.0
 * 
 */
public abstract class Conta {
	/**
	 * atributos protected criados para ser utilizado na classe conta
	 * 
	 * <b>numero</b> equivale ao numero da conta
	 * <b>correntista</b> atributo do tipo pessoa uma classe que tem as caracteristicas de um cliente
	 * <b>saldo</b> corresponde ao saldo que o cliente tem na sua conta
	 * <b>numero_de_contas</b> é apenas um contador, para auxiliar um metodo na contagem de id do banco.
	 * 
	 */
	protected int numero;
	protected Pessoa correntista;
	protected float saldo;
	private static int numero_contas;
	
	/**
	 * public final static <b>int SACAR</b> = 0 e public final static <b>int DEPOSITAR</b> = 1
	 * sao atributos estaticos que podem ser usado em qualquer momento do codigo, porem nao podem ser alterado
	 * sao estaticos.
	 */
	public final static int SACAR = 0;// atributos staticos 
	public final static int DEPOSITAR = 1;
	
	public Conta() {
		incrementaConta();
	}
	
	public Conta(int numero, Pessoa correntista, float valor) {
		this();// refere-se ao metodo statico na nossa classe
		this.setNumero(numero);
		this.setCorrentista(correntista);
		this.setSaldo(valor);
		
	}
	public final void setNumero(int numero) { // nao retorna 
		this.numero = numero;
	}
	
	public final int getNumero() { //vai retorna algo 
		return this.numero;
	}
	
	public final void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	
	public final Pessoa getCorrentista() {
		return this.correntista;
	}
	
	public final void setSaldo (float valor) {
		this.saldo = valor;
	}
	
	public final float getSaldo() {
		return this.saldo;
	}

	public final void depositar(Float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public abstract boolean sacar(float valor);
	
	
	private static void incrementaConta() {
		++numero_contas;
	}
	
	public boolean movimentar(float valor, int operacao) {
		boolean retorno = true;
		switch(operacao) {
		case DEPOSITAR:
			this.depositar(valor);
			break;
		
		case SACAR:
			retorno = this.sacar(valor);
			break;
			
		default:
			return false;
		}
		return retorno;
	}
	public int getNumeroContas() {
		return Conta.numero_contas;
	}
}