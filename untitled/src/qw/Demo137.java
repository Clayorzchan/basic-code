package qw;

public class Demo137 {
    public static void main(String[] args) {
        //获取字符串长度
        int len = "dsdfasdf".length();

        //拼接字符串
        String str1 = "abccccccc";
        String str2 = "d";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //获取指定位置单个字符
        System.out.println(str1.charAt(1));//b

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        System.out.println(str1.indexOf("abcd"));

    }
}
