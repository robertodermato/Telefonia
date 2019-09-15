/*
        Contratos de telefonia fixa
        residencial taxam o minuto para fixo em R$ 0,1 e para móvel em R$ 0.80,
 */

public class ContratoTelFixoResidencial extends ContratoTelFixo {
    public ContratoTelFixoResidencial(String nome, String CPF, int numero) {
        super(nome, CPF, numero);
    }

    public double getCustoFixo(){
        return super.getNumeroMinutosParaFixo()*0.1;
    }

    public double getCustoMovel(){
        return super.getNumeroMinutosParaMovel()*0.8;
    }

    @Override
    public String toString() {
        return "Contrato Telefone Fixo Residencial: " + super.toString() + " Gasto em ligaçoes para telefone fixo: " + getCustoFixo() +
                " Gasto em ligações para telefone móvel: " + getCustoMovel();
    }
}
