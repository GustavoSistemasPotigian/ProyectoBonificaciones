/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoComprasPagos;

import BaseDeDatos.*;
import java.sql.*;
import Modelos.VentanaPrincipalPanel;

/**
 *
 * @author usuario
 */
public class ProyectoComprasPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();

        VentanaPrincipalPanel ventana = new VentanaPrincipalPanel();
        ventana.setVisible(true);

    }

}
