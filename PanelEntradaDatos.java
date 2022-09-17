package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel 
{
    //-------------------------
    // Atributos
    //-------------------------
    private JLabel lbTitulo;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;
    private JTextField tfX;
    private JTextField tfY;
    private JTextField tfZ;

    //-------------------------
    // Métodos
    //-------------------------

    // Metodo constructor
    public PanelEntradaDatos()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE); //Color del panel
        
        // Crear y agregar etiqueta para titulo
        lbTitulo = new JLabel("MAYOR 3 ENTEROS", JLabel.CENTER); // Objeto llamado lbTitle de tipo JLabel
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setBounds(0,10,480,20);
        lbTitulo.setForeground(Color.BLUE);
        this.add(lbTitulo);

        // Ceración y adición de imagen al panel 
        iImagen = new ImageIcon(getClass().getResource("Mayor.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(310, 60, 100, 100);
        this.add(lbImagen);

         // Etiqueta X
        lbX = new JLabel("X = "); 
        lbX.setFont(new Font("Arial", Font.BOLD, 20));
        lbX.setBounds(10,50,120,20);
        lbX.setForeground(Color.BLACK);
        this.add(lbX);

        //Creacion campo de texto X
        tfX = new JTextField(); 
        tfX.setFont(new Font("Arial", Font.BOLD, 20));
        tfX.setBounds(120,50,120,20);
        tfX.setForeground(Color.BLACK);
        this.add(tfX);

        //Etiqueta Y
        lbY = new JLabel("Y = ");
        lbY.setFont(new Font("Arial", Font.BOLD, 20));
        lbY.setBounds(10,100,120,20);
        lbY.setForeground(Color.BLACK);
        this.add(lbY);

        //Creación campo de texto Y
        tfY = new JTextField();
        tfY.setFont(new Font("Arial", Font.BOLD, 20));
        tfY.setBounds(120,100,120,20);
        tfY.setForeground(Color.BLACK);
        this.add(tfY);

        //Etiqueta Z
        lbZ = new JLabel("Z = ");
        lbZ.setFont(new Font("Arial", Font.BOLD, 20));
        lbZ.setBounds(10,150,120,20);
        lbZ.setForeground(Color.BLACK);
        this.add(lbZ);

        //Creación campo de texto Z
        tfZ = new JTextField();
        tfZ.setFont(new Font("Arial", Font.BOLD, 20));
        tfZ.setBounds(120,150,120,20);
        tfZ.setForeground(Color.BLACK);
        this.add(tfZ);
        
        // Borde y tíulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

    }

    // Metodos de acceso a la informacion
    public String getTfX()
    {
        return tfX.getText();
    }

    public String getTfY()
    {
        return tfY.getText();
    }

    public String getTfZ()
    {
        return tfZ.getText();
    }

    // Metodos para borrar las cajas de texto 
    public void borrar()
    {
        tfX.setText("");
        tfY.setText("");
        tfZ.setText("");
    }

}
