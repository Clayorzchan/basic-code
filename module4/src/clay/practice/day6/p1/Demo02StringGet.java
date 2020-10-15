package clay.practice.day6.p1;

public class Demo02StringGet {
    public static void main(String[] args) {
        int length = "adfegadfews".length();
        System.out.println(length);

        //拼接字符串，原字符永远不会变
        String str1 = "sdfz";
        String str2 = str1.concat("sss");
        str1 = str1.concat("ddd");
        System.out.println(str1);
        System.out.println(str2);

        //获取指定位置的字符
        char ch1 = "sdfz".charAt(0);
        System.out.println(ch1);

        //获取第一次出现参数字符或字符串的int索引号，若没有就是返回-1值
        int index = "sdfz".indexOf('o');
        System.out.println(index);
    }
}
