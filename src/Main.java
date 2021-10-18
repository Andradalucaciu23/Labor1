import static com.company.Aufgabe3.*;

public class Main {
    public static void main(String[] args) {
        int[] n1 = new int[]{20,67,35,48,71,82,98};
        int[] n2 = new int[]{4,8,3,10,17};
        int [] tastatur = new int[]{40,50,60};
        int [] USB = new int[]{8,12};

        String str1 = "12";
        String str2 = "198111";

        String str3 = "978";
        String str4 = "12977";

        String str5= "236000000";
        String str6="2";

        String str7= "236000000";
        int str8= 2;


        System.out.println("Aufgabe 1");
        System.out.println(java.util.Arrays.toString(n1));
        System.out.println(java.util.Arrays.toString(Aufgabe1.nichtausreichteNote(n1)));
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe1.Durschnittnote(n1)}));
        System.out.println(java.util.Arrays.toString(Aufgabe1.abgerundeteNote(n1)));
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe1.maximalNote(n1)}));
        System.out.println();

        System.out.println("Aufgabe 2");
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe2.maximaleZahl(n2)}));
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe2.minimalZhl(n2)}));
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe2.maximaleSumme(n2)}));
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe2.minimaleSumme(n2)}));
        System.out.println();

        System.out.println("Aufgabe 3");
        System.out.println(Summe(str1, str2));
        System.out.println(Differenz(str3, str4));
        System.out.println(Multiplikation(str5, str6));
        System.out.println(Division(str7, str8));
        System.out.println();

        System.out.println("Aufgabe 4");
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe4.billigtseTastatur(tastatur)}));
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe4.teuersteGegenstand(tastatur, USB)}));
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe4.teuersteUSB(USB,25)}));
        System.out.println(java.util.Arrays.toString(new int[]{Aufgabe4.maximalGeldbetrag(60,tastatur,USB)}));
        System.out.println();


    }
}
