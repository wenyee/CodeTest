import java.util.Scanner;

/**
 * @author wenad
 * @date 2022-03-30 14:20:49
 * @description:o
 */
public class CodeTestMain {

    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(tip);
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (ipt!=null && ipt.length()>0) {
                return ipt;
            }
        }
        return "";
    }

    public static void main(String[] args) {

        String example = scanner("请输入测试字符串");
        String result = StageUtils.Stage1(example);
        String result2 = StageUtils.Stage2(example);

        System.out.println(result);
        System.out.println(result2);
    }



}
