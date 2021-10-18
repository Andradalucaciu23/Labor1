package com.company;
public class Aufgabe3 {
    public static String Summe(String str1, String str2)
    {
        // verificam care sir este mai lung
        if (str1.length() > str2.length()){
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        // lum un sir gol in care sa punem rezultatul final
        String rezultat = "";

        // calculam lungimea fiecarui sir
        int n1 = str1.length(), n2 = str2.length();

        // iar acum inversam stringul cu numere pentru a putea incepe sa calculam suma
        //suma se calculeaza de la final la inceput
        str1=new StringBuilder(str1).reverse().toString();
        str2=new StringBuilder(str2).reverse().toString();

        //in imprumut vom avea mereu ceea ce este in plus
        int imprumut = 0;
        for (int i = 0; i < n1; i++)
        {
            //charAt returneaza cifra de pozitia i
            int sum = ((int)(str1.charAt(i) - '0') + (int)(str2.charAt(i) - '0') + imprumut);
            //in rezultat se pune ultima cifra din suma
            rezultat =rezultat+ (char)(sum % 10 + '0');

            // calculam imprumut ul pentru urmatorul pas
            imprumut = sum / 10;
        }

        // adaugam ce a ramas la nr mai mare
        for (int i = n1; i < n2; i++)
        {
            int sum = ((int)(str2.charAt(i) - '0') + imprumut);
            rezultat =rezultat+ (char)(sum % 10 + '0');
            imprumut = sum / 10;
        }

        // si adaugam daca a mai ramas ceva in imprumut
        if (imprumut > 0)
            rezultat += (char)(imprumut + '0');

        // iar acum face inversarea stringului rezultat pentru a avea suma corect afisata
        rezultat = new StringBuilder(rezultat).reverse().toString();

        return rezultat;
    }

    // returneaza true daca n2 > n1
    static boolean kleiner(String str1, String str2)
    {
        int n1 = str1.length(), n2 = str2.length();
        if (n1 < n2)
            return true;
        if (n2 < n1)
            return false;

        for (int i = 0; i < n1; i++)
            if (str1.charAt(i) < str2.charAt(i))
                return true;
            else if (str1.charAt(i) > str2.charAt(i))
                return false;

        return false;
    }

    public static String Differenz(String str1, String str2)
    {
        // ne asiguram ca stringul 1 este mai mare
        if (kleiner(str1, str2)) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        //string gol pt rezultat
        String str = "";

        //lungimile sirurilor
        int n1 = str1.length(), n2 = str2.length();

        //inversarea sirurilor
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int imprumut = 0;

        for (int i = 0; i < n2; i++) {
            int sub = ((int)(str1.charAt(i) - '0') - (int)(str2.charAt(i) - '0') - imprumut);

            //daca sub<0 atunci adunam 10 si imprumut primeste 1 pt ce am pus in plus
            if (sub < 0) {
                sub = sub + 10;
                imprumut = 1;
            }
            else
                imprumut = 0;

            str += (char)(sub + '0');
        }

        // in caz ca mai raman cifre in nr mai mare
        for (int i = n2; i < n1; i++) {
            int sub = ((int)(str1.charAt(i) - '0') - imprumut);

            if (sub < 0) {
                sub = sub + 10;
                imprumut = 1;
            }
            else
                imprumut = 0;

            str += (char)(sub + '0');
        }

        return new StringBuilder(str).reverse().toString();
    }

    public static String Multiplikation(String num1, String num2)
    {
        int len1 = num1.length();
        int len2 = num2.length();

        //cazul in care un string este 0, at automat rezultatul este 0
        if (len1 == 0 || len2 == 0)
            return "0";

        //rezultatu va fi de lungimea celor 2 siruri adunate
        int rezultat[] = new int[len1 + len2];

        //pentru gasirea valorilor in rezultat
        int i_n1 = 0;
        int i_n2 = 0;

        for (int i = len1 - 1; i >= 0; i--)
        {
            int imprumut = 0;
            int n1 = num1.charAt(i) - '0';

            // pt a schimb poz
            i_n2 = 0;

            for (int j = len2 - 1; j >= 0; j--)
            {
                int n2 = num2.charAt(j) - '0';
                // inmultim cifrele actuale la care suntem
                int sum = n1 * n2 + rezultat[i_n1 + i_n2] + imprumut;
                // il refcem 0 pt urmatoare iteratie
                imprumut = sum / 10;
                //punem in rezultat ce am obtinut pana acum
                rezultat[i_n1 + i_n2] = sum % 10;
                i_n2++;
            }
            //cazul in care imprumut este > 0 se pune pe urmatoarea pozitie
            if (imprumut > 0)
                rezultat[i_n1 + i_n2] =rezultat[i_n1 + i_n2]+ imprumut;

            i_n1++;
        }
        int i = rezultat.length - 1;
        while (i >= 0 && rezultat[i] == 0)
            i--;

        if (i == -1)
            return "0";
        //pt a afisa rezultatul
        String s = "";

        while (i >= 0)
            s += (rezultat[i--]);

        return s;
    }

    public static String Division(String zahl, int divisor)
    {
        //folosim StrinBuilder deoarece trebuie sa modificam rezultatul
        StringBuilder result = new StringBuilder();

        //pt a putea parcurge numarul il schimbam intr un string
        char[] div = zahl.toCharArray();

        int imprumut = 0;

        for (int i = 0; i < div.length; i++) {

            int x = imprumut * 10 + Character.getNumericValue(div[i]);
            result.append(x / divisor);
            imprumut = x % divisor;
        }

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != '0') {
                //cu substring punem in rezultat cifra de pe pozitia la care suntem
                return result.substring(i);
            }
        }
        //daca zahl e gol
        return "";
    }
}
