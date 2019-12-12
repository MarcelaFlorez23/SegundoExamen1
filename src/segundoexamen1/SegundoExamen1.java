/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexamen1;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcela Florez
 */
public class SegundoExamen1 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Random generator = new Random();
        ArrayList perritos = new ArrayList();
        ArrayList gatitos = new ArrayList();
        ArrayList pollitos = new ArrayList();
        ArrayList chanchitos = new ArrayList();
        int num, conta = 1;
        do {
            System.out.println("La Iteracion es: \n \n " + conta);
            for (int i = 0; i < 4; i++) {
                num = 1 + generator.nextInt(4);
                System.out.println(num);
                if (num == 1) {
                    
                    Animalitos perritu = new Perrito();
                    
                    perritu.setNombre();
                    perritu.setSonido();
                    perritu.setContador(perritos.size()+1);
                    perritos.add(perritu);
                    perritu.Sonar(perritu.getNombre(), perritu.getSonido(), perritu.getContador());

                } else if (num == 2) {
                    
                    Animalitos gatitu = new Gatito();
                    
                    gatitu.setNombre();
                    gatitu.setSonido();
                    gatitu.setContador(gatitos.size()+1);
                    gatitos.add(gatitu);
                    gatitu.Sonar(gatitu.getNombre(), gatitu.getSonido(), gatitu.getContador());
                    
                } else if (num == 3) {
                    Chanchito chanchitu = new Chanchito();
                    chanchitu.setNombre();
                    chanchitu.setSonido();
                    chanchitu.setContador(chanchitos.size()+1);
                    chanchitos.add(chanchitu);
                    chanchitu.Sonar(chanchitu.getNombre(), chanchitu.getSonido(), chanchitu.getContador());
                } else {
                    Pollito pollitu = new Pollito();
                    pollitu.setNombre();
                    pollitu.setSonido();
                    pollitu.setContador(pollitos.size()+1);
                    pollitos.add(pollitu);
                    pollitu.Sonar(pollitu.getNombre(), pollitu.getSonido(), pollitu.getContador());
                }
            }
            conta++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
                Logger.getLogger(SegundoExamen1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

}
