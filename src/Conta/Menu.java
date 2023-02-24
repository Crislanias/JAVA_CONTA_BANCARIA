
		       package Conta;

import java.util.Scanner;

import Conta.Util.Cores;
import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.conta;

public class Menu {
	
	
	
    public static void main(String[] args) {
    	
    	//testes 
    	
    	conta c1= new conta (1,123,1, "Adriana", 10000.00f);
    	c1.visualizar();
    	c1.sacar(2000000.00f);
    	c1.visualizar();
    	c1.depositar(200.0f);
    	c1.visualizar();
    	
    	ContaCorrente cc1= new ContaCorrente (2,123, 1,"Marianan", 1500.0f,1000.0f);    	
    	cc1.visualizar();
    	cc1.sacar (12000.00f);
    	cc1.visualizar();
    	cc1.depositar(500.0f);
    	cc1.visualizar();

    	
    	// testes
    	
    	
        Scanner input = new Scanner(System.in);
        int opcaoUsuario;

        while (true){
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND+"*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                BANCO DO BRAZIL COM Z                ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Criar Conta                          ");
            System.out.println("            2 - Listar todas as Contas               ");
            System.out.println("            3 - Buscar Conta por Numero              ");
            System.out.println("            4 - Atualizar Dados da Conta             ");
            System.out.println("            5 - Apagar Conta                         ");
            System.out.println("            6 - Sacar                                ");
            System.out.println("            7 - Depositar                            ");
            System.out.println("            8 - Transferir valores entre Contas      ");
            System.out.println("            9 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");
            opcaoUsuario = input.nextInt();

            if (opcaoUsuario == 9) {
                System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                input.close();
                System.exit(0);
            }

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Criar conta:\n\n");

                    break;
                case 2:
                    System.out.println("Listar todas as contas:\n\n");

                    break;
                case 3:
                    System.out.println("Consultar dados da Conta - por número:\n\n");

                    break;
                case 4:
                    System.out.println("Atualizar dados contas:\n\n");

                    break;
                case 5:
                    System.out.println("Apagar conta:\n\n");

                    break;
                case 6:
                    System.out.println("Saque:\n\n");

                    break;
                case 7:
                    System.out.println("Depósito:\n\n");

                    break;
                case 8:
                    System.out.println("Transferência entre contas:\n\n");

                    break;
                default:
                    System.out.println("Opção inválida!\n\n");
                    break;
            }

        }
    }
}