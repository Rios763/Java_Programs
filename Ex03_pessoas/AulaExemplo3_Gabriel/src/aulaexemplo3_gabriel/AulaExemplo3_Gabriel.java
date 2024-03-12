package aulaexemplo3_gabriel;


public class AulaExemplo3_Gabriel {

   
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Jimin", 123);
        PessoaFisica pf2 = new PessoaFisica("Killua", "321");

        pf1.setRg("456");
        pf1.mostrar();
        
        PessoaJuridica pj1 = new PessoaJuridica("BTS");
        
        
        Aluno a1 = new Aluno("Gabriel");
        a1.setCpf(123);
        a1.setRa(456);
        a1.setRg("789");
        a1.mostrar();
        
        Professor p1 = new Professor("Xandao", 6969);
        p1.mostrar();
    
        String cavalo = "cavalo";
        System.out.println(cavalo.length());
        
    }
    
    
    
    
    
    
}
