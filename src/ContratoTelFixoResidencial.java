/*
        Contratos de telefonia fixa
        residencial taxam o minuto para fixo em R$ 0,1 e para móvel em R$ 0.80,
 */

public class ContratoTelFixoResidencial extends ContratoTelFixo {
    public ContratoTelFixoResidencial(String nome, String CPF, int numero) {
        super(nome, CPF, numero);
    }
}
