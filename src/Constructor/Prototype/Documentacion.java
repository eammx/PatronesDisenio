/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor.Prototype;

import java.util.List;

/**
 *
 * @author emarin
 */
public abstract class Documentacion {
    protected List<Documento> documentos;
    
    public List<Documento> getDocumentos(){
        return documentos;
    }
}
