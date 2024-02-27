/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ads3.sem.gabriel;



public class Ads3SemGabriel {

    public static void main(String[] args) {
        TV tv01 = new TV(502);
        TV tv02 = new TV(2);
        
        
        tv01.setVolume(14);
        
        
        
        System.out.println("Canal da tv 1 = " + tv01.getCanal() + " \n Volume da tv 1 = " + tv01.getVolume() );
        
        System.out.println("Canal da tv 2 = " + tv02.getCanal() + " \n Volume da tv 2 = " + tv02.getVolume() );
    }
    
}
