public class Main {
    public static void main (String[] arg){
        System.out.println(Math.floor(9.99));//rounds to lowest whole number
        System.out.println(Math.floor(9.21));
        System.out.println(Math.floor(4.11));
        System.out.println(Math.floor(2.9999)); //when I put way more 0s than this, it oddly rounded up
        System.out.println(Math.floor(1.0)); //rounds to the lowest whole number
        System.out.println(Math.hypot(3.0,4.0)); //returns the hypotenuse of a triangle with the two side lengths inputted
        System.out.println(Math.hypot(5.0,7.0)); //same as^^
        System.out.println(Math.log10(10000));  //returns the log base ten of a value
    }
}
