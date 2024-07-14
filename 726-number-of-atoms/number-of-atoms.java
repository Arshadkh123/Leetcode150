class Solution {
    public String countOfAtoms(String formula) {
        int n= formula.length();
        Stack<Map<String, Integer>> stk= new Stack<>();
        stk.push(new HashMap<>());
        for(int i=0;i<n;){
            if(formula.charAt(i)=='('){
                stk.push(new HashMap<>());
                i++;
            }else if(formula.charAt(i)==')'){
                Map<String, Integer> top= stk.pop();
                i++;

                int start=i;
                while(i<n && Character.isDigit(formula.charAt(i))) i++;
                int multiplier=start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                for(String key: top.keySet()){
                    stk.peek().put(key, stk.peek().getOrDefault(key,0) + top.get(key)* multiplier);
                }
            } else {
                int start = i;
                i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String element = formula.substring(start, i);
                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                stk.peek().put(element, stk.peek().getOrDefault(element, 0) + count);
            }
        }
        
        Map<String, Integer> result = stk.pop();
        List<String> elements = new ArrayList<>(result.keySet());
        Collections.sort(elements);
        StringBuilder sb = new StringBuilder();
        for (String element : elements) {
            sb.append(element);
            int count = result.get(element);
            if (count > 1) sb.append(count);
        }
        
    
    return sb.toString();
 }
}