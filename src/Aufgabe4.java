

public class Aufgabe4 {
    public static int billigtseTastatur(int[] n){
        int min=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]<min)
                min=n[i];
        }
        return min;
    }

    public static int teuersteGegenstand(int[] n1, int[] n2){
        int max1=-1;
        int max2=-1;
        for(int i=0;i<n1.length;i++){
            if(n1[i]>max1)
                max1=n1[i];
        }
        for(int i=0;i<n2.length;i++){
            if(n2[i]>max2)
                max2=n2[i];
        }
        if(max1>max2)
            return max1;
        else
            return max2;
    }

    public static int teuersteUSB(int[] n,int budget){
        int max=-1;
        for(int i=0;i<n.length;i++){
            if(n[i]>max && n[i]<=budget)
                max=n[i];
        }
        return max;
    }

    public static int maximalGeldbetrag(int budget, int[] n1, int[] n2){
        int max=-1;
        for(int i=0;i<n1.length;i++){
            for(int j=0;j<n2.length;j++){
                int sum=n1[i]+n2[j];
                if(sum>budget)
                    return -1;
                else
                    if(sum>max && sum<=budget)
                        max=sum;
            }
        }
        return max;
    }
}
