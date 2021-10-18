public class Aufgabe1 {
    public static int[] nichtausreichteNote(int[] n) {
        int[] note;
        //
        note = new int[2];
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 40) {
                note[index] = n[i];
                index++;
            }
        }
        return note;
    }

    public static int Durschnittnote(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        sum=sum / n.length;
        return sum;
    }

    public static int[] abgerundeteNote(int[] n) {
        for (int i = 0; i < n.length; i++) {
            //n[i]- n[i] % 5 < 3 && n[i] >= 38
            if (n[i] >= 38 && ((n[i]+1)*5)-n[i] <= 3) {
                n[i] = (n[i]/5+1)*5;
            }
            else
                n[i]=n[i];
        }
        return n;
    }

        public static int maximalNote(int[] n){
            n=abgerundeteNote(n);
            int max= -1;
            for(int i=0;i<n.length;i++){
                if(n[i]>max)
                    max=n[i];
            }
            return max;
        }
}

