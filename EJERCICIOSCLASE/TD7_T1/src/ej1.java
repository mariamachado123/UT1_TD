public class ej1 {
    public static void main(String[] args) {
        int s = 1;
        while (s != 1000) {
            s ++;

        }
        System.out.println(s);

        /*SEGUNDA MANERA USANDO INTERN*/
        String ss="1";
        while (!ss.intern().equals("1000")) {
            ss += "0";
        }
        System.out.println(ss);
    }
}
