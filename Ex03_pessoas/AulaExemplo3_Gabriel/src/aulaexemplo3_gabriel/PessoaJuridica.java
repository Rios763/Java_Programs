package aulaexemplo3_gabriel;

public class PessoaJuridica extends Pessoa {
    
    private int cnpj;
    private String ie;
    
    
    
    public PessoaJuridica(String nome){
        super(nome);
    }
    
    public PessoaJuridica(String nome, int cnpj){
        super(nome);
        this.cnpj = cnpj;        
    }
    public PessoaJuridica(String nome, String ie){
        super(nome);
        this.ie = ie;        
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    
    
}
