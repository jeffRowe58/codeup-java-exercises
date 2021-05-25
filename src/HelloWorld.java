import com.sun.jdi.PathSearchingVirtualMachine;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notAsSmallNumber = 3000;

        int num = 450000000;

        long largeNumber = 14;

        System.out.println(largeNumber);

        float decimal = 1.5F;

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        char singleLetter = 'g';

        boolean amILearningJava = true;

        String message = "How's it going?\n Everything \"alright\"? \n\tJava isn't that scary, is it?";
        System.out.println(message);

        long longNum = 450000;

        int intNum = 450000;

        int bigSum = (int)(longNum + intNum);
        System.out.println(bigSum);

        int sum = 4 + 5;
        System.out.println(sum);

        int difference = 72 - 19;
        System.out.println(difference);

        int product = 11 * 9;
        System.out.println(product);

        int quotient = product / sum;
        System.out.println(quotient);

        int remainder = difference % sum;
        System.out.println(remainder);

        int whatWillThisBe = -4 * 2;
        System.out.println(whatWillThisBe);

        System.out.println(sum++);

        int iAmAnInt = 44;
        long iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = 99;
        iAmAnInt = (int) iAmALong;
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAmADouble = iAmAnInt;
        System.out.println(iAmADouble);

        iAmADouble = 3.141598;
        iAmAnInt = (int)iAmADouble;
        System.out.println(iAmAnInt);

        int myFavoriteNumber = 58;
        System.out.println(myFavoriteNumber);

        String myString = "Howdy, Ya'll";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

        /*int x = 5;
        System.out.println(x++);
        System.out.println(x);*/

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        int x = 4;
        x += 5;
        System.out.println(x);

        int j = 3;
        int k = 4;
        k *= j;
        System.out.println(k);

        int h = 10;
        int i = 2;

        h /= i;

        i -= h;

        System.out.println(h);;
        System.out.println(i);
    }
}

