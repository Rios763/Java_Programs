/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ads3.sem.gabriel;


public class TV {
  //atributo
   
   private float dimensao;
   private float resolucao;
   
   private int canal;
   private int volume;
   
   private boolean ligada;
    
    
  //metodos

    public TV(int canal, int volume) {
        this.ligada = false;
        this.volume = volume;
        this.canal =  canal;
        
    }
   
    public TV() {
        this.ligada = false;
        this.volume = 0;
        this.canal =  0;
        
    }
    
    public float getResolucao() {
        return resolucao;
    }

    public void setResolucao(float resolucao) {
        this.resolucao = resolucao;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(canal > 0 && canal < 1000 && this.ligada){
            this.canal = canal;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume(){
        if(this.volume < 100 && this.ligada){
            this.volume++;
        }
    }
   
    public void diminuirVolume(){
        if(this.volume > 0 && this.ligada){
            this.volume--;
        }
    }
    
    public void ligarTV(){
        this.ligada = true;
    }
    
        public void desligarTV(){
        this.ligada = false;
    }

    
    public void mostrarTV(String obj){
         System.out.println(obj + "Canal = " + this.getCanal() + "\nVolume = " + this.getVolume() + (this.ligada ? "\nLigada" : "\nDesligada"));
    }
} 
