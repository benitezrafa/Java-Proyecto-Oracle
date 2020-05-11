
public class Tablero 
{
    private String[][] tablero;

    public Tablero() 
    {
        tablero = new String[3][3];
        iniciar();
    }
   
    public String[][] getTablero() 
    {
        return this.tablero;
    }
   
    public void iniciar()
    {
        for (int i = 0; i < tablero.length; i++) 
            for (int j = 0; j < tablero[0].length; j++) 
                tablero[i][j] = " ___ ";

    }
   
    public void mostrar()
    {
        for (int i = 0; i < tablero.length; i++) 
        {
            for (int j = 0; j < tablero[0].length; j++) 
            {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }
   
    public boolean hayGanador(Jugador jugador)
    {
        String marca1 = " _" + jugador.getMarca() + "_ ";
        String tresEnRaya = marca1 + marca1 + marca1;
    
        String fila = tablero[0][0] + tablero[0][1] + tablero[0][2];
        if(tresEnRaya.equals(fila))
            return true;

        fila = tablero[1][0] + tablero[1][1] + tablero[1][2];
        if(tresEnRaya.equals(fila))
            return true;

        fila = tablero[2][0] + tablero[2][1] + tablero[2][2];
        if(tresEnRaya.equals(fila))
            return true;

        String columna = tablero[0][0] + tablero[1][0] + tablero[2][0];
        if(tresEnRaya.equals(columna))
            return true;

        columna = tablero[0][1] + tablero[1][1] + tablero[2][1];
        if(tresEnRaya.equals(columna))
            return true;

        columna = tablero[0][2] + tablero[1][2] + tablero[2][2];
        if(tresEnRaya.equals(columna))
            return true;

        String diagonal = tablero[0][0] + tablero[1][1] + tablero[2][2];
        if(tresEnRaya.equals(diagonal))
            return true;

        diagonal = tablero[2][0] + tablero[1][1] + tablero[0][2];
        if(tresEnRaya.equals(diagonal))
            return true;

        return false;
    }
   
}
