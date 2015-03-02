/********************************************************************************
** Form generated from reading ui file 'ayuda.jui'
**
** Created: lun 13. may 16:13:18 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.etsinf.ipc.black;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_ayuda implements com.trolltech.qt.QUiForm<QWidget>
{
    public QTextBrowser textBrowser;
    public QPushButton aceptar;

    public Ui_ayuda() { super(); }

    public void setupUi(QWidget ayuda)
    {
        ayuda.setObjectName("ayuda");
        ayuda.resize(new QSize(400, 300).expandedTo(ayuda.minimumSizeHint()));
        textBrowser = new QTextBrowser(ayuda);
        textBrowser.setObjectName("textBrowser");
        textBrowser.setGeometry(new QRect(20, 20, 351, 241));
        QFont font = new QFont();
        font.setFamily("MV Boli");
        font.setPointSize(18);
        textBrowser.setFont(font);
        aceptar = new QPushButton(ayuda);
        aceptar.setObjectName("aceptar");
        aceptar.setGeometry(new QRect(290, 270, 75, 23));
        retranslateUi(ayuda);

        ayuda.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget ayuda)
    {
        ayuda.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("ayuda", "Form", null));
        aceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("ayuda", "Aceptar", null));
    } // retranslateUi

}

