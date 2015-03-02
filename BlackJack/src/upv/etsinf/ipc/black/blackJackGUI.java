package upv.etsinf.ipc.black;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import sun.security.util.PropertyExpander.ExpandException;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QCloseEvent;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPixmap;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class blackJackGUI extends QMainWindow 
{

    Ui_blackJack ui = new Ui_blackJack();
    public static boolean empezado = false;
    public static boolean apuesta = false;
    public static int count = 0;
    public static int cuenta = 0;
    public static int VICTORIA, EMPATE, DERROTA = 0;
    public static int partidas = 0;
    Mano dealer = new Mano();
    Mano jugador = new Mano();
    Carta topo;
    
    Blackjack game = new Blackjack(dealer, jugador);
    QLabel dealerCard1;
    public blackJackGUI() 
    {
        ui.setupUi(this);
        this.setFixedSize(this.size());
        setWindowTitle("BlackJack - 21");  
        ui.dealButton.setEnabled(false);
        ui.hitButton.setEnabled(false);
        ui.playagainButton.setEnabled(false);
        ui.stayButton.setEnabled(false);
        ui.winlosebox.setEnabled(true);
        ui.winlosebox.setFont(new QFont("arial", 10, 100));
        ui.dealerLabel.setFont(new QFont("arial", 10, 100));
        ui.playerLabel.setFont(new QFont("arial", 10, 100));
        ui.winlosebox.setStyleSheet("QEditText { background-color: blue; }");
        setWindowIcon(new QIcon("classpath:icons/icon.png"));
        
    }

    public blackJackGUI(QWidget parent) 
    {
        super(parent); 
        ui.setupUi(this);
    }
    
    @SuppressWarnings("unused")
	private void on_actionSalir_triggered() 
    {
    	if(empezado)
    	{
    		QMessageBox msgBox = new QMessageBox();
    		msgBox.setWindowIcon(new QIcon("classpath:icons/salir.png"));
    		QPushButton aceptar = msgBox.addButton(tr("Aceptar"), QMessageBox.ButtonRole.ActionRole);
    		QPushButton cancelar = msgBox.addButton(tr("Cancelar"), QMessageBox.ButtonRole.ActionRole);
    		msgBox.setText("¿Quieres salir de una partida ya comenzada?");
    		msgBox.exec();
    		
    		if(msgBox.clickedButton() == aceptar) {
    			guardarPartida();
    			QApplication.exit();
    		}
    		else if(msgBox.clickedButton() == cancelar) {
    			msgBox.close();
    		}
    	}
    	else close();
	}	
    
    
    public void closeEvent(QCloseEvent event) {
    	if(empezado)
    	{
    		QMessageBox msgBox = new QMessageBox();
    		msgBox.setWindowTitle("¿Quieres salir?");
    		msgBox.setWindowIcon(new QIcon("classpath:icons/salir.png"));
    		QPushButton aceptar = msgBox.addButton(tr("Aceptar"), QMessageBox.ButtonRole.ActionRole);
    		QPushButton cancelar = msgBox.addButton(tr("Cancelar"), QMessageBox.ButtonRole.ActionRole);
    		msgBox.setText("¿Quieres salir de una partida ya comenzada?");
    		msgBox.exec();
    		
    		if(msgBox.clickedButton() == aceptar) {
    			guardarPartida();
    			event.accept();
    		}
    		else if(msgBox.clickedButton() == cancelar) {
    			event.ignore();
    		}
    	}
    	else event.accept();
	}
    
    /*****************************************************
     * Método que se ejecuta al pulsar el botón repartir.*
     *****************************************************/
	public void on_dealButton_clicked() 
	{
		 
		QPixmap back = new QPixmap("classpath:icons/back.jpg");
	    ui.dcard0.setPixmap(back);
	    game.dealInitialCartas();
	    Carta dcard = null;
	    Iterator<Carta> dscan = (dealer.enMano).iterator();
	    int count = 0;
	    while(dscan.hasNext())
	    {
	    	dcard = dscan.next();
	    	if(count==0)
	    	{
	    		topo = dcard;
	    	}
	    	else {
	    		ui.dcard1_2.setPixmap(dcard.getImage());
	    	}
	    		count++;
	    	}
	    	
	    	Iterator<Carta> pscan = (jugador.enMano).iterator();
	    	count = 0;
	    	while(pscan.hasNext())
	    	{
	    		Carta pcard = pscan.next();
	    		if(count==0)
	    		{
	    			ui.pcard0.setPixmap(pcard.getImage());	
	    		}
	    		else
	    		{
	    			ui.pcard1.setPixmap(pcard.getImage());
	    		}
	    		count++;
	    	}
	    	
	    	ui.dealerLabel.setText(" Dealer: "+dcard.getValor());
	    	ui.playerLabel.setText(" Jugador: "+game.ManoValue(jugador));
	    	
	    	ui.hitButton.setEnabled(true);
	        ui.stayButton.setEnabled(true);
	        ui.dealButton.setEnabled(false);
	    	
	    if(game.blackj())
	    {
	    	ui.winlosebox.setText("Has ganado con Blackjack!");
	    	ui.stayButton.setEnabled(false);
	    	ui.hitButton.setEnabled(false);
	    	ui.dealButton.setEnabled(false);
	    	ui.playagainButton.setEnabled(true);
	    	VICTORIA++;
	    	partidas++;
	    }
    }
    
    /****************
     * Botón golpear
     * @throws ExpandException *
     ****************/
	public void on_hitButton_clicked()  
	{
		Carta hitcard = null;
    	if(count!=3) {
    		 hitcard = game.hit(jugador);
    	}
    	if(count==0) 
    	{
    		ui.pcard2.setPixmap(hitcard.getImage());
    		count++;
    	}
    	else if(count==1) 
    	{
    		ui.pcard3.setPixmap(hitcard.getImage());
    		count++;
    	}
    	else if(count==2) 
    	{
    		ui.pcard4_2.setPixmap(hitcard.getImage());
    		count++;
    	}
    	else 
    	{
    		QMessageBox msg = new QMessageBox();
			msg.setText("Máximo de 5 cartas por mano");
			msg.exec();
			count++;
			return;	
    	}
    	
    	if(game.bust(jugador))
    	{
    		ui.winlosebox.setText("Te has pasado! Gana el crupier");
    		ui.dealButton.setEnabled(false);
    		ui.hitButton.setEnabled(false);
    		ui.stayButton.setEnabled(false);
    		ui.playagainButton.setEnabled(true);
    		DERROTA++;
    		partidas++;
    	}

			ui.playerLabel.setText(" Jugador: "+game.ManoValue(jugador));
    }
    
	@SuppressWarnings("unused")
	public void on_stayButton_clicked() 
	{
    	ui.dcard0.setPixmap(topo.getImage());
    	Carta dhitcard = game.hit(dealer);
    	ui.dcard2.setPixmap(dhitcard.getImage());
    	if(dealer.getManoValor()<16) 
    	{
    		Carta card = game.hit(dealer);
    		ui.dcard4.setPixmap(card.getImage());
    		if(dealer.getManoValor()<16)
    		{
    			Carta carta = game.hit(dealer);
        		ui.dcard5.setPixmap(card.getImage());
    		}
    	}
    	ui.dealerLabel.setText("Crupier "+ game.ManoValue(dealer));
    	ui.playerLabel.setText("Jugador "+ game.ManoValue(jugador));
    	
    	ui.winlosebox.setText(game.winner());
    	ui.hitButton.setEnabled(false);
    	ui.stayButton.setEnabled(false);
    	
    	ui.playagainButton.setEnabled(true);
    	guardarPartida(); 	
    }
    
    public void on_actionNuevo_Juego_triggered() 
    {
    	 ui.dealButton.setEnabled(true);
    	 empezado = true;
    	 on_playagainButton_clicked();
    }
    
    /****************
     * Botón jugar  *
     ****************/
    public void on_playagainButton_clicked() 
    {
    	ui.dealerLabel.setText("Crupier: ");
    	ui.playerLabel.setText("Jugador: ");
    	ui.winlosebox.setText("");
    	limpiarFrame();
    	ui.pcardPanel.clear();
    	dealer = new Mano();
    	jugador = new Mano();
    	game = new Blackjack(dealer, jugador);
    	count = 0;
    	cuenta = 0;
    	ui.hitButton.setEnabled(false);
    	ui.stayButton.setEnabled(false);
    	ui.playagainButton.setEnabled(false);
    	ui.dealButton.setEnabled(true);
    }
    
    public void limpiarFrame() 
    {
    	ui.pcard0.clear();
    	ui.pcard1.clear();
    	ui.pcard2.clear();
    	ui.pcard3.clear();
    	ui.pcard4_2.clear();
    	ui.dcard0.clear();
    	ui.dcard1_2.clear();
    	ui.dcard2.clear();
    	ui.dcard4.clear();
    	ui.dcard5.clear();
    }
    
	public void on_actionAcerca_del_blackjack_triggered() 
	{
    	ayuda lb = new ayuda();
    	lb.exec();
    }
	
	public void on_actionAtajos_de_teclado_triggered()
	{
		QMessageBox sb = new QMessageBox();
		sb.setWindowTitle("Resumen de los atajos de teclado");
		sb.setText("Nuevo Juego - F2"+"\n"+
				   "Estadísticas - F4"+"\n"+
				   "Pantalla completa - F11"+"\n"+
				   "Salir de la pantalla completa - F11"+"\n"+
				   "Salir - CTRL+Q"+"\n"+
				   "Información sobre este juego - F1");
		sb.exec();
	}
	
	public void on_actionComo_jugar_triggered() 
	{
		ComoJugar lc = new ComoJugar();
		lc.exec();
	}
	
	public void on_actionEstad_sticas_triggered() throws IOException 
	{
		Estadisticas la = new Estadisticas();
		la.exec();
	}
	
	public void on_actionFullscreen_triggered()
	{
			if(!this.isFullScreen()) 
			{
				showFullScreen();
				ui.frame.resize(this.size());	
			}
			else showNormal();		
	}
	
	@SuppressWarnings("unused")
	public static void guardarPartida()
	{
		String sFichero = "c:\\blackjack\\estadisticas.txt";
		  File directorio = new File("c:\\blackjack");
		  if(!directorio.exists()){
			  directorio.mkdirs();			  
			  File fichero = new File(sFichero);
		  }
		  
		  try
		  {
			  BufferedWriter bw = 
					    new BufferedWriter(new FileWriter(sFichero));
			  bw.write(getVictorias()+"\n"+getDerrotas()+"\n"+
					    getEmpates()+"\n");
			  
			  bw.close();
		   } catch (IOException ioe){
				ioe.printStackTrace();
		   }
	  }
	
    public static void main(String[] args) 
    {
        QApplication.initialize(args);
        blackJackGUI testblackJack = new blackJackGUI();
        testblackJack.show();
        Estadisticas.setPrimerArranque(true); 
        QApplication.exec();
    }
    
    public static int getVictorias() { return VICTORIA; }
    
    public static  int getEmpates() { return EMPATE; }
    
    public static int getDerrotas() { return DERROTA; }
    
    public static void setVictorias(int input) { VICTORIA += input; }
    
    public static void setEmpates(int input) { EMPATE += input; }
    
    public static void setDerrotas(int input) { DERROTA += input; }
    
    public static void resetearVictorias() { VICTORIA = 0;  }
    
    public static void resetearDerrotas() { DERROTA = 0;  }
    
    public static void resetearEmpates() { EMPATE = 0;  }
       
}
