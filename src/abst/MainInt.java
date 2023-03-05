package abst;

interface inmt
{
    final static int y = 4444;

    int tlp(int i);
    int zpx = 20;
    final int sss = 2;
    public final int s = 20;


}
class a implements inmt {


    @Override
    public int tlp(int i) {
        return i*i;
    }
    interface i{
        int z = 45;
    }
}

public class MainInt  {
    public static void main(String[] args) {
        inmt m = new a();
        System.out.println(m.tlp(50));
        System.out.println(a.i.z);
        int st = inmt.y;
        System.out.println(inmt.y);
    }
}
