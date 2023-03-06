package packages;

public class NCR {
    public static int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int nCr(int n,int r){
        int val= fact(n)/(fact(n-r)*fact(r));
        return val;
    }
}
