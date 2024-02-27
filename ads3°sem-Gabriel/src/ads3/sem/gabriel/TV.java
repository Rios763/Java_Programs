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

    public TV(int canal) {
        ligada = false;
        volume = 5;
        this.canal =  canal;
        
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
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
   
}
