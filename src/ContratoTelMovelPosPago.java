/*
        contratos pós-pagos tarifam em R$ 0,40 a ligação para fixo e em R$ 0,90 a ligação para móvel.
 */

public class ContratoTelMovelPosPago extends ContratoTelMovel {
    public ContratoTelMovelPosPago(String nome, String CPF, int numero) {
        super(nome, CPF, numero);
    }

    public double getCustoFixo(){
        return super.getNumeroMinutosParaFixo()*0.4;
    }

    public double getCustoMovel(){
        return super.getNumeroMinutosParaMovel()*0.9;
    }

    @Override
    public String toString() {
        return "Contrato Telefonia Móvel Pós Pago: " + super.toString() + " Gasto em ligaçoes para telefone fixo: " + getCustoFixo() +
                " Gasto em ligações para telefone móvel: " + getCustoMovel();
    }
}
