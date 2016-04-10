/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor.Prototype;

/**
 *
 * @author emarin
 */
public abstract class Documento implements Cloneable {

    protected String contenido = new String();

    public Documento duplica() {
        Documento resultado;

        try {
            resultado = (Documento) this.clone();
        } catch (Exception e) {
            return null;
        }

        return resultado;
    }
    
    public void rellena(String informacion){
        contenido = informacion;
    }
    public abstract void imprime();
    public abstract void visualiza();
}
