package variables;

/**
 * MagicReview
 */
public class MagicReview {

    public static void main(String[] args) {
        int myNumber = 500;

        // The original references the myNumber variable

        int stepOne = myNumber * myNumber;
        // System.out.println(stepOne);
        
        int stepTwo = stepOne + myNumber;

        int stepThree = stepTwo / myNumber;

        int stepFour = stepThree + 17;

        int stepFive = stepFour - myNumber;

        int stepSix = stepFive / 6;

        System.out.println(stepSix);
    }
}