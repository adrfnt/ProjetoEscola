package ProjetoJava;

import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class projetoEscola {
	
	//Passando para Java do Portugol, trabalho em Grupo realizado com Ana Flavia, Guilherme Lopes, Robson e Leto.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();

		final int qtdeTotalBoletim = 3, rodada = 3;
		int matricula = 1, numero, diaAniversario = 0, mesAniversario = 0, contatodorPedidoCreditoPos = 1,
				creditoMestrado = 1;
		int qtdeMes[] = new int[12];
		int mesAtual = gc.get(Calendar.MONTH);
		int diaAtual = gc.get(Calendar.DAY_OF_MONTH);
		String cpf = "000.000.000-00";
		String tipo[] = { "Básico", "MÉDIO", "GRADUAÇÃO", "PÓS", "MESTRADO" };
		double pontos, somaPontos = 0.00;
		boolean status = true;
		char nota, continuar, pediBoletim, pedirCreditoPos, usarCreditoMestrado;

		do {

			System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
			System.out.println("-----------------------------------");
			System.out.println("1 - Básico\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR");
			System.out.println("Digite o código da opção selecionada: ");
			numero = teclado.nextInt();
			switch (numero) {

			case 1: {
				somaPontos = 0;
				System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
				System.out.println("-----------------------------------");
				System.out.println("Ensino: " + tipo[numero - 1]);
				System.out.println("Matricula: " + matricula);
				System.out.println("CPF: " + cpf);
				if (status == true) {
					System.out.println("Status: 1 - Ativo");
				} else {
					System.out.println("Status: 2 - Inativo");
				}
				System.out.println("-----------------------------------");
				System.out.println("Informe o dia de aniversario: ");
				diaAniversario = teclado.nextInt();
				System.out.println("Informe o mes de aniversario: ");
				mesAniversario = teclado.nextInt();
				System.out.println("-----------------------------------");
				if ((mesAniversario - 1) == mesAtual && diaAniversario == diaAtual) {
					for (int i = 0; i < rodada; i++) {
						System.out.printf("\nTotal de nota: %.2f", somaPontos);
						System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
						nota = teclado.next().toUpperCase().charAt(0);
						System.out.println("Valor do movimento: ");
						pontos = teclado.nextDouble();

						if (nota == 'I') {
							somaPontos += (pontos * 1.1);
						} else if (nota == 'R') {
							somaPontos -= pontos;
						}
						System.out.println("Deseja continuar S/N: ");
						continuar = teclado.next().toUpperCase().charAt(0);
						if (continuar == 'N') {
							if (somaPontos < 0) {
								somaPontos = 0;
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
								break;
							} else {
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
							}
						}
						if (i == rodada - 1 && continuar == 'S') {
							if (somaPontos < 0) {
								somaPontos = 0;
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
							} else {
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
							}
						}

					}

				} else {
					for (int i = 0; i < rodada; i++) {
						System.out.printf("\nTotal de nota: %.2f", somaPontos);
						System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
						nota = teclado.next().toUpperCase().charAt(0);
						System.out.println("Valor do movimento: ");
						pontos = teclado.nextDouble();

						if (nota == 'I') {
							somaPontos += pontos;
						} else if (nota == 'R') {
							somaPontos -= pontos;
						}
						System.out.println("Deseja continuar S/N: ");
						continuar = teclado.next().toUpperCase().charAt(0);
						if (continuar == 'N') {
							if (somaPontos < 0) {
								somaPontos = 0;
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
								break;
							} else {
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
							}
						}
						if (i == rodada - 1 && continuar == 'S') {
							if (somaPontos < 0) {
								somaPontos = 0;
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
							} else {
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
							}
						}
					}

				}

				break;
			}
			case 2: {
				somaPontos = 0;
				System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
				System.out.println("-----------------------------------");
				System.out.println("Ensino: " + tipo[numero - 1]);
				System.out.println("Matricula: " + matricula);
				System.out.println("CPF: " + cpf);
				if (status == true) {
					System.out.println("Status: 1 - Ativo");
				} else {
					System.out.println("Status: 2 - Inativo");
				}
				System.out.println("-----------------------------------");
				for (int i = 0; i < rodada; i++) {
					System.out.printf("\nTotal de nota: %.2f", somaPontos);
					System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
					nota = teclado.next().toUpperCase().charAt(0);
					System.out.println("Valor do movimento: ");
					pontos = teclado.nextDouble();

					if (nota == 'I') {
						somaPontos += pontos;
					} else if (nota == 'R') {
						somaPontos -= pontos;
					}
					System.out.println("Deseja continuar S/N: ");
					continuar = teclado.next().toUpperCase().charAt(0);

					if (continuar == 'N') {
						if (somaPontos < 0) {
							somaPontos = 0;
							System.out.println("Deseja imprimir S/N: ");
							pediBoletim = teclado.next().toUpperCase().charAt(0);
							if (pediBoletim == 'S' && qtdeMes[mesAtual - 1] < qtdeTotalBoletim) {
								qtdeMes[mesAtual - 1]++;
								System.out.printf("\nImpressão do Boletim %d/%d ", qtdeMes[mesAtual - 1],
										qtdeTotalBoletim);
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
								break;
							} else {
								System.out.printf("Quantidade de impressões no mês: %d",
										qtdeTotalBoletim - qtdeMes[mesAtual - 1]);
								break;
							}

						} else {
							System.out.println("Deseja imprimir S/N: ");
							pediBoletim = teclado.next().toUpperCase().charAt(0);
							if (pediBoletim == 'S' && qtdeMes[mesAtual - 1] < qtdeTotalBoletim) {
								qtdeMes[mesAtual - 1]++;
								System.out.printf("\nImpressão do Boletim %d/%d ", qtdeMes[mesAtual - 1],
										qtdeTotalBoletim);
								System.out.printf("\nTotal de nota: %.2f", somaPontos);
								break;
							} else {
								System.out.printf("Quantidade de impressões no mês: %d",
										qtdeTotalBoletim - qtdeMes[mesAtual - 1]);
								break;
							}
						}
					}
					if (i == rodada - 1 && continuar == 'S') {
						if (somaPontos < 0) {
							somaPontos = 0;
						}
						System.out.println("Deseja imprimir S/N: ");
						pediBoletim = teclado.next().toUpperCase().charAt(0);
						if (pediBoletim == 'S' && qtdeMes[mesAtual - 1] < qtdeTotalBoletim) {
							qtdeMes[mesAtual - 1]++;
							System.out.printf("\nImpressão do Boletim %d/%d ", qtdeMes[mesAtual - 1], qtdeTotalBoletim);
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
							break;
						} else {
							System.out.printf("Quantidade de impressões no mês: %d",
									qtdeTotalBoletim - qtdeMes[mesAtual - 1]);
							break;
						}
					}

				}
				break;
			}
			case 3: {
				somaPontos = 0;
				int usarBonus = 2;
				System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
				System.out.println("-----------------------------------");
				System.out.println("Ensino: " + tipo[numero - 1]);
				System.out.println("Matricula: " + matricula);
				System.out.println("CPF: " + cpf);
				if (status == true) {
					System.out.println("Status: 1 - Ativo");
				} else {
					System.out.println("Status: 2 - Inativo");
				}
				System.out.println("-----------------------------------");
				for (int i = 0; i < rodada; i++) {
					System.out.printf("\nTotal de nota: %.2f", somaPontos);
					System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
					nota = teclado.next().toUpperCase().charAt(0);
					System.out.println("Valor do movimento: ");
					pontos = teclado.nextDouble();

					if (nota == 'I') {
						somaPontos += pontos;
					} else if (nota == 'R') {
						somaPontos -= pontos;
					}
					if (somaPontos < 0 && usarBonus > 0) {
						somaPontos = 0;
						usarBonus--;
						System.out.printf("\nPontuação negativa. Usaremos o bonus. Total de Bonus: %d", usarBonus);
					} else if (somaPontos < 0 && usarBonus == 0) {
						System.out.printf(
								"\nPontuação negativa. Não há bonus, pontuação continuará negativa. Total de Bonus: %d",
								usarBonus);
					}
					System.out.println("\nDeseja continuar S/N: ");
					continuar = teclado.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						if (somaPontos > 0) {
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
							System.out.printf("\nTotal de Bonus: %d", usarBonus);
							break;
						} else {
							somaPontos = 0;
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
							System.out.printf("\nTotal de Bonus: %d", usarBonus);
						}
					}
					if (i == rodada - 1 && continuar == 'S') {
						if (somaPontos < 0) {
							somaPontos = 0;
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
						} else {
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
						}
					}

				}

				break;
			}
			case 4: {
				somaPontos = 0;

				System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
				System.out.println("-----------------------------------");
				System.out.println("Ensino: " + tipo[numero - 1]);
				System.out.println("Matricula: " + matricula);
				System.out.println("CPF: " + cpf);
				if (status == true) {
					System.out.println("Status: 1 - Ativo");
				} else {
					System.out.println("Status: 2 - Inativo");
				}
				System.out.println("-----------------------------------");
				for (int i = 0; i < rodada; i++) {
					System.out.printf("\nTotal de nota: %.2f", somaPontos);
					System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
					nota = teclado.next().toUpperCase().charAt(0);
					System.out.println("Valor do movimento: ");
					pontos = teclado.nextDouble();

					if (nota == 'I') {
						somaPontos += pontos;
					} else if (nota == 'R') {
						somaPontos -= pontos;
					}
					System.out.printf("\nTotal de credito: %d\n", contatodorPedidoCreditoPos);
					System.out.println("Deseja solicitar credito? S/N: ");
					pedirCreditoPos = teclado.next().toUpperCase().charAt(0);
					if (contatodorPedidoCreditoPos > 0 && pedirCreditoPos == 'S') {
						somaPontos += 5;
						contatodorPedidoCreditoPos--;
						System.out.printf("\nUsou o credito. Total de credito: %d\n", contatodorPedidoCreditoPos);
					} else if (contatodorPedidoCreditoPos == 0 && pedirCreditoPos == 'S') {
						System.out.println("Credito já solicitado.");
					}
					System.out.println("Deseja continuar? S/N: ");
					continuar = teclado.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						if (somaPontos < 0) {
							somaPontos = 0;
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
							break;
						} else {
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
						}
					}
					if (i == rodada - 1 && continuar == 'S') {
						System.out.printf("\nTotal de credito: %d\n", contatodorPedidoCreditoPos);
						System.out.println("Deseja solicitar credito? S/N: ");
						pedirCreditoPos = teclado.next().toUpperCase().charAt(0);
						if (contatodorPedidoCreditoPos > 0 && pedirCreditoPos == 'S') {
							somaPontos += 5;
							contatodorPedidoCreditoPos--;
							System.out.printf("\nUsou o credito. Total de credito: %d\n", contatodorPedidoCreditoPos);
						} else if (contatodorPedidoCreditoPos == 0 && pedirCreditoPos == 'S') {
							System.out.println("Credito já solicitado.");
						}
						if (somaPontos < 0) {
							somaPontos = 0;
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
						} else {
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
						}
					}
				}

				break;
			}
			case 5: {
				somaPontos = 0;
				System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
				System.out.println("-----------------------------------");
				System.out.println("Ensino: " + tipo[numero - 1]);
				System.out.println("Matricula: " + matricula);
				System.out.println("CPF: " + cpf);
				if (status == true) {
					System.out.println("Status: 1 - Ativo");
				} else {
					System.out.println("Status: 2 - Inativo");
				}
				System.out.println("-----------------------------------");
				for (int i = 0; i < rodada; i++) {
					System.out.printf("\nTotal de nota: %.2f", somaPontos);
					System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
					nota = teclado.next().toUpperCase().charAt(0);
					System.out.println("Valor do movimento: ");
					pontos = teclado.nextDouble();

					if (nota == 'I') {
						somaPontos += pontos;
					} else if (nota == 'R') {
						somaPontos -= pontos;
					}
					System.out.printf("\nTotal de credito: %d\n", contatodorPedidoCreditoPos);
					System.out.println("Deseja solicitar credito? S/N: ");
					usarCreditoMestrado = teclado.next().toUpperCase().charAt(0);
					if (creditoMestrado > 0 && usarCreditoMestrado == 'S') {
						somaPontos += 5;
						creditoMestrado--;
						System.out.printf("\nUsou o credito. Total de credito: %d\n", creditoMestrado);
					} else if (creditoMestrado == 0 && usarCreditoMestrado == 'S') {
						System.out.println("Credito já solicitado.");
					}
					System.out.println("Deseja continuar? S/N: ");
					continuar = teclado.next().toUpperCase().charAt(0);
					if (continuar == 'N') {
						if (somaPontos < 0) {
							somaPontos = 0;
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
							break;
						} else {
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
						}
					}
					if (i == rodada - 1 && continuar == 'S') {
						System.out.printf("\nTotal de credito: %d\n", creditoMestrado);
						System.out.println("Deseja solicitar credito? S/N: ");
						usarCreditoMestrado = teclado.next().toUpperCase().charAt(0);
						if (creditoMestrado > 0 && usarCreditoMestrado == 'S') {
							somaPontos += 10;
							creditoMestrado--;
							System.out.printf("\nUsou o credito. Total de credito: %d\n", creditoMestrado);
						} else if (creditoMestrado == 0 && usarCreditoMestrado == 'S') {
							System.out.println("Credito já solicitado.");
						}
						if (somaPontos < 0) {
							somaPontos = 0;
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
						} else {
							System.out.printf("\nTotal de nota: %.2f", somaPontos);
						}
					}
				}
				break;
			}
			case 6: {
				System.out.println("Fim do programa!");
				break;
			}
			default: {
				System.out.println("Opção Inválida!");
				break;
			}
			}

		} while (numero != 6);

		teclado.close();

	}

}
