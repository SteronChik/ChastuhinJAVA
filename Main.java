public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // Вывод: 30
        System.out.println(stack.peek()); // Вывод: 20
        System.out.println(stack.isEmpty()); // Вывод: false
    }
}