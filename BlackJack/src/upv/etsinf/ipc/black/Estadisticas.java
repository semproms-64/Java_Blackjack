package upv.etsinf.ipc.black;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class Estadisticas extends QDialog 
{

    Ui_Estadisticas ui = new Ui_Estadisticas();
    public static boolean primerArranque = false;

    public static void main(String[] args) throws IOException {
        QApplication.initialize(args);

        Estadisticas testEstadisticas = new Estadisticas();
        testEstadisticas.show();

        QApplication.exec();
    }
    
    public boolean isNumber(String input)
    {
    	try
    	{
    		Long.parseLong(input);
    	} catch(Exception e)
    	{
    		return false;
    	}
    	return true;
    }
    
	@SuppressWarnings("resource")
	public void leer() throws IOException
    {
    	try 
    	{
			FileReader txt = new FileReader("c:\\blackjack\\estadisticas.txt");
			BufferedReader bf;
			String sCadena;
			int count = 0;
			bf = new BufferedReader(txt);
			while(bf.ready())
			{
				sCadena = bf.readLine();
				if (count==0)
				{
					if(isNumber(sCadena))
					{
						blackJackGUI.setVictorias(Integer.parseInt(sCadena));
						count++;
					}
					else 
					{
						sCadena = "0";
						blackJackGUI.setVictorias(Integer.parseInt(sCadena));
						count++;
					}
				}
				else if(count==1)
				{
					if(isNumber(sCadena))
					{
						blackJackGUI.setDerrotas(Integer.parseInt(sCadena));
						count++;
					}
					else 
					{
						sCadena = "0";
						blackJackGUI.setDerrotas(Integer.parseInt(sCadena));
						count++;
					}
				}
				else if(count==2)
				{
					if(isNumber(sCadena))
					{
						blackJackGUI.setEmpates(Integer.parseInt(sCadena));
					}
					else 
					{
						sCadena = "0";
						blackJackGUI.setEmpates(Integer.parseInt(sCadena));
					}
				}
			}
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public Estadisticas() throws IOException 
    {
        ui.setupUi(this);
        setWindowTitle("Estadísticas");
        this.setFixedSize(this.size());
        if(primerArranque) leer();
        int jugados = blackJackGUI.getVictorias()+blackJackGUI.getDerrotas()+blackJackGUI.getEmpates();
        float porcentaje;
        try
        {
        	porcentaje = (blackJackGUI.getVictorias()*100)/jugados;
        } catch(Exception e) {
        	porcentaje = 0;
        } 
        ui.label.setFont(new QFont("arial",10,100));
        ui.label.setText("Juegos jugados: " + jugados + "\n"+
        		"Juegos ganados: " +blackJackGUI.getVictorias()+ "\n"+
        		"Juegos perdidos: "+blackJackGUI.getDerrotas()+ "\n"+
        		"Juegos empatados: " +blackJackGUI.getEmpates()+ "\n"+
        		"Porcentaje de victorias: "
        		+porcentaje+"%"+"\n");
        setPrimerArranque(false);
        setWindowIcon(new QIcon("classpath:icons/estadistica.jpg"));
    }
    
    public void on_pushButton_clicked() 
    {
    	close();
    }

    public Estadisticas(QWidget parent) 
    {
        super(parent);
        ui.setupUi(this);
    }
    
    public void on_pushButton_2_clicked()
    {
    	blackJackGUI.resetearVictorias();
    	blackJackGUI.resetearEmpates();
    	blackJackGUI.resetearDerrotas();
    	resetearEstadisticas();
    	QMessageBox tr = new QMessageBox();
    	QPushButton aceptar = tr.addButton(tr("Aceptar"), QMessageBox.ButtonRole.ActionRole);
    	tr.setText("Reseteadas las estadisticas");
		tr.exec();
		
		if(tr.clickedButton() == aceptar) {
			close();
		}
    }
    
    public void resetearEstadisticas()
    {
    	 String sFichero = "c:\\blackjack\\estadisticas.txt";
    	 try
		  {
			  BufferedWriter bw = 
					    new BufferedWriter(new FileWriter(sFichero));
			  bw.write(0+"\n"+0+"\n"+
					    0+"\n");

			  bw.close();
		   } catch (IOException ioe){
				ioe.printStackTrace();
		   }
    }
    
    public static void setPrimerArranque(boolean input)
    {
    	primerArranque = input;
    }
}
