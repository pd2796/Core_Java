package finalconcept;

public class B {
    public int circle(int a,int b)
    {
        int ans = a*b;
        System.out.println(ans);
        return ans;
    }
    public double circle(double a,double b)
    {
        double ans = a*b;
        System.out.println(ans);
        return ans;

    }
    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.circle(50,63));
        System.out.println(b.circle(50.3,63.2));

    }
}
