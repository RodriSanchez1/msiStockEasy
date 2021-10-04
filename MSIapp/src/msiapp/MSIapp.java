/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msiapp;

import Ventana.Carga_Producto;
import Ventana.CrearUsario;
import Ventana.Ingresar_Producto;
import Ventana.Listado_Productos;
import Ventana.Modificar_Ubicacion_Producto;
import Ventana.Ubicar_Producto;
import Ventana.VentanaLogin;
import Ventana.menuPrincipal;
import Ventana.movInterno;

/**
 *
 * @author ginin
 */
public class MSIapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                new VentanaLogin().setVisible(true);
                new Carga_Producto().setVisible(true);
                new Ingresar_Producto().setVisible(true);
                                new Listado_Productos().setVisible(true);
                new Ubicar_Producto().setVisible(true);
                new Modificar_Ubicacion_Producto().setVisible(true);
                new CrearUsario().setVisible(true);
                new menuPrincipal().setVisible(true);
                new movInterno().setVisible(true);
    }

    
}
