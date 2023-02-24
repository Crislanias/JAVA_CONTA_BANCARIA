package repository;

import Model.conta;

public interface Conta_repository {
	
	// CRUD DA CONTA
	
	public void procuraPorNumero (int numero);
	public void listarTodas();
	public void cadastrar (conta conta);
	public void atualizar ( conta conta);
	public void deletar (int numero);
	
	//metodos Bancarios
	
	public void sacar (int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir (int numeroOrigem, int numero);
	
	

}
