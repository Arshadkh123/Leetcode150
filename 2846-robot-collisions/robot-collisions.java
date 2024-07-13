class Solution {

    public List<Integer> survivedRobotsHealths(int[] positions,int[] healths,String directions) {
        int n = positions.length;
        Integer[] actual_index = new Integer[n];
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            actual_index[i] = i;
        }

        Arrays.sort(actual_index,(lhs, rhs) -> Integer.compare(positions[lhs], positions[rhs]));

        for (int currentIndex : actual_index) {
            // Add right-moving robots to the stack
            if (directions.charAt(currentIndex) == 'R') {
                stk.push(currentIndex);
            } else {
                while (!stk.isEmpty() && healths[currentIndex] > 0) {
                    // Pop the top robot from the stack for collision check
                    int topIndex = stk.pop();

                    // Top robot survives, current robot is destroyed
                    if (healths[topIndex] > healths[currentIndex]) {
                        healths[topIndex] -= 1;
                        healths[currentIndex] = 0;
                        stk.push(topIndex);
                    } else if (healths[topIndex] < healths[currentIndex]) {
                        // Current robot survives, top robot is destroyed
                        healths[currentIndex] -= 1;
                        healths[topIndex] = 0;
                    } else {
                        // Both robots are destroyed
                        healths[currentIndex] = 0;
                        healths[topIndex] = 0;
                    }
                }
            }
        }

        // Collect surviving robots
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                result.add(healths[i]);
            }
        }
        return result;
    }
}