/*
        Já contratos de telefonia móvel não tem custo básico. Armazenam apenas as
        quantidades de minutos para cada tipo de destinatário (fixo ou móvel) e o valor da
        franquia (o desconto na franquia é de 30%).
 */

public abstract class ContratoTelMovel extends Contrato {

    private double numeroMinutosParaFixo;
    private double numeroMinutosParaMovel;

    public ContratoTelMovel(String nome, String CPF, int numero) {
        super(nome, CPF, numero);
    }

    public double getNumeroMinutosParaFixo() {        return numeroMinutosParaFixo;    }

    public void setNumeroMinutosParaFixo(double numeroMinutosParaFixo) {        this.numeroMinutosParaFixo = numeroMinutosParaFixo;    }

    public double getNumeroMinutosParaMovel() {        return numeroMinutosParaMovel;    }

    public void setNumeroMinutosParaMovel(double numeroMinutosParaMovel) {        this.numeroMinutosParaMovel = numeroMinutosParaMovel;    }

    @Override
    public String toString() {
        return "Contrato Telefonia Móvel: " + super.toString() + " Número de Minutos Para Fixo: " + numeroMinutosParaFixo +
                " Número de Minutos Para Móvel: " + numeroMinutosParaMovel;
    }
}
