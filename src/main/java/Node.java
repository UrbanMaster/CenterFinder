public record Node<T>(T value, Node<T> next) {
    public Node {
        if (value == null) {
            throw new IllegalArgumentException("Value should not be empty");
        }
    }
}
