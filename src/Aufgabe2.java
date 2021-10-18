public class Aufgabe2 {
    public static int maximaleZahl(int[] n){
        int max=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>max)
                max=n[i];
        }
        return max;
    }

    public static int minimalZhl(int[] n){
        int min=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]<min)
                min=n[i];
        }
        return min;
    }

    public static int maximaleSumme(int[] n){
        int sum=0;
        for(int i=0;i<n.length;i++)
            sum=sum+n[i];
        sum= sum-minimalZhl(n);
        return sum;
    }

    public static int minimaleSumme(int[] n){
        int sum=0;
        for(int i=0;i<n.length;i++)
            sum=sum+n[i];
        sum= sum-maximaleZahl(n);
        return sum;
    }

}
