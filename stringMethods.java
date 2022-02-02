public class stringMethods {
    public static void main(String[] args) {
        String myName = "Yukio";
        System.out.println(myName);
        String replacementFirst = "A";
        String firstResult = replacementFirst + myName.substring(1);
        System.out.println(firstResult);
        String replacementLast = "Z";
        String lastResult = myName.substring(0,4) + replacementLast;
        System.out.println(lastResult);
        String someURLs = "www.google.com";
        System.out.println(someURLs);
        String justNameSection = someURLs.substring(4,10) + "1331";
        System.out.println(justNameSection);
    }
}
