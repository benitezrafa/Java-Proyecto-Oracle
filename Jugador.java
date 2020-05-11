
import java.util.Scanner;

public class Jugador 
{
	private String marca;

    public Jugador(String _marca) 
    {
        this.marca = _marca;
    }

    public String getMarca() 
	{
	    return this.marca;
	}
   
    public boolean colocarMarca(Tablero tablero)
    {
        boolean colocada = true;
    	try 
        {
            Scanner sc = new Scanner(System.in);
            int fila, col;
            
            do
            {
            	System.out.print("\nIndique la fila (1, 2 o 3): ");
            	fila = sc.nextInt();
            }while(fila < 1 && fila > 3);
            
            do
            {
            	System.out.print("\nIndique la columna (1, 2 o 3): ");
                col = sc.nextInt();
            }while(col < 1 && col > 3);
            
            if(tablero.getTablero()[fila-1][col-1].equals(" ___ "))
            	tablero.getTablero()[fila-1][col-1] = " _" + this.marca + "_ ";
            else
            	colocada = false;
        } 
        catch (Exception e) 
        {
            System.out.println("Error: Debe ingresar valores numericos!");
            colocada = false;
        }
    	return colocada;
    }
    
}