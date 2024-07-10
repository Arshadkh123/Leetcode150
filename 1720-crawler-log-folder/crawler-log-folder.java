class Solution {
    public int minOperations(String[] logs) {
        int c = 0;
        for (int i = 0; i < logs.length; i++) {
            String log = logs[i];
            if (log.equals("../")) {
                if (c > 0) {
                    c--;
                }
            } else if (!log.equals("./")) {
               c++;
            }
        }
        return c;
    }
}
