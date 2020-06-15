public class DataTypes {
    public static void main(String[] args) {
        boolean isSkyBlue = true;
//        These three are not commonly used in our programs.
        byte myByte = -128;
        char myChar = 'a';
        short myShortVariable = -30000;
        int myInteger = 90000;
        float myFloat = 7.42f;
        double myDouble = -90.283333;
        long longVariable = 9999990;


        System.out.println("My boolean variable : " + isSkyBlue);
        System.out.println("My byte variable is equal to " + myByte);
        System.out.println("My char variable is equal to " + myChar);
        System.out.println("My short variable is equal to " + myShortVariable);
        System.out.println("My integer plus 1k is equal to " + (myInteger + 1000));
        System.out.println("My integer plus 1k is equal to " + myInteger + 1000);
        System.out.println(myFloat);
    }
}
