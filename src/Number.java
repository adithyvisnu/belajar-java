public class Number {
    public static void main(String[] args) {
        byte sampleByte = 127;
        short sampleShort = 16381;
        int sampleInt = 2_099_999_999;
        long sampleLong = 100_000_000_000L;
        float sampleFloat = 10.01F;
        double sampleDouble = 10.01;

        System.out.println("Type \t Val \t MIN \t MAX");
        System.out.printf("Byte \t %d \t %d \t %d \n", sampleByte, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short \t %d \t %d \t %d \n", sampleShort, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Int \t %d \t %d \t %d \n", sampleInt, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long \t %d \t %d \t %d \n", sampleLong, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Float \t %f \t %f \t %f \n", sampleFloat, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double \t %f \t %f \t %f \n", sampleDouble, Double.MIN_VALUE, Double.MAX_VALUE);

        int decimal = 25;
        int hexadecimal = 0xA12B;
        int binarydecimal = 0b0101011101;

        System.out.println("=".repeat(20));
        System.out.printf("%d \n", decimal);
        System.out.printf("%x \n", hexadecimal);
        System.out.printf("%d \n", binarydecimal);

        System.out.println("=".repeat(20));
        float byteToFloat = sampleByte;
        long shortToLong = sampleShort;
        System.out.println(byteToFloat);
        System.out.println(shortToLong);

        System.out.println("=".repeat(20));
        float doubleToFloat = (float) sampleDouble;
        int floatToInt = (int) sampleFloat;
        byte shortToByte = (byte) sampleShort;
        System.out.println(doubleToFloat);
        System.out.println(floatToInt);
        System.out.println(shortToByte);

    }
}
