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
