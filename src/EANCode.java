public class EANCode {

    // Anfang Attribute

    // Ende Attribute



    // Anfang Methoden

    public static boolean istKorrekt(String pEingabe) {



        if (!istNummer(pEingabe) || pEingabe.length() != 13) {

            return false;

        }



        int[] feld = new int[12];

        for (int i = 0; i < 12; i++) {

            feld[i] = pEingabe.charAt(i)-48;

        } // end of for



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
        int unevenFields = 0;
        for (int i = 0; i < 12; i += 2){
            evenFields += pFeld[i];
        }
        for (int i = 1; i<=11; i += 2){
            unevenFields += pFeld[i]*3;
        }
        return 10 - (unevenFields + evenFields) % 10;
    }

    // Ende Methoden

}