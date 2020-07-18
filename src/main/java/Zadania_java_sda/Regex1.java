package Zadania_java_sda;

import java.util.regex.Pattern;

public class Regex1 {
    public static boolean isCorrect(String id) {
        Pattern peselPattern = Pattern.compile(0-9,11);
        return peselPattern.matcher(id).matches();
    }
    private static void validate(Pattern pattern, String text){
        System.out.println(text + pattern.matcher(text));
    }
}
