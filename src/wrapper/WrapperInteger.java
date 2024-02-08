package wrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        Integer intObjeto = Integer.valueOf(6700);
        Integer num = 7800;

        int num2  = intObjeto;
        System.out.println("num2 = " + num2);
        System.out.println("intObjeto = " + intObjeto);

        int num23 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String  tvlCD = "34300";
        Integer valTv = Integer.valueOf(tvlCD);
        System.out.println("valTv = " + valTv);
    }
}
