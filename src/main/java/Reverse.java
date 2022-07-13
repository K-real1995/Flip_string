public class Reverse {

    protected static String reverse(String str) {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(str);
        return stringBuffer.reverse().toString();

    }
}
