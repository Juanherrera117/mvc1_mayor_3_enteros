//El programa inicia aquí
//Desde miMayor3Enteros, miVentana y miControlador comienza todo
//miMayor3Enteros señala al obejto Mayor3Enteros (Que es un objeto que solo existe en el heap)
//miVentana señala al objeto VentanaPrincipal (Que es un objeto que solo existe en heap)
//miControlador señala al objeto Controlador (Que es un objeto que solo existe en el heap)
package ejecutable;

import controlador.Controlador;
import modelo.Mayor3Enteros;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args)
    {
        Mayor3Enteros miMayor3Enteros = new Mayor3Enteros(); //Variable que esta en el stak y miMayor3Enteros apunta a Mayor3Enteros
        VentanaPrincipal miVentana = new VentanaPrincipal(); //Variable que esta en el stack y miVentana apunta a VentanaPrincipal
        Controlador miControlador = new Controlador(miVentana, miMayor3Enteros); //Variable que esta en el stack y miControlador apunta a Controlador
    }
}
