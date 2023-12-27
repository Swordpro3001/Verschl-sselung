package Verschluesselung;

import javax.swing.*;

/**
 * Methoden zum Verschlüsseln und Entschlüsseln von Zeichenketten
 * @author Franz Puerto
 * @version 2022-12-04
 */
public class VerschluesselungEingabe {

        /**
         * Main-Methode verschlüsselt einen String
         * @param args leer
         */
        public static void main(String[] args) {
            String eing = JOptionPane.showInputDialog(null, "1. Einen Text mittels Standard-Cäsar-Verschlüsselung verschlüsseln.\n2. Einen Text durch Eingabe eines eigenen Verschiebewertes verschlüsseln.\n3. Einen Text durch Eingabe eines eigenen Schlüsselbuchstabens verschlüsseln.\n4. Einen Text mittels Standard-Cäsar-Verschlüsselung entschlüsseln.\n5. Einen Text durch Eingabe eines eigenen Verschiebewertes entschlüsseln.\n6. Einen Text durch Eingabe eines eigenen Schlüsselbuchstabens entschlüsseln.");
            switch (Integer.parseInt(eing)){
                case default -> JOptionPane.showMessageDialog(null, "Fehlerhafte Eingabe!");
                case 1 ->{
                    String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie den zu verschlüsselnden Text ein:");
                    JOptionPane.showMessageDialog(null, "Der verschlüsselte Text lautet: " + Verschluesselung.verschluesseln(eingabe));
                }
                case 2 ->{
                    String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie den zu verschlüsselnden Text ein:");
                    String verschiebung = JOptionPane.showInputDialog(null, "Bitte geben Sie die Verschiebung ein:");
                    JOptionPane.showMessageDialog(null, "Der verschlüsselte Text lautet: " + Verschluesselung.verschluesseln(eingabe, Integer.parseInt(verschiebung)));
                }
                case 3 ->{
                    String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie den zu verschlüsselnden Text ein:");
                    String verschiebung = JOptionPane.showInputDialog(null, "Bitte geben Sie den Schlüsselbuchstaben ein:");
                    JOptionPane.showMessageDialog(null, "Der verschlüsselte Text lautet: " + Verschluesselung.verschluesseln(eingabe, verschiebung.charAt(0)));
                }
                case 4 ->{
                    String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie den zu entschlüsselnden Text ein:");
                    JOptionPane.showMessageDialog(null, "Der entschlüsselte Text lautet: " + Verschluesselung.entschluesseln(eingabe));
                }
                case 5 ->{
                    String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie den zu entschlüsselnden Text ein:");
                    String verschiebung = JOptionPane.showInputDialog(null, "Bitte geben Sie die Verschiebung ein:");
                    JOptionPane.showMessageDialog(null, "Der entschlüsselte Text lautet: " + Verschluesselung.entschluesseln(eingabe, Integer.parseInt(verschiebung)));
                }
                case 6 ->{
                    String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie den zu entschlüsselnden Text ein:");
                    String verschiebung = JOptionPane.showInputDialog(null, "Bitte geben Sie den Schlüsselbuchstaben ein:");
                    JOptionPane.showMessageDialog(null, "Der entschlüsselte Text lautet: " + Verschluesselung.entschluesseln(eingabe, verschiebung.charAt(0)));
                }
            }


        }
}
