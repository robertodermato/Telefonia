public class AppTelefonia {

    public static void main (String[] args){

        CiaTelefonica claro = new CiaTelefonica("Claro");

        Contrato fixoCom1 = new ContratoTelFixoComercial("Roberto", "123", 123, 100);
        Contrato fixoCom2 = new ContratoTelFixoComercial("Alberto", "124", 124, 120);
        Contrato fixoRes1 = new ContratoTelFixoResidencial("Márcio", "234", 234);
        Contrato fixoRes2 = new ContratoTelFixoResidencial("Aline", "235", 235);
        Contrato movelPos1 = new ContratoTelMovelPosPago("João", "345", 345);
        Contrato movelPos2 = new ContratoTelMovelPosPago("Joana", "346", 346);
        Contrato movelPre1 = new ContratoTelMovelPrePago("Tamara", "567", 567);
        Contrato movelPre2 = new ContratoTelMovelPrePago("Xavier", "568", 568);

        claro.cadastrar(fixoCom1);
        claro.cadastrar(fixoCom2);
        claro.cadastrar(fixoRes1);
        claro.cadastrar(fixoRes2);
        claro.cadastrar(movelPos1);
        claro.cadastrar(movelPos2);
        claro.cadastrar(movelPre1);
        claro.cadastrar(movelPre2);

        ((ContratoTelFixo)fixoCom1).setCustoBasico(30);
        ((ContratoTelFixo)fixoCom2).setCustoBasico(40);
        ((ContratoTelFixo)fixoRes1).setCustoBasico(10);
        ((ContratoTelFixo)fixoRes2).setCustoBasico(20);

        ((ContratoTelFixo)fixoCom1).setNumeroMinutosParaFixo(25);
        ((ContratoTelFixo)fixoCom2).setNumeroMinutosParaFixo(25);
        ((ContratoTelFixo)fixoRes1).setNumeroMinutosParaFixo(25);
        ((ContratoTelFixo)fixoRes2).setNumeroMinutosParaFixo(25);

        ((ContratoTelFixo)fixoCom1).setNumeroMinutosParaMovel(50);
        ((ContratoTelFixo)fixoCom2).setNumeroMinutosParaMovel(50);
        ((ContratoTelFixo)fixoRes1).setNumeroMinutosParaMovel(50);
        ((ContratoTelFixo)fixoRes2).setNumeroMinutosParaMovel(50);

        ((ContratoTelMovel)movelPos1).setNumeroMinutosParaMovel(50);
        ((ContratoTelMovel)movelPos2).setNumeroMinutosParaMovel(50);
        ((ContratoTelMovel)movelPre1).setNumeroMinutosParaMovel(50);
        ((ContratoTelMovel)movelPre2).setNumeroMinutosParaMovel(50);

        ((ContratoTelMovel)movelPos1).setNumeroMinutosParaFixo(50);
        ((ContratoTelMovel)movelPos2).setNumeroMinutosParaFixo(50);
        ((ContratoTelMovel)movelPre1).setNumeroMinutosParaFixo(50);
        ((ContratoTelMovel)movelPre2).setNumeroMinutosParaFixo(50);

        System.out.println(claro);
    }
}
