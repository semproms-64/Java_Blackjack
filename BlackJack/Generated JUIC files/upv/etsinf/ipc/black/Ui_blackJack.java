/********************************************************************************
** Form generated from reading ui file 'blackJackGUI.jui'
**
** Created: mar 28. may 11:28:02 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.etsinf.ipc.black;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_blackJack implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionNuevo_Juego;
    public QAction actionSalir;
    public QAction actionAcerca_del_blackjack;
    public QAction actionComo_jugar;
    public QAction actionEstad_sticas;
    public QAction actionFullscreen;
    public QAction actionAtajos_de_teclado;
    public QWidget centralwidget;
    public QFrame frame;
    public QPushButton stayButton;
    public QLabel dcard1;
    public QLabel pcard4;
    public QLabel label;
    public QLabel label_2;
    public QLabel pcardPanel;
    public QLabel dcardPanel;
    public QLabel dcard0;
    public QLabel dcard5;
    public QLabel pcard0;
    public QPushButton dealButton;
    public QLabel dcard4;
    public QLabel pcard2;
    public QPushButton playagainButton;
    public QLabel pcard1;
    public QPushButton hitButton;
    public QLabel pcard3;
    public QLabel dcard2;
    public QLabel dcard1_2;
    public QLabel pcard4_2;
    public QTextBrowser dealerLabel;
    public QTextBrowser playerLabel;
    public QTextBrowser winlosebox;
    public QMenuBar menubar;
    public QMenu menuJuego;
    public QMenu menuAyuda;
    public QStatusBar statusbar;

    public Ui_blackJack() { super(); }

    public void setupUi(QMainWindow blackJack)
    {
        blackJack.setObjectName("blackJack");
        blackJack.resize(new QSize(917, 607).expandedTo(blackJack.minimumSizeHint()));
        actionNuevo_Juego = new QAction(blackJack);
        actionNuevo_Juego.setObjectName("actionNuevo_Juego");
        actionNuevo_Juego.setIcon(new QIcon(new QPixmap("classpath:icons/icon.png")));
        actionSalir = new QAction(blackJack);
        actionSalir.setObjectName("actionSalir");
        actionSalir.setIcon(new QIcon(new QPixmap("classpath:icons/salir.png")));
        actionAcerca_del_blackjack = new QAction(blackJack);
        actionAcerca_del_blackjack.setObjectName("actionAcerca_del_blackjack");
        actionAcerca_del_blackjack.setIcon(new QIcon(new QPixmap("classpath:icons/info.png")));
        actionComo_jugar = new QAction(blackJack);
        actionComo_jugar.setObjectName("actionComo_jugar");
        actionComo_jugar.setIcon(new QIcon(new QPixmap("classpath:icons/help.png")));
        actionEstad_sticas = new QAction(blackJack);
        actionEstad_sticas.setObjectName("actionEstad_sticas");
        actionEstad_sticas.setIcon(new QIcon(new QPixmap("classpath:icons/barras.png")));
        actionFullscreen = new QAction(blackJack);
        actionFullscreen.setObjectName("actionFullscreen");
        actionFullscreen.setIcon(new QIcon(new QPixmap("classpath:icons/fullscreen.png")));
        actionAtajos_de_teclado = new QAction(blackJack);
        actionAtajos_de_teclado.setObjectName("actionAtajos_de_teclado");
        centralwidget = new QWidget(blackJack);
        centralwidget.setObjectName("centralwidget");
        frame = new QFrame(centralwidget);
        frame.setObjectName("frame");
        frame.setGeometry(new QRect(-20, -10, 1081, 621));
        frame.setStyleSheet("background-image:url(classpath:icons/Scan0052.png)");
        frame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        frame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        stayButton = new QPushButton(frame);
        stayButton.setObjectName("stayButton");
        stayButton.setGeometry(new QRect(30, 300, 121, 41));
        QFont font = new QFont();
        font.setFamily("Segoe Print");
        font.setPointSize(14);
        font.setBold(true);
        font.setItalic(true);
        font.setWeight(75);
        stayButton.setFont(font);
        stayButton.setStyleSheet("");
        dcard1 = new QLabel(frame);
        dcard1.setObjectName("dcard1");
        dcard1.setGeometry(new QRect(300, 100, 141, 191));
        dcard1.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        pcard4 = new QLabel(frame);
        pcard4.setObjectName("pcard4");
        pcard4.setGeometry(new QRect(720, 370, 141, 201));
        pcard4.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        label = new QLabel(frame);
        label.setObjectName("label");
        label.setGeometry(new QRect(30, 110, 141, 41));
        QFont font1 = new QFont();
        font1.setFamily("Segoe Script");
        font1.setPointSize(18);
        font1.setBold(true);
        font1.setItalic(true);
        font1.setWeight(75);
        label.setFont(font1);
        label_2 = new QLabel(frame);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(30, 370, 121, 41));
        QFont font2 = new QFont();
        font2.setFamily("Segoe Script");
        font2.setPointSize(18);
        font2.setBold(true);
        font2.setItalic(true);
        font2.setWeight(75);
        label_2.setFont(font2);
        pcardPanel = new QLabel(frame);
        pcardPanel.setObjectName("pcardPanel");
        pcardPanel.setGeometry(new QRect(160, 370, 701, 201));
        QFont font3 = new QFont();
        font3.setFamily("Modern");
        font3.setPointSize(28);
        font3.setBold(true);
        font3.setItalic(true);
        font3.setWeight(75);
        pcardPanel.setFont(font3);
        pcardPanel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        dcardPanel = new QLabel(frame);
        dcardPanel.setObjectName("dcardPanel");
        dcardPanel.setGeometry(new QRect(160, 100, 701, 191));
        dcardPanel.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        dcard0 = new QLabel(frame);
        dcard0.setObjectName("dcard0");
        dcard0.setGeometry(new QRect(160, 100, 118, 171));
        dcard0.setStyleSheet("");
        dcard0.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        dcard5 = new QLabel(frame);
        dcard5.setObjectName("dcard5");
        dcard5.setEnabled(true);
        dcard5.setGeometry(new QRect(730, 100, 118, 171));
        dcard5.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        dcard5.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Plain);
        pcard0 = new QLabel(frame);
        pcard0.setObjectName("pcard0");
        pcard0.setGeometry(new QRect(160, 370, 118, 171));
        pcard0.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        dealButton = new QPushButton(frame);
        dealButton.setObjectName("dealButton");
        dealButton.setGeometry(new QRect(30, 180, 121, 41));
        QFont font4 = new QFont();
        font4.setFamily("Segoe Print");
        font4.setPointSize(16);
        font4.setBold(true);
        font4.setItalic(true);
        font4.setWeight(75);
        dealButton.setFont(font4);
        dealButton.setStyleSheet("");
        dcard4 = new QLabel(frame);
        dcard4.setObjectName("dcard4");
        dcard4.setGeometry(new QRect(590, 100, 118, 171));
        dcard4.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        pcard2 = new QLabel(frame);
        pcard2.setObjectName("pcard2");
        pcard2.setGeometry(new QRect(450, 370, 118, 171));
        pcard2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        playagainButton = new QPushButton(frame);
        playagainButton.setObjectName("playagainButton");
        playagainButton.setGeometry(new QRect(650, 50, 171, 41));
        QFont font5 = new QFont();
        font5.setFamily("Segoe Print");
        font5.setPointSize(14);
        font5.setBold(true);
        font5.setItalic(true);
        font5.setWeight(75);
        playagainButton.setFont(font5);
        playagainButton.setStyleSheet("");
        pcard1 = new QLabel(frame);
        pcard1.setObjectName("pcard1");
        pcard1.setGeometry(new QRect(300, 370, 118, 171));
        pcard1.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        hitButton = new QPushButton(frame);
        hitButton.setObjectName("hitButton");
        hitButton.setGeometry(new QRect(30, 240, 121, 41));
        QFont font6 = new QFont();
        font6.setFamily("Segoe Print");
        font6.setPointSize(14);
        font6.setBold(true);
        font6.setItalic(true);
        font6.setWeight(75);
        hitButton.setFont(font6);
        hitButton.setStyleSheet("");
        pcard3 = new QLabel(frame);
        pcard3.setObjectName("pcard3");
        pcard3.setGeometry(new QRect(590, 370, 118, 171));
        pcard3.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        dcard2 = new QLabel(frame);
        dcard2.setObjectName("dcard2");
        dcard2.setGeometry(new QRect(450, 100, 118, 171));
        dcard2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        dcard1_2 = new QLabel(frame);
        dcard1_2.setObjectName("dcard1_2");
        dcard1_2.setGeometry(new QRect(300, 100, 118, 171));
        dcard1_2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        pcard4_2 = new QLabel(frame);
        pcard4_2.setObjectName("pcard4_2");
        pcard4_2.setGeometry(new QRect(730, 370, 118, 171));
        pcard4_2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.Box);
        dealerLabel = new QTextBrowser(frame);
        dealerLabel.setObjectName("dealerLabel");
        dealerLabel.setGeometry(new QRect(360, 290, 251, 31));
        playerLabel = new QTextBrowser(frame);
        playerLabel.setObjectName("playerLabel");
        playerLabel.setGeometry(new QRect(360, 320, 251, 31));
        winlosebox = new QTextBrowser(frame);
        winlosebox.setObjectName("winlosebox");
        winlosebox.setGeometry(new QRect(205, 50, 451, 41));
        blackJack.setCentralWidget(centralwidget);
        menubar = new QMenuBar(blackJack);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 917, 22));
        menuJuego = new QMenu(menubar);
        menuJuego.setObjectName("menuJuego");
        menuAyuda = new QMenu(menubar);
        menuAyuda.setObjectName("menuAyuda");
        blackJack.setMenuBar(menubar);
        statusbar = new QStatusBar(blackJack);
        statusbar.setObjectName("statusbar");
        blackJack.setStatusBar(statusbar);

        menubar.addAction(menuJuego.menuAction());
        menubar.addAction(menuAyuda.menuAction());
        menuJuego.addAction(actionNuevo_Juego);
        menuJuego.addAction(actionEstad_sticas);
        menuJuego.addAction(actionFullscreen);
        menuJuego.addSeparator();
        menuJuego.addAction(actionSalir);
        menuAyuda.addSeparator();
        menuAyuda.addAction(actionAcerca_del_blackjack);
        menuAyuda.addAction(actionComo_jugar);
        menuAyuda.addAction(actionAtajos_de_teclado);
        retranslateUi(blackJack);

        blackJack.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow blackJack)
    {
        blackJack.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "MainWindow", null));
        actionNuevo_Juego.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Nuevo Juego", null));
        actionNuevo_Juego.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "F2", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Salir", null));
        actionSalir.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Ctrl+Q", null));
        actionAcerca_del_blackjack.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Acerca de este blackjack...", null));
        actionAcerca_del_blackjack.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "F1", null));
        actionComo_jugar.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Como jugar...", null));
        actionEstad_sticas.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Estad\u00edsticas", null));
        actionEstad_sticas.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "F4", null));
        actionFullscreen.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Fullscreen", null));
        actionFullscreen.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "F11", null));
        actionAtajos_de_teclado.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Atajos de teclado", null));
        stayButton.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Mantener", null));
        dcard1.setText("");
        pcard4.setText("");
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Crupier", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Jugador", null));
        pcardPanel.setText("");
        dcardPanel.setText("");
        dcard0.setText("");
        dcard5.setText("");
        pcard0.setText("");
        dealButton.setWhatsThis(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'Segoe Print'; font-size:16pt; font-weight:600; font-style:italic;\">\n"+
"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\">Repartir las cartas.</p></body></html>", null));
        dealButton.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Repartir", null));
        dcard4.setText("");
        pcard2.setText("");
        playagainButton.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Jugar de nuevo", null));
        pcard1.setText("");
        hitButton.setText(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Golpear", null));
        pcard3.setText("");
        dcard2.setText("");
        dcard1_2.setText("");
        pcard4_2.setText("");
        menuJuego.setTitle(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Juego", null));
        menuAyuda.setTitle(com.trolltech.qt.core.QCoreApplication.translate("blackJack", "Ayuda", null));
    } // retranslateUi

}

