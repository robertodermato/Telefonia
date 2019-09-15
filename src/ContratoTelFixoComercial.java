/*
        os contratos comerciais taxam o minuto para fixo em R$ 0.15 e para móvel em R$
        0,95. Note que os contratos comerciais armazenam ainda uma franquia em minutos,
        negociada com cada cliente, para a qual é oferecido um desconto de 20% no custo das
        ligações.
 */

public class ContratoTelFixoComercial extends ContratoTelFixo {

    private int franquia;

    public ContratoTelFixoComercial(String nome, String CPF, int numero, int franquia) {
        super(nome, CPF, numero);
        this.franquia=franquia;
    }

    public double minutosRestantesFranquia(){
        double resto = this.franquia*1.0 - (super.getNumeroMinutosParaFixo()+super.getNumeroMinutosParaMovel());
        if (resto<=0) return 0;
        else return resto;
    }

    public double getCustoFixo(){
        return super.getNumeroMinutosParaFixo()*0.15;
    }

    public double getCustoMovel(){
        return super.getNumeroMinutosParaMovel()*0.95;
    }

    @Override
    public String toString() {
        return "Contrato Telefonia Fixo Comercial: " + super.toString() + " Franquia: " + franquia;
    }
}
