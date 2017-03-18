package convertidornumerico.utils;

/**
 *
 * @author Juan Carlos Lamas Alfaro
 */
public class Excepciones {

    public static boolean cumpleDecimal(String numero) {
        String permitido = "1234567890";
        boolean cumple = false;
        for (int i = 0; i < numero.length(); i++) {
            for (int j = 0; j < permitido.length(); j++) {
                if (numero.charAt(i) == permitido.charAt(j)) {
                    cumple = true;
                    break;
                }
            }
            if (!cumple) {
                return false;
            } else {
                cumple = false;
            }
        }
        return true;
    }    
    public static boolean cumpleOctal(String numero) {
        String permitido = "12345670";
        boolean cumple = false;
        for (int i = 0; i < numero.length(); i++) {
            for (int j = 0; j < permitido.length(); j++) {
                if (numero.charAt(i) == permitido.charAt(j)) {
                    cumple = true;
                    break;
                }
            }
            if (!cumple) {
                return false;
            } else {
                cumple = false;
            }
        }
        return true;
    }
    public static boolean cumpleHexadecimal(String numero) {
        String permitido = "1234567890ABCDEFabcdef";
        boolean cumple = false;
        for (int i = 0; i < numero.length(); i++) {
            for (int j = 0; j < permitido.length(); j++) {
                if (numero.charAt(i) == permitido.charAt(j)) {
                    cumple = true;
                    break;
                }
            }
            if (!cumple) {
                return false;
            } else {
                cumple = false;
            }
        }
        return true;
    }
    public static boolean cumpleBinario(String numero) {
        String permitido = "10";
        boolean cumple = false;
        for (int i = 0; i < numero.length(); i++) {
            for (int j = 0; j < permitido.length(); j++) {
                if (numero.charAt(i) == permitido.charAt(j)) {
                    cumple = true;
                    break;
                }
            }
            if (!cumple) {
                return false;
            } else {
                cumple = false;
            }
        }
        return true;
    }
}
