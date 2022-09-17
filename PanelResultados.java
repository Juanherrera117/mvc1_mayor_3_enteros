package vista;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import java.awt.Color;

public class PanelResultados extends JPanel
{

    //-----------------
    // Atributos
    //-----------------
    private JTextArea taResultado;
    private JScrollPane spPresultado;

    //-----------------
    // Métodos
    //-----------------

    //Metodo constructor 
    public PanelResultados()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //creacion y adicio del área de texto
        taResultado = new JTextArea();
        spPresultado =new JScrollPane(taResultado);
        spPresultado.setBounds(10,20,460,130);
        this.add(spPresultado);

        //Borde y título del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso a la informacion 
    public void mostrarResultado(int mayor)
    {
        taResultado.setText("El numero mayor es: " + mayor);
        //taResultado.append("\nEl numero mayor es: " + mayor);
    }

    //Borrar
    public void borrar()
    {
        taResultado.setText("");
    }

}
