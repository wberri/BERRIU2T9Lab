public class partnerstuff {
    public class CustomStringMethod
    {
        /* this class has no instance variables */

        /* Constructor with no parameters, and since there are no instance variables to initialize,
                  the constructor body is "empty" */
        public CustomStringMethod() { }


// WRITE AND TEST THE FOUR METHODS BELOW!

        /* Client provides searchFor and searchIn and method returns true if searchFor
                  is located somewhere in searchIn , and returns false otherwise.

                  For example, if searchFor is ple and searchIn is apples, this method returns true.
                  If searchFor is hello and searchIn is apples, this method returns false.
         */
        public boolean foundIn(String searchFor, String searchIn) {
            if (searchIn.indexOf(searchFor) != -1) {
                return true;
            }
            else{
                return false;
            }
        }


        /* Client provides myString and maxLength and method returns true if the length of myString
                  exceeds maxLength, and returns false otherwise.

                  For example, if myString is apples and maxLength is 5, this method returns true.
                  if myString is apples and maxLength is 6, this method returns false.
            */
        public boolean longerThan(String myString, int maxLength) {
            if (myString.length() > maxLength) {
                return true;
            } else {
                return false;
            }
        }


        /* Client provides str and idx and method returns a new String created by appending
                  the character located at index idx of str to the beginning of str and the end of str

                   For example, if str is apples and idx is 4, this method returns the string eapplese
                   If str is apples and idx is 0, this method returns the string aapplesa
         */
        public String funnyString(String str, int idx) {
            String firstPart = str.substring(idx, idx+1);
            return (firstPart + str + firstPart);
        }

        /* Client provides a single word as orig and the method returns a String that represents orig
                  written in “Pig Latin”, which means that the first letter of the word is removed from the front and
                  added to the end, and then “ay” is appended.

                  For example, if orig is bananas, then the method returns the “Pig Latin” version, ananasbay
        */
        public String pigLatin(String orig) {
            String firstLetter = orig.substring(0,1);
            String secondPart = orig.substring(1);

            return secondPart + firstLetter + "ay";
        }


        //extra credit
        public String starBetween(String str) {
            int x = 0;
            String returnWord = "";
            String temp;

            while (x != str.length()) {
                temp = str.substring(x, x+1);
                returnWord = returnWord + temp + "*";
                x++;
            }

            str = returnWord;

            String end = str.substring(0, (str.length() - 1));

            return end;
        }


        //1
        public void alphabetical(String str1, String str2) {
            if (str1.compareTo(str2)>0) {
                System.out.println(str1 + " comes AFTER " + str2 + " alphabetically.");
            } else if (str1.compareTo(str2)<0) {
                System.out.println(str1 + " comes BEFORE " + str2 + " alphabetically.");
            } else {
                System.out.println(str1 + " and " + str2 + " are the SAME string!");
            }
        }

        //2
        public String halvesReversed(String myString) {
            int middleNum = 0;
            if (myString.length()%2==0){
                middleNum = myString.length()/2;
            }  else {
                middleNum = (int)(myString.length()/2.0-0.5);
            }
            String firstHalf = myString.substring(0,middleNum);
            String secondHalf = myString.substring(middleNum);
            return secondHalf+firstHalf;
        }

        //3
        public String yellOrWhisper(String myString) {
            String firstLetter = myString.substring(0,1);

            if (firstLetter.compareTo("a") < 0){
                myString = myString.toUpperCase();
            } else {
                myString = myString.toLowerCase();
            }

            return myString;
        }

        //4
        public String endUp(String myString, int numToCap){
            if (numToCap>myString.length()) {
                myString = myString.toUpperCase();
                return myString;
            } else {
                String capString = myString.substring(myString.length()-numToCap);
                capString = capString.toUpperCase();
                myString = myString.substring(0, myString.length()-numToCap) + capString;
                return myString;
            }
        }

        //5
        public String removeCharacter(String myString, int removeIdx) {

            if (removeIdx >= myString.length()) {
                return myString;
            } else {
                String half = myString.substring(0,removeIdx);
                myString = half + myString.substring((removeIdx + 1));

                return myString;
            }
        }

        //6
        public String insertAt(String orig, String insertText, String searchStr) {

            if (orig.indexOf(searchStr) == -1) {
                return orig + insertText;
            } else {
                String half1 = orig.substring(0, orig.indexOf(searchStr));
                String half2 = orig.substring(orig.indexOf(searchStr));
                orig = half1 + insertText + half2;
                return orig;
            }

        }
    }
}
