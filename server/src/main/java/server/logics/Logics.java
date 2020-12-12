package server.logics;

public class Logics {
    private static double percentLowerCase =0;
    private static double percentUpperCase =0;

    static public void countUp(String input){
        percentLowerCase = 0;
        percentUpperCase = 0;

        int lowerCase = 0;
        int upperCase = 0;
        for(int i=0; i<input.length(); i++){
            if(Character.isLowerCase(input.charAt(i))) lowerCase++;
            if(Character.isUpperCase(input.charAt(i))) upperCase++;
        }

        percentLowerCase = (double) lowerCase/input.length() * 100;
        percentUpperCase = (double) upperCase/input.length() * 100;
    }

    public static double getPercentLowerCase() {
        return percentLowerCase;
    }

    public static double getPercentUpperCase() {
        return percentUpperCase;
    }

}
