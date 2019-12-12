/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexamen1;

/**
 *
 * @author Marcela Florez
 */
public class Pollito extends Animalitos {
          
    public Pollito() {
    }

    public Pollito (String nombre, String sonido, int contador) {
        this.nom = nombre;
        this.conta = contador;
        this.sonido = sonido;
    }
    
    public void setNombre() {
        this.nom = "Pollito";
    }
    public void setSonido() {
        this.sonido = "Pio-Pio";
    }

    @Override
    public String getNombre() {
        return this.nom;
    }

    @Override
    public String getSonido() {
        return this.sonido;
    }

    @Override
    public void setContador(int contador) {
        this.conta = contador;
    }

    @Override
    public int getContador() {
        return this.conta;
    }
    
 
}
