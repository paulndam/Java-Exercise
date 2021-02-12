// WARM UP 1 

public class Ex1 {

    public static void main(String[] args) {

        boolean monday = true;
        boolean tuesday = true;
        System.out.println(sleepIn(monday, tuesday));

        boolean monkey1 = true;
        boolean monkey2 = false;
        System.out.println(monkeyTrouble(monkey1, monkey2));

        int numOne = 2;
        int numTwo = 2;
        System.out.println(sumDouble(numOne, numTwo));

        int numThree = 50;
        System.out.println(diff21(numThree));

        int hour1 = 4;
        boolean talk = true;
        System.out.println(parrotTrouble(talk, hour1));

    }

    // The parameter weekday is true if it is a weekday, and the parameter vacation
    // is true if we are on vacation. We sleep in if it is not a weekday or we're on
    // vacation. Return true if we sleep in.

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    };

    // We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
    // if each is smiling. We are in trouble if they are both smiling or if neither
    // of them is smiling. Return true if we are in trouble.
    // monkeyTrouble(true, true) → true
    // monkeyTrouble(false, false) → true
    // monkeyTrouble(true, false) → false

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile && bSmile) {
            return true;

        }

        if (!aSmile && !bSmile) {
            return true;
        }

        return false;
    }

    // Given two int values, return their sum. Unless the two values are the same,
    // then return double their sum.
    // sumDouble(1, 2) → 3
    // sumDouble(3, 2) → 5
    // sumDouble(2, 2) → 8

    public static int sumDouble(int a, int b) {

        int sum;

        sum = a + b;

        if (a == b) {
            return sum * 2;
        }

        return sum;
    }

    // Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    // diff21(19) → 2
    // diff21(10) → 11
    // diff21(21) → 0

    public static int diff21(int n){

        int diff = 21;

        if(n <= diff){
            return diff - n;
        }
         return (n - diff) * 2;
    }

    // We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    // parrotTrouble(true, 6) → true
    // parrotTrouble(true, 7) → false
    // parrotTrouble(false, 6) → false

    public static boolean parrotTrouble(boolean talking, int hour){
        return (talking && (hour < 7 || hour > 20));
    }




}