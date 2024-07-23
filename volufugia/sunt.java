try {
    // Some code that might throw an exception
    // For example:
    int result = 10 / 0;  // This will throw an ArithmeticException
} catch (ArithmeticException exception) {
    // Catch the exception and assign it to a variable named 'exception'
    // You can then handle or log the exception
    System.out.println("Exception caught: " + exception.getMessage());
}
