package upv.etsinf.ipc.black;

import com.trolltech.qt.gui.QPixmap;

public class Carta {
	protected int valor;
	protected String palo;
	protected String cara;
	protected QPixmap img;
	
	public Carta() {
		valor = 0;
		palo = null;
		cara = null;
		img = null;
	}
	
	public Carta(QPixmap img, int valor, String palo, String cara) {
		this.valor = valor; 
		this.palo = palo;
		this.cara = cara;
		this.img = img;
	}
	
	public int getValor() { return valor; }
	
	public String getCara() { return cara; }
	
	public String getPalo() { return palo; }
	
	public QPixmap getImage() { return img; }
	
	public void setValor(int valor) { this.valor = valor; }
	
	public String toString() {
		return "Cara "+ cara +  "Palo "+ palo + "valor" + valor;
	}
}
