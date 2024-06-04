public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        // System.out.println(myStack.size);
        myStack.push(45);
        myStack.push(12);
        myStack.push(5);
        myStack.push(35);
        myStack.push(15);
        myStack.pop();
        // System.out.println(myStack.size);
        myStack.printItems();
    }
}
