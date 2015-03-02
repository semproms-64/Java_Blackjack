/********************************************************************************
** Form generated from reading ui file 'ComoJugar.jui'
**
** Created: dom 26. may 15:35:43 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.etsinf.ipc.black;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_ComoJugar implements com.trolltech.qt.QUiForm<QWidget>
{
    public QPushButton pushButton;
    public QTextBrowser textBrowser;
    public QLabel label;

    public Ui_ComoJugar() { super(); }

    public void setupUi(QWidget ComoJugar)
    {
        ComoJugar.setObjectName("ComoJugar");
        ComoJugar.resize(new QSize(400, 311).expandedTo(ComoJugar.minimumSizeHint()));
        pushButton = new QPushButton(ComoJugar);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(280, 280, 91, 23));
        textBrowser = new QTextBrowser(ComoJugar);
        textBrowser.setObjectName("textBrowser");
        textBrowser.setGeometry(new QRect(20, 50, 351, 231));
        QFont font = new QFont();
        font.setPointSize(14);
        font.setBold(true);
        font.setItalic(true);
        font.setWeight(75);
        textBrowser.setFont(font);
        label = new QLabel(ComoJugar);
        label.setObjectName("label");
        label.setGeometry(new QRect(20, 11, 351, 31));
        QFont font1 = new QFont();
        font1.setFamily("Segoe Print");
        font1.setPointSize(18);
        font1.setBold(true);
        font1.setItalic(true);
        font1.setWeight(75);
        label.setFont(font1);
        retranslateUi(ComoJugar);

        ComoJugar.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget ComoJugar)
    {
        ComoJugar.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("ComoJugar", "Form", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("ComoJugar", "Aceptar", null));
        textBrowser.setHtml(com.trolltech.qt.core.QCoreApplication.translate("ComoJugar", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'MS Shell Dlg 2'; font-size:14pt; font-weight:600; font-style:italic;\">\n"+
"<p align=\"justify\" style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-size:10pt;\">El juego consiste en obtener 21 puntos mediante la suma de los valores de las cartas. Las cartas num\u00e9ricas suman su valor, las figuras suman 10 y el as es un 11 o un 1 si el 11 hiciera al jugador pasarse de 21 en la jugada total. Si se consigue 21 con s\u00f3lo dos cartas, se considera blackjack y se gana autom\u00e1ticamente.</span></p>\n"+
"<p align=\"justify\" style=\"-qt-paragraph-type:empty; margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px; font-size:10pt;\"></p>\n"+
"<p align=\"justify\" style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-size:10pt;\">La acci\u00f3n de golpear otorga una carta m\u00e1s a la mano del jugador.</span></p>\n"+
"<p align=\"justify\" style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-size:10pt;\">La acci\u00f3n mantener hace que el crupier tire cartas hasta alcanzar como m\u00ednimo el valor 16, en ese momento la mano del jugador se compara con la del crupier y se valora quien gana.</span></p>\n"+
"<p align=\"justify\" style=\"-qt-paragraph-type:empty; margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px; font-size:10pt;\"></p>\n"+
"<p align=\"justify\" style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" text-decoration: underline;\">INFORMACI\u00d3N ADICIONAL</span></p>\n"+
"<p align=\"justify\" style=\"-qt-paragraph-type:empty; margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px; text-decoration: underline;\"></p>\n"+
"<p align=\"justify\" style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-size:10pt;\">El juego crea un directorio en la carpeta c: llamada blackjack. Dentro de este directorio se genera un fichero de texto llamado estad\u00edsticas.txt que almacena las estad\u00edsticas del juego.</span></p></body></html>", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("ComoJugar", "Como jugar al BlackJack", null));
    } // retranslateUi

}

