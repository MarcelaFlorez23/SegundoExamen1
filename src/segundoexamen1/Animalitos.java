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
public class Animalitos {
    
    String nom;
    String sonido;
    int conta;

    public Animalitos() {
    }
    
    public Animalitos (String nombre,String sonido, int contador) {
        this.nom = nombre;
        this.sonido=sonido;
        this.conta = contador;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public String getNombre() {
        return this.nom;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return this.sonido;
    }

    public void setContador(int contador) {
        this.conta = contador;
    }

    public int getContador() {
        return this.conta;
    }
        
    public void Sonar (String nombre, String ruido, int contador){
        System.out.println(nombre +"  "+contador+" dice "+ ruido);
    }

    void setNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(Animalitos perritu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
