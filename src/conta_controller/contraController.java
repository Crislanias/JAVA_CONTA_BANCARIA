package conta_controller;

import java.util.ArrayList;

import Model.conta;
import repository.Conta_repository;

public class contraController implements Conta_repository {

		private ArrayList <conta> listacontas = new ArrayList <conta>();
	@Override
	public void procuraPorNumero(int numero) {
		var conta = buscarNaCollection (numero);
		
		if (conta!=null)
			conta.visualizar();
		else
			System.out.println ("\nA Conta número: "+numero+"não foi encontrada");
		
	}

	@Override
	public void listarTodas() {
		for (var conta:  listacontas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(conta conta) {
		listacontas.add (conta);
		System.out.println("\nA Conta número: " + conta.getNumero()+ " foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(conta conta) {
		// TODO Auto-generated method stub
		var buscarconta= buscarNaCollection(conta.getNumero());
	
	if (buscarconta !=null) {
	listacontas.set(listacontas.indexOf(buscarconta), conta);
	System.out.println("\nA conta numero:" +conta.getNumero()+"foi atualizada com sucesso");
	
	} else 
		System.out.println("\nA Conta numero :" +conta.getNumero ()+ "não foi encontrada");

	
	}
	

	@Override
	public void deletar(int numero) {
var conta= buscarNaCollection (numero);

if (conta!=null) {
	if (listacontas.remove(conta)==true)
		System.out.println("\nA conta numero : "+numero + "não foi encontrada");
} else
	System.out.println("\nA conta numero: " +numero+"não foi encontrada");
}






	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numero) {
		// TODO Auto-generated method stub
		
	}

		public int gerarNumero() {
			return listacontas.size()+1;
		}
		
		
		public conta buscarNaCollection (int numero) {
			for (var conta: listacontas) {
				if (conta.getNumero() == numero){
					return conta;
				}
			}
			return null;
		}
		
		public int retornaTipo (int numero) {
			for (var conta: listacontas ) {
				if (conta.getNumero()== numero) {
					return conta.getTipo();
				}
			}
			return 0;
		}
		
		
		
		
		
		
		}

