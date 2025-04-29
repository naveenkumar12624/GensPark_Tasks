# Task1:
<img src="https://github.com/naveenkumar12624/GensPark_Tasks/blob/master/src/BirdsOOPS/Diagram.png">

-------------------------------------------------------------------------
# Task 2
## Approach:
This implementation builds a singly linked list with basic operations including insertion,
deletion, traversal, and counting of nodes. Here's how each part works:
 
1. **Insertion at End:** A new node is created and appended at the end of the list.
     If the list is empty, the new node becomes the start node.
 
2. **Traversal:** The displayList method iterates through the list and prints the data
    of each node one by one.
 
3. **Count Nodes:** The getNodeCount method traverses the entire list, incrementing a
     counter for every node it visits.
 
4. **Delete Last Node:** This method finds the second last node in the list and sets
    its next pointer to null, effectively removing the last node.
5. **Delete at Index:** It finds the node just before the given index and re-links it to
     skip over the node at the target index, removing it from the chain.
 
These basic operations demonstrate how linked lists manage dynamic data and memory in a
non-contiguous manner, which makes insertion and deletion efficient at the ends or
at specific positions.

-------------------------------------------------------------------------
# Task 3

 ## 1. Print Descending from Array
* Goal: Print array elements in reverse order.

* Approach: Start from the last index and recursively move backward until index < 0.

## 2. Print Ascending from Array
* Goal: Print array elements in forward order.

* Approach: Use recursion to reach the end of the array, then print elements while returning (post-order traversal).

 ## 3. Print Ascending + Descending Order
* Goal: Print numbers in both orders around recursion.

* Approach: Print n before and after the recursive call, building symmetric output.

## 4. Print Reverse Star Pattern
* Goal: Print decreasing rows of *.

* Approach: Print n stars, then recurse with n - 1.

## 5. Print Forward Star Pattern
* Goal: Print increasing rows of *.

* Approach: Recursively reach n == 1, then print increasing stars while returning.

## 6. Print Number Triangle
* Goal: Print rows from 1 to n, each showing 1 to i.

* Approach: Recurse until n == 0, then for each n, print numbers from 1 to n.

  -------------------------------------------------------------------------

# Task 4
## Approach:
## Stack Using Linked List–LIFO (Last In, First Out) 

1. Use a Node class with data and next to represent elements of the stack.
   
2.Maintain a top pointer, which always points to the most recently added node (top of the stack).

3.Push operation creates a new node,links it to the current top, and updates top to the new node.

4.Pop operation removes the node at top and updates top to the next node.

5.Operations like peek() return top.data and isEmpty() checks if top == null.

## Queue Using Linked List –FIFO(First In, First Out)

1.Use a Node class with data and next to represent elements of the queue.

2.Maintain two pointers: front (to remove elements) and rear (to insert elements).

3.Enqueue operation adds a new node at the rear and updates the rear pointer.

4.Dequeue operation removes the node at the front and updates the front pointer.

5.If front becomes null, set rear =null as the queue is now empty; isEmpty() checks if front == null.
