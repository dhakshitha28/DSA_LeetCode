public class Main {

    public static void main(String[] args) {

        String[] arr = new String[] {"123", "674", "888"};

        Solution.main(arr);
    }
    public class Solution {

        public static void main(String[] args) {

            int lNum = -1;
            int hun = 9;
            int tens = 9;
            int ones = 9;

            for (int i = 0; i < args.length; i++) {

                String X = args[i];

                for (int j = 0; j < X.length(); j++) {

                    int value = X.charAt(j) - '0';

                    if (lNum < value) {
                        lNum = value;
                    }

                    if (j == 0 && value < hun) {
                        hun = value;
                    }

                    if (j == 1&& value < tens) {
                        tens = value;
                    }

                    // Ones position
                    if (j == 2 && value < ones) {
                        ones = value;
                    }
                }
            }

            System.out.println(lNum + "" + hun + "" + tens + "" + ones);
        }
    }



}