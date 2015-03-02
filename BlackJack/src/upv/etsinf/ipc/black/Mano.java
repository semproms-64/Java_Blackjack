package upv.etsinf.ipc.black;

import java.util.ArrayList;
import java.util.Iterator;

public class Mano {
	public ArrayList<Carta> enMano;
	public int valorMano, contador;
	
	public Mano() {
		enMano = new ArrayList<Carta>(12);
		valorMano = 0;
		contador = 0;
	}
	
	private void reducirMano(Carta input) {
		if(valorMano>21) {
			if(asEnMano()) {
				valorMano -= 10;
			}
		}
	}
	
	 public boolean asEnMano()  {
		  Carta card = null;
		  boolean found = false;
		  Iterator<Carta> scan = enMano.iterator();
		  while(scan.hasNext() && !found)
		  {
			  card = scan.next();
			  if(card.getValor()==11)
			  {
				 found = true;
				 card.setValor(1);
			 }
		 }
		 return found;
	}
	 
	public Carta nuevaCarta(Baraja actual) {
		Carta result;
		result = actual.getCarta();
		enMano.add(result);
		valorMano += result.getValor();
		reducirMano(result);
		contador++;
		return result;
	}
	
	public Carta remove(Carta carta) {
		enMano.remove(carta);
		return carta;
	}
	
	public Iterator<Carta> iterator() {
		return enMano.iterator();
	}
	
	public int getManoValor() {
		return valorMano;
	}
	
	public void setManoValor(int valorMano) {
		this.valorMano = valorMano;
	}
	
	public String toString() {
		String result = "";
		Carta carta = null;
		int a = 0;
		Iterator<Carta> scan = enMano.iterator();
		while(scan.hasNext()) {
			carta = scan.next();
			result += "Carta"+a+": "+carta.getValor()+"\n";
		}
		return result;
	}
}
