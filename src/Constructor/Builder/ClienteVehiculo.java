/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor.Builder;

import java.util.Scanner;

/**
 *
 * @author emarin
 */
public class ClienteVehiculo {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String seleccion;
        ConstructorDocumentacionVehiculo constructor;
        Documentacion documentacion;
        Vendedor vendedor;
        System.out.println("Desea generar documentacion HTML (1) o PDF (2):");
        seleccion = reader.next();
        if (seleccion.equals("1")) {
            constructor = new ConstructorDocumentacionVehiculoHtml();
        } else {
            constructor = new ConstructorDocumentacionVehiculoPdf();
        }
        vendedor = new Vendedor(constructor);
        documentacion = vendedor.construye("Martin");
        documentacion.imprime();
    }

}
