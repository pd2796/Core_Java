public class ImplimentsRunnable extends Thread {
    public void run()
    {

        System.out.println("This is current thrad"+Thread.currentThread().getId()+"is runnig");
    }


    public static void main(String[] args) {
        int n = 10;
        for(int i = 0 ;i< n;i++)
        {
            ImplimentsRunnable t = new  ImplimentsRunnable();
            t.start();
        }
    }
}
