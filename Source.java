class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
        boolean result = false; // initiate the result to false

        while ( head != null ) {    // while we haven't reached the end of the linked-list:
            if ( head.val.equals(target) ) {    // if the current node's value EQUALS the target
                result = true;  // set result to true because we found the target value in the linked-list
                break;  // break out of the while loop, there's no need to continue as we already found our value
            }
            head = head.next;   // move 'head' to the next node of the linked-list
        }

        // if we iterated through the entire linked-list and never found the target value
        // we never would've changed our 'result' variable to true and thus 'result' would
        // still be false from when we initialized it

        return result;  // return our answer
    }

    public static <T> boolean recursiveLinkedListFind(Node<T> head, T target) {
        if ( head == null ) return false;
        if ( head.val.equals(target)) return true;
        return recursiveLinkedListFind(head.next, target);
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        // a -> b -> c -> d
        System.out.println("Iterative test: " + Source.linkedListFind(a, "c"));
        System.out.println("recursive test: " + Source.recursiveLinkedListFind(a, "c"));

        System.out.println("\nTest 2");
        Node<Integer> node1 = new Node<>(42);
        // 42
        System.out.println("Iterative test: " + Source.linkedListFind(node1, 100)); // false
        System.out.println("recursive test: " + Source.recursiveLinkedListFind(node1, 100));

    }
}