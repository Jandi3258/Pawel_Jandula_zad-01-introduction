package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String tekst) {
        if (tekst == null) {
            return null;
        }
        tekst = tekst.trim();
        String pom = new StringBuilder(tekst).reverse().toString();
        return pom;
    }

    public String reverseWords(String tekst) {
        if (tekst == null) {
            return null;
        }
        tekst = tekst.trim();
        String[] slowa = tekst.split(" ");
        StringBuilder odwroconyTekst = new StringBuilder();
        for (int i = slowa.length - 1; i >= 0; i--) {
            odwroconyTekst.append(slowa[i]);
            if (i > 0) {
                odwroconyTekst.append(" ");
            }
        }
        return odwroconyTekst.toString();
    }
}
