# AH8

Algo Hour 8

# Objective

- Fork and clone this repository. Work on the objective(s). Then push up your changes to YOUR fork.

Write a method, `linkedListFind`, that takes in the head of a linked list and a target value. The method should return a boolean indicating whether or not the linked list contains the target.

# Test Cases

1. 
```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");

a.next = b;
b.next = c;
c.next = d;

// a -> b -> c -> d

Source.linkedListFind(a, "c"); // true
```

2. 

```java
Node<Integer> node1 = new Node<>(42);

// 42

Source.linkedListFind(node1, 100); // false
```

# Extra Credit

## Objective

Write a method, `getNodeValue`, that takes in the head of a linked list and an index. The method should return the value of the linked list at the specified index.

If there is no node at the given index, then return null.

## Test Cases

1. 
```java
Node<String> node1 = new Node<>("banana");
Node<String> node2 = new Node<>("mango");
Node<String> node3 = new Node<>("kiwi");

node1.next = node2;
node2.next = node3;

// banana -> mango -> kiwi

ECSource.getNodeValue(node1, 0); // "banana"
```

2. 
```java
Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");

a.next = b;
b.next = c;
c.next = d;

// a -> b -> c -> d

ECSource.getNodeValue(a, 7); // null
```