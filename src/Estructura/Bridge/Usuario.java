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
public class Usuario {
    public static void main(String[] args) {
        FormularioMatriculacionPortugal formulario1 = new FormularioMatriculacionPortugal(new FormHtmlImpl());
        formulario1.visualizar();
        if(formulario1.administrarZona()){
            formulario1.generarDocumento();
        }
        System.out.println();
        
        FormularioMatriculacionEspana formulario2 = new FormularioMatriculacionEspana(new FormAppletImpl());
        formulario2.visualizar();
        if(formulario2.administrarZona()){
            formulario2.generarDocumento();
        }
        
    }
}
