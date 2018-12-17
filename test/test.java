package test;

import java.util.HashSet;
import java.util.Set;

public class test {
    public void hashMapTest(){
        long star = System.currentTimeMillis();


        Set<Integer> hashset = new HashSet<>(100) ;
        for (int i = 0; i < 100; i++) {
            hashset.add(i) ;
        }
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star));
    }

    public static void main(String[] args) {
        System.out.println('B' - 'A' + 1);
        System.out.println(999 & 1 | 3);
    }
}
