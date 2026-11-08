class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String op: tokens) {
            switch(op) {
                case "+" -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 + num1);
                    break;
                } 
                case "-" -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 - num1);
                    break;
                }
                case "*" -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 * num1);
                    break;
                }
                case "/" -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 / num1);
                    break;
                }
                // default is to process numbers
                default -> {
                    int num = Integer.parseInt(op);
                    stack.push(num);
                }
            }
        }

        return stack.pop();
    }
}
