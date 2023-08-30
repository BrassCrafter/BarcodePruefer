public class EANCode {
    public static boolean istKorrekt(String pEingabe) {
        if (!istNummer(pEingabe) || pEingabe.length() != 13) {
            return false;
        }
        int[] feld = new int[12];
        for (int i = 0; i < 12; i++) {
            feld[i] = pEingabe.charAt(i)-48;
        }
        return berechnePruefziffer(feld) == (pEingabe.charAt(12)-48);
    }
    private static boolean istNummer(String pEingabe) {
        for (int i=0;i<pEingabe.length() ; i++ ) {
            if (pEingabe.charAt(i) < 48 || pEingabe.charAt(i) > 57 ) {
                return false;
            }
        }
        return true;
    }
    private static int berechnePruefziffer(int[] pFeld) {
        int evenFields = 0;
        int oddFields = 0;
        for (int i = 0; i < 12; i ++){
            if (i % 2 == 0) {
                evenFields += pFeld[i];
            } else {
               oddFields += pFeld[i] * 3;
            }
        }
        return 10 - (oddFields + evenFields) % 10;
    }
}