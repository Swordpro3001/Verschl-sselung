package Verschluesselung;

/**
 * Methoden zum Verschlüsseln und Entschlüsseln von Zeichenketten
 * @author Franz Puerto
 * @version 2022-12-04
 */
public class Verschluesselung {

    /**
     * Methode verschlüsselt einen String
     * @param text zu verschlüsselnder Text
     * @return verschlüsselten Text
     */
    public static String verschluesseln(String text){
        String verschluesselt = "";
        text = text.toUpperCase();
        for(int i = 0; i < text.length(); i++) {
            verschluesselt += (char)(text.charAt(i) + 3);
        }
        return verschluesselt;
    }

    /**
     * Methode verschlüsselt einen String
     * @param text zu verschlüsselnder Text
     * @param verschiebung Verschiebung
     * @return verschlüsselter Text
     */
    public static String verschluesseln(String text, int verschiebung){
        String verschluesselt = "";
        text = text.toUpperCase();
        for(int i = 0; i < text.length(); i++) {
            verschluesselt += (char)(text.charAt(i) + verschiebung);
        }
        return verschluesselt;
    }

    /**
     * Methode verschlüsselt einen String
     * @param text zu verschlüsselnder Text
     * @param verschiebung Verschiebung
     * @return verschlüsselter Text
     */
    public static String verschluesseln(String text, char verschiebung){
        String verschluesselt = "";
        verschiebung = Character.toLowerCase(verschiebung);
        text = text.toUpperCase();
        for(int i = 0; i < text.length(); i++) {
            verschluesselt += (char)(text.charAt(i) + (int)verschiebung);
        }
        return verschluesselt;
    }

    /**
     * Methode entschlüsselt einen String
     * @param text zu entschlüsselnder Text
     * @return entschlüsselter Text
     */
    public static String entschluesseln(String text){
        String entschluesselt = "";
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++) {
            entschluesselt += (char)(text.charAt(i) - 3);
        }
        return entschluesselt;
    }

    /**
     * Methode entschlüsselt einen String
     * @param text zu entschlüsselnder Text
     * @param verschiebung Verschiebung
     * @return entschlüsselter Text
     */
    public static String entschluesseln(String text, int verschiebung){
        String entschluesselt = "";
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++) {
            entschluesselt += (char)(text.charAt(i) - verschiebung);
        }
        return entschluesselt;
    }

    /**
     * Methode entschlüsselt einen String
     * @param text zu entschlüsselnder Text
     * @param verschiebung Verschiebung
     * @return entschlüsselter Text
     */
    public static String entschluesseln(String text, char verschiebung){
        String entschluesselt = "";
        text = text.toLowerCase();
        verschiebung = Character.toLowerCase(verschiebung);
        for(int i = 0; i < text.length(); i++) {
            entschluesselt += (char)(text.charAt(i) - (int)verschiebung);
        }
        return entschluesselt;
    }

}
