import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StageUtils {

    private static final int firstEnglish = 'a';
    private static final int lastEnglish = 'z';


    public static String Stage1(String input) {
        List<String> list = Matcher(input);
        if (list.size() == 0){
            return input;
        }
        String[] inputArr = {input};
        list.forEach(s -> inputArr[0]=inputArr[0].replace(s,""));
        input = Stage1(inputArr[0]);
        return input;
    }

    public static String Stage2(String input) {
        List<String> list = Matcher(input);
        if (list.size() == 0){
            return input;
        }
        String[] inputArr = {input};
        list.forEach(s -> {
            String replacement = ReplaceLetter(s);
            inputArr[0]=inputArr[0].replace(s,replacement);
        });
        input = Stage2(inputArr[0]);
        return input;
    }


    public static List<String> Matcher(String input){
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("(.)\\1{2,}");
        Matcher matcher =pattern.matcher(input);
        while(matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }

    public static String ReplaceLetter(String en){
        int now = en.toCharArray()[0];
        if(now >= lastEnglish) {
            en="z";	
        }else if(now <= firstEnglish){
            en="";
        } else {
            char uppercase = (char) (now - 1);
            en=String.valueOf(uppercase);
        }
        return en;
    }

}
