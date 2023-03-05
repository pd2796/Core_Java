public class Test_new {
    public static void main(String ar[])
    {

        int a[] = {90,27,19,35,12,10};
        int size = a.length;
        int temp=1,b=0;
        for(int i = 0;i<size;i++)
        {
            b = a[i];
            a[i] = temp;
            temp = b;

            System.out.println(b);

            //  System.out.println(temp);

        }




    }
}
