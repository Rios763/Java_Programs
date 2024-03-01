/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ads3.sem.gabriel;



public class Ads3SemGabriel {

    public static void main(String[] args) {
        TV tv01 = new TV(502, 5);
        TV tv02 = new TV();
        
       tv01.ligarTV();
        
        tv01.aumentarVolume();
        tv02.diminuirVolume();
        
        
       tv01.mostrarTV("TV-01:\n");
       tv02.mostrarTV("TV-02:\n");
       
       
    }
    
}
