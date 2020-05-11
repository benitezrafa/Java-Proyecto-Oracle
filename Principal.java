
public class Principal {

	public static void main(String[] args) 
	{       
        Jugador jugadorX = new Jugador("X");
        Jugador jugadorO = new Jugador("O");
               
        Tablero tablero = new Tablero();
        tablero.mostrar();
        
        boolean hayGanador = false;
        for (int turno = 1; turno <= 9; turno++) 
        {
            if(turno % 2 == 0)
            {
            	System.out.println("Turno de la O:");
            	if(jugadorO.colocarMarca(tablero))
            	{
                	hayGanador = tablero.hayGanador(jugadorO);
            	}
                else
                {
                	System.out.println("La posicion ya esta llena!");
                	turno--;
                }
            }
            else
            {
            	System.out.println("Turno de la X:");
                if(jugadorX.colocarMarca(tablero))
                {
                	hayGanador = tablero.hayGanador(jugadorX);
                }
                else
                {
                	System.out.println("La posicion ya esta llena!");
                	turno--;
                }
            }
            
            tablero.mostrar();
            
            if(hayGanador)
                break;
        }
        
        if(hayGanador)
            System.out.println("Ganaste!");
		else
            System.out.println("Empate!");

    }
	
}
