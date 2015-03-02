/********************************************************************************
** Form generated from reading ui file 'Estadisticas.jui'
**
** Created: jue 16. may 10:30:55 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.etsinf.ipc.black;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Estadisticas implements com.trolltech.qt.QUiForm<QWidget>
{
    public QPushButton pushButton;
    public QLabel label;
    public QPushButton pushButton_2;

    public Ui_Estadisticas() { super(); }

    public void setupUi(QWidget Estadisticas)
    {
        Estadisticas.setObjectName("Estadisticas");
        Estadisticas.resize(new QSize(400, 300).expandedTo(Estadisticas.minimumSizeHint()));
        pushButton = new QPushButton(Estadisticas);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(160, 270, 75, 23));
        label = new QLabel(Estadisticas);
        label.setObjectName("label");
        label.setGeometry(new QRect(20, 20, 351, 221));
        pushButton_2 = new QPushButton(Estadisticas);
        pushButton_2.setObjectName("pushButton_2");
        pushButton_2.setGeometry(new QRect(240, 270, 141, 23));
        retranslateUi(Estadisticas);

        Estadisticas.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Estadisticas)
    {
        Estadisticas.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Estadisticas", "Form", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Estadisticas", "Aceptar", null));
        label.setText("");
        pushButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Estadisticas", "Resetear Estad\u00edstcas", null));
    } // retranslateUi

}

