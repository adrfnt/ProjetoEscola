package Classes;

public class Graduacao extends Estudante {

	private double bonus = 2.00;
	
	public Graduacao(int matricula, String cpf, double bonus) {
		super(matricula, cpf);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void tirarNota(double pontos) {
		double aux = 0.00;
		if (super.getPontos() >= pontos) {
			super.tirarNota(pontos);
		} else if ((super.getPontos() + bonus) >= pontos) {
			aux = pontos - super.getPontos();
			bonus = bonus - aux;
			super.adicionarNota(aux);
			super.tirarNota(pontos);
		} else {
			System.out.println("Impossivel realizar operação!");
		}
	}
}
