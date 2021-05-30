package ProjetoJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;

import Classes.Basico;
import Classes.Graduacao;
import Classes.Medio;
import Classes.Mestrado;
import Classes.Pos;



public class ProgramaTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Scanner leia = new Scanner (System.in);
		
		final int rodada = 10;
		int numero;
		double pontosx =0.0;
		char notax,continuar,pediBoletim;
		
		String tipo[] = { "BÁSICO", "MÉDIO", "GRADUAÇÃO", "PÓS", "MESTRADO" };
		
		
		System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
		System.out.println("-----------------------------------");
		System.out.println("1 - Básico\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - Lista de alunos inseridos\n7 - SAIR");
		System.out.println("-----------------------------------");
		System.out.println("Digite o código da opção selecionada: ");
		numero = teclado.nextInt();
		System.out.println("\n \n \n");
		switch (numero) {
		
		case 1: {
					
					System.out.println("\nENSINO BÁSICO\n");
				
					System.out.print("Digite o nome do aluno:");
			 		String nome = leia.next().toUpperCase();
			 		System.out.print("Digite o numero da matricula :");
			 		int matricula = leia.nextInt();
			 		System.out.print("Digite o cpf :");
			 		String cpf = leia.next();
			 		System.out.print("Digite o dia de aniversário :");
			 		int dia = leia.nextInt();
			 		System.out.print("Digite a nota inicial:");
			 		double nota = leia.nextDouble();

			 		Basico basic1 = new Basico(matricula,cpf,dia); 
			 		basic1.setNome(nome);
			 		basic1.adicionarNota(nota);
			 		System.out.printf("Pontos atuais do aluno %s = %.0f \n",basic1.getNome(),basic1.getPontos());
			 		System.out.println("Digite o dia atual :");
			 		int diaAtual = leia.nextInt();
			 		basic1.bonusAniversario(diaAtual);
			 		System.out.printf("Pontos após método do aluno %s = %.0f\n ",basic1.getNome(),basic1.getPontos());
			 		
			 		break;
				}


		case 2: {
				
			System.out.println("\nENSINO MÉDIO\n");
			
			System.out.print("Digite o nome do aluno:");
	 		String nome = leia.next().toUpperCase();
			 System.out.print("Digite o n da matricula: ");
		   	 int matricula = leia.nextInt();
		   	 System.out.print("Digite o cpf: ");
		   	 String cpf = leia.next();
		   	 
		   	 Medio medio1 = new Medio(matricula,cpf, true);
		   	 medio1.getMatricula();
		   	 medio1.getCpf();

		
			if (medio1.isStatus() == true) {
				System.out.println("Status: 1 - Ativo");
			} else {
				System.out.println("Status: 2 - Inativo");
			}

			System.out.println("-----------------------------------");
			for (int i = 0; i < rodada; i++) {
				do {
					System.out.printf("\nTotal de nota: %.2f", medio1.getPontos());
					System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
					notax = teclado.next().toUpperCase().charAt(0);
					System.out.println("Valor do movimento: ");
					pontosx = teclado.nextDouble();
					if (pontosx > medio1.getPontos() && notax == 'R') {
						System.out.printf("A nota ficará negativa. Total de pontos %.2f.", medio1.getPontos());
					}
				} while (pontosx > medio1.getPontos() && notax == 'R');

				if (notax == 'I') {
					medio1.adicionarNota(pontosx);
				} else if (notax == 'R') {

					medio1.tirarNota(pontosx);
				}
				System.out.println("Deseja continuar S/N: ");
				continuar = teclado.next().toUpperCase().charAt(0);

				if (continuar == 'N') {
					break;
				}
			}

			System.out.println("Deseja imprimir S/N: ");
			pediBoletim = teclado.next().toUpperCase().charAt(0);
			medio1.pediBoletim(pediBoletim);

			
			break;
		}
		case 3: {
		
			System.out.println("\nGRADUAÇÃO\n");
			
	
	   	 System.out.print("Digite o n da matricula: ");
	   	 int matricula = leia.nextInt();
	   	 System.out.print("Digite o cpf: ");
	   	 String cpf = leia.next();
	   	 System.out.print("Digite a nota inicial: ");
	   	 double nota = leia.nextDouble();
	   	 
	   	 Graduacao grad1 = new Graduacao(matricula, cpf, 2);
	   	 grad1.getMatricula();
	   	 grad1.getCpf();
	   	 grad1.adicionarNota(nota);

	   			 
	   	 char op = ' ';
	   
	   	 System.out.println("Nota do grad 1: " + grad1.getPontos());
	   	 for (int x=1; x<=rodada; x++) {
	   		 
	   		 System.out.println("Informe o valor: ");
	   		 nota = leia.nextDouble();
	   		 System.out.println("Digite 1- adicionar nota ou 2-debitar: ");
	   		 op = leia.next().charAt(0);
	   		 if (op == '1') {
	   			 grad1.adicionarNota(nota);
	   		 } else {
	   			 grad1.tirarNota(nota);
	   		 }
	   		 System.out.println("Valor atual do bônus: " + grad1.getBonus());
	   		 System.out.println("Novo saldo de nota de grad 1: " + grad1.getPontos());
	   	 }

			
			}
			
			break;
			
		
		case 4: {

			System.out.println("\nPÓS GRADUAÇÃO\n");
			
		   	 System.out.print("Digite o n da matricula: ");
		   	 int matricula = leia.nextInt();
		   	 System.out.print("Digite o cpf: ");
		   	 String cpf = leia.next();
		   	 System.out.print("Digite a nota inicial: ");
		   	 double nota = leia.nextDouble();
		   	 
		   
		   	 Pos pos1 = new Pos(matricula, cpf, 5);
		   	 pos1.getMatricula();
		   	 pos1.getCpf();
		   	 pos1.adicionarNota(nota);

		   			 
		   	 char op = ' ';
		 
		   	 System.out.println("Nota do grad 1: " + pos1.getPontos());
		   	 for (int x=1; x<=rodada; x++) {
		   		 
		   		 System.out.println("Informe o valor: ");
		   		 nota = leia.nextDouble();
		   		 System.out.println("Digite 1- adicionar nota ou 2-debitar: ");
		   		 op = leia.next().charAt(0);
		   		 if (op == '1') {
		   			pos1.adicionarNota(nota);
		   		 } else {
		   			pos1.tirarNota(nota);
		   		 }
		   		 System.out.println("Valor atual do bônus: " + pos1.getBonus());
		   		 System.out.println("Novo saldo de nota de grad 1: " + pos1.getPontos());
		   	 }

			break;
		}
		case 5: {
			
			System.out.println("\nMESTRADO\n");
			
	 		System.out.print("Digite o n da matricula: ");
		   	 int matricula = leia.nextInt();
		   	 System.out.print("Digite o cpf: ");
		   	 String cpf = leia.next();
		   	 System.out.print("Digite a nota inicial: ");
		   	 double nota = leia.nextDouble();
		   	 Mestrado mest1 = new Mestrado(matricula, cpf, 10);
		   	 mest1.getMatricula();
		   	 mest1.getCpf();
		   	 mest1.adicionarNota(nota);

		   			 
		   	 char op = ' ';		  
		   	 System.out.println("Nota do grad 1: " + mest1.getPontos());
		   	 for (int x=1; x<=10; x++) {
		   		 
		   		 System.out.println("Informe o valor: ");
		   		 nota = leia.nextDouble();
		   		 System.out.println("Digite 1- adicionar nota ou 2-debitar: ");
		   		 op = leia.next().charAt(0);
		   		 if (op == '1') {
		   			mest1.adicionarNota(nota);
		   		 } else {
		   			mest1.tirarNota(nota);
		   		 }
		   		 System.out.println("Valor atual do bônus: " + mest1.getBonus());
		   		 System.out.println("Novo saldo de nota de grad 1: " + mest1.getPontos());
		   	 }

				
			}
			break;
		
		case 6: {
			
			//Chamando a LISTA 1 collection!!
			Collection<String> nomes = new ArrayList<String>();
			//Adicionando Collection Manualmente, add como programador
			nomes.add("Leticia");
			nomes.add("Neymar");
			nomes.add("Jack");
			nomes.add("Steve Jobs");
			nomes.add("Bill Gates");
			nomes.add("Bia");
			nomes.add("Ednilson");
			nomes.add("Vagner");
			nomes.add("Ana");
			nomes.add("Lloris");
			nomes.add("James");
			nomes.add("Juliete");
			nomes.add("Hernanes");
			nomes.add("Cristiano Ronald");
			nomes.add("Marwa");
			nomes.add("Pogba");
			nomes.add("Bruno Fernandes");
			nomes.add("Rashford");
			nomes.add("Larissa Manoela");
			nomes.add("Billie Eilish");
			nomes.add("Dean");
			nomes.add("Sam");
			nomes.add("Johnnie Walker");
			nomes.add("Jack Daniels");
			nomes.add("Rogerio Ceni");
			
			System.out.println("Lista de todis ALUNIS matriculados na Escola: \n"); 
			
			//criando FOR EACH para percorrer os elementos
			for(String nome : nomes) {
				System.out.println(nome); 
			}
			
		}
			
		case 7: {
			System.out.println("Fim do programa!");
			break;
		}
		default: {
			System.out.println("Opção Inválida!");
			break;
		}
				
		}
		leia.close();
		teclado.close();
	}

}