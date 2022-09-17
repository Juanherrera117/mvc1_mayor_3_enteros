//Esto es lo que el usuario ve, la interfaz gráfica
package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //-------------------------
    // Atributos
    //-------------------------
    public PanelEntradaDatos miPanelEntradaDatos; //miPanelEntradaDatos apunta a PanelEntradaDatos que es un objeto referenciado
    public PanelOperaciones miPanelOperaciones; //miPanelOperaciones apunta a PanelOperaciones que es un objeto referenciado
    public PanelResultados miPanelResultados; //miPanelResultados apunta a PanelResultados que es un objeto referenciado
     

    //-------------------------
    // Métodos
    //-------------------------

    // Metodo constructor 
    public VentanaPrincipal()
    {
        // Definicion del contenedor de la ventanta
        this.setLayout(null);

        // Cracion y adicion de un panel tipo PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,200); //Coordenadas del panel dentro de la ventana
        this.add(miPanelEntradaDatos);

        // Cracion y adicion de un panel tipo PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,480,60); //Coordenadas del panel dentro de la ventana
        this.add(miPanelOperaciones);

        // Cracion y adicion de un panel tipo PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,290,480,160); //Coordenadas del panel dentro de la ventana
        this.add(miPanelResultados);

        // Caracteristicas de la ventana 
        this.setTitle("Mayor de 3 enteros"); //Título de la ventana
        this.setSize(500,500); //Tamaño de la ventana en pixeles
        //this.setLocation(100,100); //Donde ubicar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Es una constante
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true); //La ventana se ve, si no se quiere ver la ventana se oculta con false



    }

} 
