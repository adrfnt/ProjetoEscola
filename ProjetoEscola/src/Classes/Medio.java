package Classes;

public class Medio extends Estudante {

    private int contadorBoletim = 3;

    public Medio(int matricula, String cpf) {
        super(matricula, cpf);
    }


    public Medio(int matricula, String cpf, boolean status) {
        super(matricula, cpf, status);
    }


    public int getContadorBoletim() {
        return contadorBoletim;
    }

    public void setContadorBoletim(int contadorBoletim) {
        this.contadorBoletim = contadorBoletim;
    }

    public void  pediBoletim(char pediBoletim) {
        if(pediBoletim == 'S' && this.contadorBoletim>0) {
            this.contadorBoletim--;
            System.out.printf("\nImpressão do Boletim %d/3",this.contadorBoletim);
            System.out.printf("\nTotal de nota: %.2f\n",this.getPontos());
        }else {
            System.out.printf("\nQuantidade de impressões no mês: %d\n",this.contadorBoletim);
        }

    }

}
