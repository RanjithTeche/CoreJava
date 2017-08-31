package com.rzit.tricky;

/**
 * Created by Ranjith on 7/28/2017.
 */
public class WordCount {
    public static void main(String[] args) {
        String str =  " abc  def gh  ijk    nop ";
        System.out.println(wordCounter(str));
    }
    static int wordCounter(String s){
        int count =0;
        int i=0;
        char ch[]= new char[s.length()];      //in string especially we have to mention the () after length
        for(i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }
}
