public class Main{
    public static void main(String[] args){
        Stack myStack = new Stack(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
    }
}