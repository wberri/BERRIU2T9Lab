public class LuckyNumbers {

    public LuckyNumbers() {
    }

    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max) {
        int rand = (int) (Math.random() * (max-min+1)) +min;
        return rand;
    }

    public String getLuckyNumbers() {
        return "Your lucky numbers are: " +randomIntegerBetween(1,65) + " " +randomIntegerBetween(1,65) +" "+ randomIntegerBetween(1,65) +" "+ randomIntegerBetween(1,65) +" "+ randomIntegerBetween(1,65) +"\n " + "The super ball is: " + randomIntegerBetween(1,30);
    }
}
