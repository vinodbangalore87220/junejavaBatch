package String;

public class StringClasses {
    public static void main(String[] args) {
        String st = "raman";
        String st1 = "raman";
        System.out.println(st == st1);

        String st2 = new String("rohan");
        String st3 = new String("amit");
        System.out.println(st2 == st3);
        System.out.println(st2.equals(st3));

        // String buffer
        // String builder, String
        String st4 = "raman";
         st4 = st4+"rohan";
         StringBuffer buff = new StringBuffer();
         buff.append(new String("customer"));
         buff.append("value");
    }
}
