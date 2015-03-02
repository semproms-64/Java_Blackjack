package upv.etsinf.ipc.black;

import com.trolltech.qt.gui.*;

public class ComoJugar extends QDialog {

    Ui_ComoJugar ui = new Ui_ComoJugar();

    public static void main(String[] args) {
        QApplication.initialize(args);

        ComoJugar testComoJugar = new ComoJugar();
        testComoJugar.show();

        QApplication.exec();
    }

    public ComoJugar() {
        ui.setupUi(this);
        setWindowTitle("Instrucciones del juego");
        this.setFixedSize(this.size());
    }
    
    public void on_pushButton_clicked() {
    	close();
    }

    public ComoJugar(QWidget parent) {
        super(parent);
        ui.setupUi(this);
    }
}
