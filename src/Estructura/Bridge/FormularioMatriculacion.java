/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura.Bridge;

/**
 *
 * @author emarin
 */
public abstract class FormularioMatriculacion {
    protected String contenido;
    protected FormularioImpl implementacion;

    public FormularioMatriculacion(FormularioImpl implementacion) {
        this.implementacion = implementacion;
    }
    public void visualizar(){
        implementacion.dibujarTexto("Numero de matricula existente: ");
    }
    public void generarDocumento(){
        this.implementacion.dibujarTexto("Solicitud de matriculacion");
        this.implementacion.dibujarTexto("Numero de matricula: " + this.contenido);
    }
    public boolean administrarZona(){
        this.contenido = this.implementacion.administrarZonaIndicada();
        return this.controlZona(this.contenido);
    }

    protected abstract boolean controlZona(String matricula);
}
