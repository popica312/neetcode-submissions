class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0; // 3
        for (String op: operations) {
            switch(op) {
                case "C" -> {
                    int element = stack.pop();
                    total -= element;
                    break;
                }
                case "+" -> {
                    int top = stack.pop();
                    int bottom = stack.peek();
                    stack.push(top);
                    total += top + bottom;
                    stack.push(top + bottom);
                    break;
                }
                case "D" -> {
                    int element = stack.peek();
                    stack.push(2 * element);
                    total += 2 * element;
                    break;
                }
                default -> {
                    int element = Integer.parseInt(op);
                    stack.push(element);
                    total += element;
                }
            }
        }

        return total;
    }
}