
package aulaexemplo3_gabriel;

public class Aluno extends PessoaFisica {
    private int ra;
    
    public Aluno(String nome){
        super(nome);
        
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("RA = " + this.getRa());
    }
    
}
