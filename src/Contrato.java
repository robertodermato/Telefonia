/*
        Em uma companhia telefônica para cada número de telefone contratado é celebrado
        um contrato diferente. Para qualquer contrato se armazena o nome do cliente, seu cpf
        e número do telefone contratado. A forma de tarifação varia conforme o tipo de
        serviço. Contratos de telefonia fixa armazenam o custo básico mensal (somado ao
        custo das ligações), o número de minutos de ligação para outros telefones fixos e o
        número de minutos em ligações para telefones móveis. Contratos de telefonia fixa
        residencial taxam o minuto para fixo em R$ 0,1 e para móvel em R$ 0.80, enquanto
        que os contratos comerciais taxam o minuto para fixo em R$ 0.15 e para móvel em R$
        0,95. Note que os contratos comerciais armazenam ainda uma franquia em minutos,
        negociada com cada cliente, para a qual é oferecido um desconto de 20% no custo das
        ligações. Já contratos de telefonia móvel não tem custo básico. Armazenam apenas as
        quantidades de minutos para cada tipo de destinatário (fixo ou móvel) e o valor da
        franquia (o desconto na franquia é de 30%). Contratos pré-pagos tarifam as ligações
        em R$ 1,20 o minuto independentemente do tipo do destino da ligação, enquanto que
        contratos pós-pagos tarifam em R$ 0,40 a ligação para fixo e em R$ 0,90 a ligação para
        móvel. Defina uma hierarquia de classes capaz de modelar este problema com
        métodos que permitam o armazenamento das informações e o cálculo do custo
        mensal de cada cliente. Faça um exemplo de uso.
*/

public abstract class Contrato implements Cloneable{
    private String nome;
    private String CPF;
    private int numero;

    public Contrato(String nome, String CPF, int numero) {
        this.nome = nome;
        this.CPF = CPF;
        this.numero = numero;
    }

    public String getNome() {        return nome;    }

    public void setNome(String nome) {        this.nome = nome;    }

    public String getCPF() {        return CPF;    }

    public int getNumero() {        return numero;    }

    public void setNumero(int numero) {        this.numero = numero;    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Contrato de " + nome + " CPF: " + CPF + " Número: " + numero;
    }
}
