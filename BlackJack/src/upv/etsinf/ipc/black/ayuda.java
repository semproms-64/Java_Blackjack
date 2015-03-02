package upv.etsinf.ipc.black;

import com.trolltech.qt.gui.*;

public class ayuda extends QDialog {

    Ui_ayuda ui = new Ui_ayuda();

    public static void main(String[] args) {
        QApplication.initialize(args);

        ayuda testayuda = new ayuda();
        testayuda.show();

        QApplication.exec();
    }

    public ayuda() {
        ui.setupUi(this);
        ui.textBrowser.setText("BlackJack 21 versión 1.1" +"\n"+
        		"\n"+"Este programa está libre de derechos" +"\n"+
        		"\n"+"Autor: Luis Adelantado Romero");
        setWindowTitle("Sobre este BlackJack-21");
        this.setFixedSize(this.size());
        setWindowIcon(new QIcon("classpath:icons/help.jpg"));
    }
    
    public void on_aceptar_clicked() {
    	close();
    }

    public ayuda(QWidget parent) {
        super(parent);
        ui.setupUi(this);
    }
}
