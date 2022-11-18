package karaktermetodusok;

public class KarakterMetodusok {

    public static void main(String[] args) {
        char kar = 'a';

        // Alfabetikus-e
        System.out.println(Character.isAlphabetic(kar));

        // Szám-e
        System.out.println(Character.isDigit(kar));

        // Betű-e
        System.out.println(Character.isLetter(kar));

        // Betű vagy Szám-e
        System.out.println(Character.isLetterOrDigit(kar));

        // Kisbetűs-e
        System.out.println(Character.isLowerCase(kar));

        // Nagybetűs-e
        System.out.println(Character.isUpperCase(kar));

        // Szóköz-e
        System.out.println(Character.isSpaceChar(kar));

        // Whitespace karakter-e (sortörés)
        System.out.println(Character.isWhitespace(kar));

        // Nagybetűsítés
        System.out.println(Character.toUpperCase(kar));

        // Kisbetűsítés
        System.out.println(Character.toLowerCase(kar));
    }

}
