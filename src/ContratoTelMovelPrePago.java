/*
        Contratos pré-pagos tarifam as ligações
        em R$ 1,20 o minuto independentemente do tipo do destino da ligação,
 */

public class ContratoTelMovelPrePago extends ContratoTelMovel {

    public ContratoTelMovelPrePago(String nome, String CPF, int numero) {
        super(nome, CPF, numero);
    }

    public double getCusto(){
        return (super.getNumeroMinutosParaFixo() + super.getNumeroMinutosParaMovel())*1.2;
    }
}
