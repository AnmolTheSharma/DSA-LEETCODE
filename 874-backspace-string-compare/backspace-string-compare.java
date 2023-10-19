class Solution {
    public boolean backspaceCompare(String s, String t){ 
         return buildFinalString(s).equals(buildFinalString(t));
    }

    private static String buildFinalString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
            }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();       
 

    }
}