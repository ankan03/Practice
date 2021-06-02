package HRC.trial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trial {
        public static void main(String args[])
        {
            String s = "I am Ankan Mukherjee";

//            System.out.println(s.matches("\\w.*"));
//            String splitString[] = s.split("\\s+");
//            System.out.println(splitString.length);
//
//            for (String s1 : splitString) {
//                System.out.println(s1);
//            }
//
//            System.out.println("-------------------");
//            System.out.println(s.replaceAll("\\s","\t"));

            Pattern pattern  = Pattern.compile("\\w+");
//            Pattern pattern  = Pattern.compile("\\s*+",Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()){
                System.out.println(matcher.start());
                System.out.println(matcher.end());
                System.out.println(matcher.group());
                System.out.println("--------------------");
            }

            System.out.println("--------------------");
            Pattern replace = Pattern.compile("\\s+");
            Matcher matcher1 = replace.matcher(s);
            System.out.println(matcher1.replaceAll("\t"));

        }
}