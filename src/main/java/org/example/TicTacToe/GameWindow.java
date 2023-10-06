package org.example.TicTacToe;

import org.example.TicTacToe.GameMap;
import org.example.TicTacToe.GameSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    static public final int WINDOW_HEIGHT = 640;
    static public final int WINDOW_WIDTH = 720;
    static public final int WINDOW_POS_X = 300;
    static public final int WINDOW_POS_Y = 100;
    static public final String WINDOW_NAME = "Игра в крестики-нолики";
    GameSettings gameSettings;
    GameMap gameMap;
    GameWindow(){
        //свойства окна
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(WINDOW_NAME);
        setResizable(false);

        //элементы основная часть
        gameSettings = new GameSettings(this);
        gameMap = new GameMap(gameSettings.sliderSizeValue, gameSettings.sliderSizeValue);
        //элементы нижняя часть
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Exit");
        JPanel controPanel = new JPanel(new GridLayout(1,2));

        //обработчики кнопок
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                gameSettings.setVisible(true);
            }
        });


        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        //отрисовка
        controPanel.add(startButton);
        controPanel.add(stopButton);
        add(controPanel, BorderLayout.PAGE_END);
        add(gameMap);
        gameMap.setVisible(false);
        setVisible(true);

    }
    void startNewGame(boolean mode, int size_x, int size_y, int win_len){
        gameMap.setVisible(true);
        gameMap.startNewGame(mode, size_x, size_y, win_len);
    }
}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class GameWindow extends JFrame{
//    private static final int WINDOW_HEIGHT = 555;
//    private static final int WINDOW_WIDTH = 507;
//    private static final int WINDOW_POSX = 800;
//    private static final int WINDOW_POSY = 300;
//
//    JButton btnStart = new JButton("New Game");
//    JButton btnExit = new JButton("Exit");
//
//    GameMap map;
//    GameSettings settings;
//    GameWindow(){
//        //завершение программы вместе с закрытием окна
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLocation(WINDOW_POSX, WINDOW_POSY);
//        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//        setTitle("TicTacToe");
//        //запрет на изменение размеров окна
//        setResizable(false);
//
//        map = new GameMap();
//        settings = new GameSettings(this);
////        settings.setVisible(true);
//
//        //обработка событий на кнопках
//
//        //нажатие на выход
//        btnExit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e){
//                System.exit(0);
//            }
//        });
//
//        //нажатие на старт
//        btnStart.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                settings.setVisible(true);
//            }
//        });
//
//        JPanel panBottom = new JPanel(new GridLayout(1, 2));
//        panBottom.add(btnStart);
//        panBottom.add(btnExit);
//        add(panBottom, BorderLayout.SOUTH);
//        add(map);
//
//        setVisible(true);
//    }
//
//    void startNewGame(int mode, int fSzX, int fSzY, int wLen) {
//        map.startNewGame(mode, fSzX, fSzY, wLen);
//    }
//}