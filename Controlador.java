package controlador;

import modelo.Mayor3Enteros;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    //------------------
    // Atributos
    //------------------
    private VentanaPrincipal venPrin; //Referencia que termina apuntando a miPanleOperaciones que es para el Controlador un obejeto referenciado
    private Mayor3Enteros model; //Referencia que termina apuntando a Mayor3Enteros que es para el Controlador un obejto referenciado           
    
    //------------------
    // Métodos
    //------------------

    //Metodo constructor
    public Controlador(VentanaPrincipal pVenPrin, Mayor3Enteros pModel)//Se le asignan dos parametros
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.btHallarMayor.addActionListener(this);
        this.venPrin.miPanelOperaciones.btBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btSalir.addActionListener(this);
    }

    // Metodo de atencion de eventos 
    public void actionPerformed(ActionEvent ae)  
    {
        //Idnetificar el comando generado (hallarMayor, borrar, salir)
        String comando = ae.getActionCommand();
        
        if (comando.equals("hallarMayor"))
        {
            try
            {
                this.model.setX(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfX()));
                this.model.setY(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfY()));
                this.model.setZ(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfZ()));
                this.model.hallarMayor(); //Invoca el método hallarMayor
                this.venPrin.miPanelResultados.mostrarResultado(this.model.getMayor());
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Datos incorrectos. \nLos datos deben ser enteros", 
                "Suma 3 enteros", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(comando.equals("borrar"))
        {
            JOptionPane.showMessageDialog(null, "Los datos serán borrados",
            "Suma 3 enteros",
            JOptionPane.WARNING_MESSAGE);
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultados.borrar();
        }
        if (comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrara", "Suma 3 enteros",
            JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
