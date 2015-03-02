package upv.etsinf.ipc.black;

import java.util.Iterator;

public class Blackjack
{
  Mano dealer;    //Para las cartas del dealer.
  Mano player;    //Para las cartas del jugador.
  Baraja newBaraja;   //La baraja en la que están todas las cartas.
  
  public static final String GANA_JUGADOR = "Gana el jugador";
  public static final String GANA_MAQUINA = "Gana el Crupier";
  public static final String EMPATE = "Se ha producido un empate";
 
  public Blackjack(Mano dlr, Mano plr)
  {
    dealer = dlr;
    player = plr;
    newBaraja = new Baraja();
  }//construimos la baraja y la mano de los dos jugadores.
  
  /***********************************************************
    Este método reparte las cartas iniciales a cada jugador.
  ***********************************************************/
  public void dealInitialCartas()            
  { 
    dealer.nuevaCarta(newBaraja);
    dealer.nuevaCarta(newBaraja);
    player.nuevaCarta(newBaraja);
    player.nuevaCarta(newBaraja);
    
  }

  /***********************************************************
    Añade la siguiente carta aleatoria a la mano que golpea
  ***********************************************************/
  public Carta hit(Mano whohit)
  {
    Carta result = whohit.nuevaCarta(newBaraja);

    return result;

  }

  /***********************************************************
    Devuelve el valor de la mano de un jugador dado.
  ***********************************************************/
  public int ManoValue(Mano whoMano)
  {
    int result = whoMano.getManoValor();

    return result;

  }

  /***********************************************************
    Descarta una carta de la mano del jugador.
  ************************************************************/
  public void disCarta(Mano whodis, Carta discrd) throws Exception
  {
    Carta Carta=null;
    boolean found = false;
    Iterator<Carta> scan = whodis.iterator();
    while (scan.hasNext() && !found)
    {
        Carta = scan.next();
        if(discrd.equals(Carta))
        {
          whodis.remove(Carta);
          found = true;
        }
    }
    if(!found)
        throw new Exception("BlackJack");

  }

  /***********************************************************
    Comprobamos si el jugador tiene blackjack
  ***********************************************************/
  public boolean blackj()
  {
    boolean result = false;

    if(player.getManoValor() == 21) result = true;
    
    return result;
  }
  
 
  /***********************************************************
    Comprobamos si la mano del jugador se pasa de 21.
  ***********************************************************/
  public boolean bust(Mano whobust)
  {
    boolean result = false;
    if(whobust.getManoValor() > 21)
      result = true;

    return result;

  }

  /**************************************************************
    Este método añade cartas a la mano del crupier hasta que su	*
    valor sea menor o igual que 16 (reglas del juego)			*
  ***************************************************************/
  public Mano dealerPlays()
  {
    Mano result = dealer;

    while(dealer.getManoValor() <= 16) dealer.nuevaCarta(newBaraja);

    return result;

  }
  
  /***********************************************************
   Este método determina el ganador de la partida.
  ***********************************************************/
  public String winner()
  {
    @SuppressWarnings("unused")
	String result = "";
    if((player.getManoValor() < dealer.getManoValor()) && 
                 dealer.getManoValor() <= 21 ) 
    {
    	blackJackGUI.setDerrotas(1);
    	return GANA_MAQUINA;
    }
    else if ((player.getManoValor() == dealer.getManoValor()) &&
                 dealer.getManoValor() <= 21 ) 
    {
    	
    	blackJackGUI.setEmpates(1);
    	 return EMPATE;
    }
     
    else 
    {
    	blackJackGUI.setVictorias(1);
    	return GANA_JUGADOR;
    }
  }
}
