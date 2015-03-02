/********************************************************************************
** Form generated from reading ui file 'apostar.jui'
**
** Created: sáb 25. may 12:50:13 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.etsinf.ipc.black;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_apostar implements com.trolltech.qt.QUiForm<QWidget>
{
    public QLabel label;
    public QLabel label_2;
    public QPushButton aceptar_Button;
    public QPushButton cancelar_Button;
    public QLineEdit dineroTienes;
    public QLineEdit dineroApuestas;

    public Ui_apostar() { super(); }

    public void setupUi(QWidget apostar)
    {
        apostar.setObjectName("apostar");
        apostar.resize(new QSize(400, 173).expandedTo(apostar.minimumSizeHint()));
        label = new QLabel(apostar);
        label.setObjectName("label");
        label.setGeometry(new QRect(10, 10, 141, 61));
        label_2 = new QLabel(apostar);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(10, 80, 151, 51));
        aceptar_Button = new QPushButton(apostar);
        aceptar_Button.setObjectName("aceptar_Button");
        aceptar_Button.setGeometry(new QRect(230, 140, 75, 23));
        cancelar_Button = new QPushButton(apostar);
        cancelar_Button.setObjectName("cancelar_Button");
        cancelar_Button.setGeometry(new QRect(310, 140, 75, 23));
        dineroTienes = new QLineEdit(apostar);
        dineroTienes.setObjectName("dineroTienes");
        dineroTienes.setGeometry(new QRect(160, 20, 221, 31));
        dineroApuestas = new QLineEdit(apostar);
        dineroApuestas.setObjectName("dineroApuestas");
        dineroApuestas.setGeometry(new QRect(160, 90, 221, 31));
        retranslateUi(apostar);

        apostar.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget apostar)
    {
        apostar.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("apostar", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("apostar", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'MS Shell Dlg 2'; font-size:8.25pt; font-weight:400; font-style:normal;\">\n"+
"<p align=\"justify\" style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-weight:600; font-style:italic;\">\u00bfCu\u00e1nto dinero tienes?</span></p></body></html>", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("apostar", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'MS Shell Dlg 2'; font-size:8.25pt; font-weight:400; font-style:normal;\">\n"+
"<p align=\"justify\" style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-size:8pt; font-weight:600; font-style:italic;\">\u00bfCu\u00e1nto quieres apostar?</span></p></body></html>", null));
        aceptar_Button.setText(com.trolltech.qt.core.QCoreApplication.translate("apostar", "Aceptar", null));
        cancelar_Button.setText(com.trolltech.qt.core.QCoreApplication.translate("apostar", "Cancelar", null));
    } // retranslateUi

}

