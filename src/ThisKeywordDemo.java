import com.sun.jdi.event.ThreadStartEvent;

public class ThisKeywordDemo {

    int x;

    ThisKeywordDemo(){
        System.out.println(this);
        System.out.println(this.x);
    }
    public static void main(String a[])
    {
        new ThisKeywordDemo();
        new ThisKeywordDemo();
    }
}
