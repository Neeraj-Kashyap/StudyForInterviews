import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    /*
        Input: exp = “[()]{}{[()()]()}”
        Output: Balanced
        Explanation: all the brackets are well-formed

        Input: exp = “[(])”
        Output: Not Balanced
        Explanation: 1 and 4 brackets are not balanced because
        there is a closing ‘]’ before the closing ‘(‘
    */

    static boolean areBracketsBalanced(String expression){

        Deque<Character> stack = new ArrayDeque<>();

        for (int i=0;i<expression.length();i++){
            char x = expression.charAt(i);

            if(x == '(' || x== '[' || x== '{'){
                stack.push(x);
                continue;
            }

            if(stack.isEmpty())
                return false;
            char check;
            switch (x){
                case ')' : check = stack.pop();
                if(check == '{' || check == '[')
                    return false;
                break;
                case '}': check = stack.pop();
                    if(check == '(' || check == '[')
                        return false;
                break;
                case ']':  check = stack.pop();
                    if(check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());

    }

    public static void main(String[] args) {
        String expr = "[()]{}{[()()]()}";
        if(areBracketsBalanced(expr)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not balanced");
        }
    }

}
