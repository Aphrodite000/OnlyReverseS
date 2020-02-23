import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String reverseOnlyLetters(String S) {
        Queue<Integer> queue=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        //charAt方法只能用来返回字符，不能被赋值
        char[] ch=new char[S.length()];
        for(int i=0;i<S.length();i++){
            ch[i]=S.charAt(i);
        }
        for(int i=0;i<S.length();i++){
            if((S.charAt(i)<='Z'&&S.charAt(i)>='A')||(S.charAt(i)>='a'&&S.charAt(i)<='z')){
                sb.append(S.charAt(i));
                queue.add(i);
            }
        }
        sb.reverse();
        int j=0;
        while (j<sb.length()){
            ch[queue.poll()]=sb.charAt(j);
            j++;
        }
        String result=String.valueOf(ch);
        return result;
    }
}
