package aulaexemplo3_gabriel;

public class PessoaFisica extends Pessoa {
    
    private int cpf;
    private String rg;
    
    
    
    public PessoaFisica(String nome){
        super(nome);
    }
    
    public PessoaFisica(String nome, int cpf){
        super(nome);
        this.cpf = cpf;        
    }
    public PessoaFisica(String nome, String rg){
        super(nome);
        this.rg = rg;        
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    } 
    
    public void mostrar(){
        System.out.println("Nome = " + this.getNome() + "\nCPF = " + this.getCpf()
            + "\nRG = " + this.getRg());
    }
}
