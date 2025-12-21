/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class WordSet {
    private Set<String> words;

    public WordSet(String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(file));
        words = new TreeSet<>();
        while(sc.hasNext()){
            words.add(sc.next().toLowerCase());
        }
        sc.close();
    }
    
    public String union(WordSet other){
        Set<String> res = new TreeSet<>(this.words);
        res.addAll(other.words);
        
        StringBuilder sb = new StringBuilder();
        for(String x : res){
            sb.append(x).append(" ");
        }
        return sb.toString().trim();
    }
    
    public String intersection(WordSet other){
        Set<String> res = new TreeSet<>(this.words);
        res.retainAll(other.words);
        
        StringBuilder sb = new StringBuilder();
        for(String x : res){
            sb.append(x).append(" ");
        }
        return sb.toString().trim();
    }
}

public class J07014_HopVaGiaoCuaHaiFileVanBan {

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
