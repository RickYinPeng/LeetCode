package yp.华为;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Huawei01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        Map<String, String> stringMap = new HashMap();
        String lastLine = null;
        for (int i = 0; i < lines; i++) {
            String line = sc.next();
            String[] split = line.split("=");
            stringMap.put(split[0], split[1]);
            if (i == lines-1){
                lastLine = line;
            }
        }
        //获取lastLine的key和value
        String[] split = lastLine.split("=");
        String lastKey = split[0];
        String lastValue = split[1];

        //解析lastValue中的{}
        while (lastValue.contains("{")){
            lastValue = solution(lastValue, stringMap);
        }
        System.out.println(lastValue);
    }

    //只解析一层
    public static String solution(String str, Map<String, String> map) {
        String regex = "\\$\\{([^}]*)\\}";
        //String regex = "\\$\\{.*\\}";
        Pattern compiler = Pattern.compile(regex);
        Matcher matcher = compiler.matcher(str);
        //System.out.println(str);
        while (matcher.find()) {
            String group = matcher.group();
            //获取中括号内的内容
            String data = group.substring(2, group.length() - 1);
            //System.out.println("data:"+data);
            //从map中获取
            String s = map.get(data);
            str = str.replace(group, s);
        }
        //System.out.println(str);
        return str;
    }

}
