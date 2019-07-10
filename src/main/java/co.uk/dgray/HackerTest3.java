package co.uk.dgray;

import java.util.ArrayList;
import java.util.List;

class HackerTest3 {

    static int makingAnagrams(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        List<Character> set1 = new ArrayList<>();
        for(char c: chars1){
            set1.add(c);
        }
        List<Character> set2 = new ArrayList<>();
        for(char c: chars2){
            set2.add(c);
        }
        set1.retainAll(set2);

        return (s1.length()-set1.size())+(s2.length()-set1.size());
    }

}
