package exception;


    public class ConversionException {
        // Method to convert a string to an integer
        // Throws NumberFormatException if the string cannot be converted to an integer
        public static int convertStringToInt(String str) throws NumberFormatException {
            return Integer.parseInt(str);
        }

        public static void main(String[] args) {
            // Array of input strings containing various types of input
            String[] inputs = {"23", "45.67", "test", "123f"};

            // Iterate over each input string
            for (String input : inputs) {
                try {
                    // Attempt to convert the current input string to an integer
                    int result = convertStringToInt(input);
                    // If successful, print the input string and the converted integer
                    System.out.println("Input: " + input + ", Output: " + result);
                } catch (NumberFormatException e) {
                    // If a NumberFormatException occurs during conversion, catch it
                    // and print the input string along with the exception message
                    System.out.println("Input: " + input + ", Exception: " + e.getMessage());
                }
            }
        }
}
