package boletin10_2;

import javax.swing.JOptionPane;

public class JuegoAleatorio {

    int num1, num2, retry, random;

    public void randomGame() {

        num1 = (int) (Math.random() * (1 - 50) + 50);

        do {
            retry = Integer.parseInt(JOptionPane.showInputDialog("Nº de intentos "));
            for (int i = 1; i < retry; i++) {

                num2 = Integer.parseInt(JOptionPane.showInputDialog("Nº entre 0 y 50 "));

                if (num2 < 0 || num2 > 50) {
                    System.err.println("Nº no válido vuelve a introducir un número ");
                }

                if (num1 == num2) {
                    System.out.println("Has acertado! ");
                    break;
                }

                random = Math.abs(num1 - num2);

                if (random > 20) {
                    System.out.println("Muy lejos ");
                } else if (random >= 10 && random <= 20) {
                    System.out.println("Lejos ");
                } else if (random >= 5 && random <= 10) {
                    System.out.println("Cerca ");
                } else {
                    System.out.println("Muy cerca ");
                }
            }

        } while (num2 < 0 || num2 > 50);

    }
}
