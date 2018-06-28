package Level_2_Intermediate;

public class UniqueSum {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        System.out.println(sumReturn(n1, n2, n3));
    }
    public static int sumReturn(int n1, int n2, int n3)
    {
        if(n1 != n2 && n2 != n3 && n1 != n3)
            return n1 + n2 + n3;
        if(n1 == n2 && n2 == n3)
            return 0;
        else
            return 0;
    }
}
