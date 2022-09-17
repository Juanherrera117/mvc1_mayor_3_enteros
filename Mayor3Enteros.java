//Esta es la segunda parte del programa, aquí se realizan los cáclulos para determinar el número mayor
//Están las variables 
package modelo;

public class Mayor3Enteros 
{
    //-------------------
    // Atributos
    //-------------------
    private int X;
    private int Y;
    private int Z;
    private int mayor;
    
    //------------------
    // Metodos
    //------------------
    public void setX(int pX)
    {
        this.X = pX;
    }
    public void setY(int pY)
    {
        this.Y = pY;
    }
    public void setZ(int pZ)
    {
        this.Z = pZ;
    }

    public void hallarMayor()
    {
        if (X > Y)
        {
            if(X > Z)
            {
                mayor = X;
            }
            else
            {
                mayor = Z;
            }
        }
        else
        {
            if(Y > Z)
            {
                mayor = Y;
            }
            else
            {
                mayor = Z;
            }
        }
    }
    public int getMayor() 
    {
        return mayor;
    }

}
