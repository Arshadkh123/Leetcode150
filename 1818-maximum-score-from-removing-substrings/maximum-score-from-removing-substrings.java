class Solution {
    public int maximumGain(String s, int x, int y) {
       int big=x > y?x:y;
       int small=big==x?y:x;
       char fst=big == x?'a':'b';
       char snd=fst== 'a'?'b':'a';
       int score=0;
       Stack<Character> s1=new Stack();
       for(char c : s.toCharArray()){
        if(c==snd && !s1.isEmpty() && s1.peek()==fst){
            s1.pop();
            score+=big;
        } else{
            s1.push(c);
        }
       }
       Stack<Character> s2=new Stack();
       while(!s1.isEmpty()){
        char c=s1.pop();
        if(c==snd && !s2.isEmpty() && s2.peek()==fst){
            s2.pop();
            score+=small;
        } else{
            s2.push(c);
        }
       }
       return score;
    }
}