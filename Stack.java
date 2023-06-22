public class Stack<T> {
    private Node<T> top; // Верхний элемент стека

    private static class Node<T> {
        private T data; // Данные узла
        private Node<T> next; // Ссылка на следующий узел

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
