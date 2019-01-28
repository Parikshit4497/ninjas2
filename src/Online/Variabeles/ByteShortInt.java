package Online.Variabeles;

public class ByteShortInt {
    public static void main(String[] args) {
        int myMinValue=-2147483648/*-214_748_3648 literal *//*This is the minimum value an int can store -2^15 if we
        write -2147483649 then we will get an error integer value to large range  32bit */;
        int myMaxValue=2147483647;
        byte myByteValue=-128/* range -2^7 to 2^7-1 or 8 bit* /;
        short myShortValue=32767 /*range -2^15  to 2^15-1 16 bit*/;
        long myLongValue=9333333333333322L/*64 bit*/;
        byte myNewByteValue =(byte)(myByteValue/2) ; /*We have to do this because the default value for operation of whole number is int hence type conversion*/
        System.out.println(myNewByteValue);
        byte newByteNumber=123;
        short newShort=1234;
        int newInt=65333;
        long typeLong=50000+10*(newInt+newShort+newByteNumber);
        System.out.println(typeLong);
    }
}
