public class PrimitiveAndString {
    public static void main(String[] aa){
        byte x = 100;

        String s = Byte.toString(x);
        byte b = Byte.parseByte(s);
        System.out.println(b);
    }
}
