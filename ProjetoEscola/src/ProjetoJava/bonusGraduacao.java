package ProjetoJava;

import java.util.Scanner;
import Classes.Graduacao;


public class bonusGraduacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		System.out.print("Digite o n da matricula: ");
		int matricula = leia.nextInt();
		System.out.print("Digite o cpf: ");
		String cpf = leia.next();
		System.out.print("Digite o valor da nota inicial: ");
		double nota = leia.nextDouble();
		
		Graduacao grad1 = new Graduacao(matricula, cpf, 2);
		grad1.getMatricula();
		grad1.getCpf();
		grad1.adicionarNota(nota);

				
        
        char op = ' ';
   
        System.out.println("Nota do grad 1: " + grad1.getPontos());
        for (int x=1; x<=10; x++) {
            
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
            leia.close();
        }

	}

}



