class ECSource {
    public static <T> T getNodeValue(Node<T> head, int index) {
        // todo - note the return type, but don't overthink it
        int count = 0;
        while ( count < index && head != null ) {
            head = head.next;
            count++;
        }
        if ( head == null ) return null;
        return head.val;
    }

    public static <T> T recursiveGetNodeValue(Node<T> head, int index) {
        if ( index == 0 && head != null ) {
            return head.val;
        } else {
            if ( head == null ) {
                return null;
            } else {
                return recursiveGetNodeValue(head.next, index - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        Node<String> node1 = new Node<>("banana");
        Node<String> node2 = new Node<>("mango");
        Node<String> node3 = new Node<>("kiwi");
        node1.next = node2;
        node2.next = node3;
        // banana -> mango -> kiwi
        System.out.println("Iterative test: " + ECSource.getNodeValue(node1, 0));
        System.out.println("Iterative test: " + ECSource.getNodeValue(node1, 0));
        System.out.println("Iterative test: " + ECSource.getNodeValue(node1, 2));
        System.out.println("Recursive test: " + ECSource.recursiveGetNodeValue(node1, 0));
        System.out.println("Recursive test: " + ECSource.recursiveGetNodeValue(node1, 0));
        System.out.println("Recursive test: " + ECSource.recursiveGetNodeValue(node1, 2));


        System.out.println("\nTest 2");
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        // a -> b -> c -> d
        System.out.println("Iterative test: " + ECSource.getNodeValue(a, 7)); // null
        System.out.println("Recursive test: " + ECSource.recursiveGetNodeValue(a, 7)); // null
    }
}