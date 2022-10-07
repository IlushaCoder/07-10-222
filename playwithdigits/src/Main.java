import java.nio.charset.Charset;
import java.util.ArrayList;

public class Main {
    public static long digPow(int n, int p)
    {
        long sum_of_digits=0;
        String f=String.valueOf(n);
        ArrayList<Character> cifri = new ArrayList<Character>();
        for(int i=0;i<f.length();i++)
        {
            cifri.add(i,f.charAt(i));
        }
        for(int i=0;i<cifri.size();i++)
        {
            sum_of_digits+=(int)Math.pow((int)((Integer.parseInt(String.valueOf(cifri.get(i))))),p+i);
        }
        for(long k=1;k<sum_of_digits;k++)
        {
            if (k*n==sum_of_digits)
            {
                return k;

            }


        }

    return -1;
    }

    public static void main(String[] args) {
        System.out.println(digPow(695,2));






    }
}