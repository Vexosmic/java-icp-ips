public class NonEsc {
    public static void main(String[] args) {
        System.out.println("Biswa");
        //This does not print with the double quotes, as it is a non-escaped string.
        //Neither does using ""Biswa"" work.
        //It will instead give a compile time error, as it is not a valid string.
    }
}