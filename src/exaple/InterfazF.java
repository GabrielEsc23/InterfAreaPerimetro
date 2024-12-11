package exaple;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazF {
    public JPanel panel;
    private JTextField radio;
    private JButton cirButton;
    private JTextField ladoCuadrado;
    private JButton cuaButton;
    private JTextField diagonalMayor;
    private JTextField diagonalMenor;
    private JButton romButton;
    private JLabel totalCircA;
    private JTextField baseRectangulo;
    private JTextField alturaRectangulo;
    private JButton recButton;
    private JTextField alturaTri;
    private JButton triButton;
    private JLabel totalCircP;
    private JLabel totalCuaP;
    private JLabel totalCuaA;
    private JLabel totalRomP;
    private JLabel totalRomA;
    private JLabel totalRecP;
    private JLabel totalRecA;
    private JLabel totalTriP;
    private JLabel totalTriA;

    public InterfazF() {
        cirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radio2 = Double.parseDouble(radio.getText());
                double area = Math.PI * Math.pow(radio2, 2);
                double perimetro = 2 * Math.PI * radio2;
                totalCircA.setText("El valor del área del círculo es: " + area);
                totalCircP.setText("El valor del perímetro del círculo es: " + perimetro);
            }
        });

        cuaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lado = Double.parseDouble(ladoCuadrado.getText());
                double perimetro = lado * 4;
                double area = Math.pow(lado, 2);
                totalCuaA.setText("El área del cuadrado es: " + area);
                totalCuaP.setText("El perímetro del cuadrado es: " + perimetro);
            }
        });

        romButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double diagonalMayor1 = Double.parseDouble(diagonalMayor.getText());
                double diagonalMenor1 = Double.parseDouble(diagonalMenor.getText());
                double area = (diagonalMayor1 * diagonalMenor1) / 2;
                // Calcular el lado del rombo usando el teorema de Pitágoras
                double ladoRombo = Math.sqrt(Math.pow(diagonalMayor1 / 2, 2) + Math.pow(diagonalMenor1 / 2, 2));
                double perimetro = 4 * ladoRombo;
                totalRomA.setText("El área del rombo es: " + area);
                totalRomP.setText("El perímetro del rombo es: " + perimetro);
            }
        });

        recButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double baseRectangulo1 = Double.parseDouble(baseRectangulo.getText());
                double alturaRectangulo1 = Double.parseDouble(alturaRectangulo.getText());
                double area = baseRectangulo1 * alturaRectangulo1;
                double perimetro = 2 * (baseRectangulo1 + alturaRectangulo1);
                totalRecA.setText("El área del rectángulo es: " + area);
                totalRecP.setText("El perímetro del rectángulo es: " + perimetro);
            }
        });

        triButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double alturaTri1 = Double.parseDouble(alturaTri.getText());
                double lado = (2 *alturaTri1) / Math.sqrt(3);

                // Calcular el área del triángulo equilátero
                double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);

                // Calcular el perímetro del triángulo equilátero
                double perimetro = 3 * lado;
                totalTriA.setText("El área del triángulo es: " + area);
                totalTriP.setText("El perímetro del triángulo es: " + perimetro);
            }
        });
    }

}
