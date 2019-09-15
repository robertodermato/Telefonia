/*
        Contratos de telefonia fixa armazenam o custo básico mensal (somado ao
        custo das ligações), o número de minutos de ligação para outros telefones fixos e o
        número de minutos em ligações para telefones móveis.
 */

public abstract class ContratoTelFixo extends Contrato {

    private double custoBasico;
    private double custoLigacoes;
    private double numeroMinutosParaFixo;
    private double numeroMinutosParaMovel;

    public ContratoTelFixo(String nome, String CPF, int numero) {
        super(nome, CPF, numero);

    }

    public double getCustoBasico() {        return custoBasico;    }

    public void setCustoBasico(double custoBasico) {        this.custoBasico = custoBasico;    }

    public double getCustoLigacoes() {        return custoLigacoes;    }

    public void setCustoLigacoes(double custoLigacoes) {        this.custoLigacoes = custoLigacoes;    }

    public double getNumeroMinutosParaFixo() {        return numeroMinutosParaFixo;    }

    public void setNumeroMinutosParaFixo(double numeroMinutosParaFixo) {        this.numeroMinutosParaFixo = numeroMinutosParaFixo;    }

    public double getNumeroMinutosParaMovel() {        return numeroMinutosParaMovel;    }

    public void setNumeroMinutosParaMovel(double numeroMinutosParaMovel) {        this.numeroMinutosParaMovel = numeroMinutosParaMovel;    }

    @Override
    public String toString() {
        return "Contrato Telefonia Fixa - " + super.toString() +
                "custoBasico=" + custoBasico +
                ", custoLigacoes=" + custoLigacoes +
                ", numeroMinutosParaFixo=" + numeroMinutosParaFixo +
                ", numeroMinutosParaMovel=" + numeroMinutosParaMovel +
                '}';
    }
}
