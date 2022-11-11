package pers.zh.code1;

/**
 *
 * String 和 StringBuilder的性能比较：
 *
 * @author zhanghu
 * @date 2022/11/11 11:41
 */
public class Test {
    public static void main(String[] args) {
        String s = "a";

        long start = System.currentTimeMillis();
        // 每次生成一个新的字符串都会new String() 频繁的申请堆空间带来的开销比较大
        for (int i = 0; i < 100000; i++) {
            s += "1";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);//3031

        StringBuilder sb = new StringBuilder("a");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("1");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);//0



    }
}
