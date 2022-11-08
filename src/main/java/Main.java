public class Main {
    public static void main(String[] args) {
        var list = new Node<>(1,
                new Node<>(2,
                        new Node<>(3,
                                new Node<>(4,
                                        new Node<>(5,
                                                new Node<>(6,
                                                        new Node<>(7,
                                                                new Node<>(8,
                                                                        new Node<>(9, null)))))))));

        var res = findMiddleElement(list);
        System.out.println(res);
        assert res == 5;

        var list2 = new Node<>(1,
                new Node<>(2,
                        new Node<>(3,
                                new Node<>(4,
                                        new Node<>(5,
                                                new Node<>(6,
                                                        new Node<>(7,
                                                                new Node<>(8, null))))))));
        var res2 = findMiddleElement(list2);
        System.out.println(res2);

    }

    //works for lists with odd amount of nodes. Requirement for even amounts was not defined.
    public static <T> T findMiddleElement(Node<T> head) {
        var position = 1;
        Node<T> current = head;
        Node<T> middle = head;

        while (current != null) {
            if (position % 2 != 0 && position > 1) {
                middle = middle.next();
            }
            current = current.next();
            position++;
        }
        //noinspection ConstantConditions
        return middle.value();
    }
}
