package main;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Preguntas extends JPanel{
	
	public static void main(String[] args) {
        int desicion = JOptionPane.showConfirmDialog(null, "This is an apple, ¿es el prononobre correcto para esta frase en ingles?");
        
        if (desicion == JOptionPane.YES_OPTION) {
            JOptionPane.showConfirmDialog(null, "Correcto");
        }   
        if (desicion == JOptionPane.NO_OPTION) {
            JOptionPane.showConfirmDialog(null, "Inorrecto");
        }
        if (desicion == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showConfirmDialog(null, "Game Over");
        }
        
        JOptionPane.showConfirmDialog(null, "Continua la carrera");
	}

}
