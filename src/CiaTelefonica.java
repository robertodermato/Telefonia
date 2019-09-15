import java.util.ArrayList;

public class CiaTelefonica {

    private ArrayList<Contrato> contratos;
    private String nome;

    public CiaTelefonica(String nome) {
        this.nome = nome;
        contratos = new ArrayList<>();
    }

    public ArrayList<Contrato> getContratos() {        return contratos;    }

    public String getNome() {        return nome;    }

    public void setNome(String nome) {        this.nome = nome;    }

    public void cadastrar(Contrato contrato){
        contratos.add(contrato);
    }

    @Override
    public String toString() {
        String contrs ="";
        for (Contrato contr: contratos){
            contrs = contrs + contr + "\n";
        }
        return "Cia Telefonica - " + nome + " Contratos: " + contrs;
    }
}
