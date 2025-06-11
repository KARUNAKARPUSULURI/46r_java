# Naming Conventions and Data Structures Notes

## Naming Conventions

Naming conventions are a set of rules or guidelines used to name variables, functions, classes, and other identifiers in programming. Following consistent naming conventions improves code readability, maintainability, and reduces errors.

### Common Naming Conventions

- **Camel Case:** The first letter of the first word is lowercase, and the first letter of each subsequent concatenated word is capitalized.  
  Example: `myVariableName`, `calculateTotal`

- **Pascal Case:** The first letter of every word is capitalized. Often used for class names.  
  Example: `MyClassName`, `EmployeeDetails`

- **Snake Case:** Words are separated by underscores, all lowercase. Common in languages like Python.  
  Example: `my_variable_name`, `calculate_total`

- **Kebab Case:** Words are separated by hyphens. Mostly used in URLs or CSS classes.  
  Example: `my-variable-name`, `main-header`

### Guidelines

- Use meaningful and descriptive names.
- Avoid single character names except for counters or iterators (e.g., i, j).
- Constants are usually written in uppercase with underscores (e.g., `MAX_SIZE`).
- Class names typically use Pascal Case.
- Variable and function names typically use camelCase or snake_case depending on language conventions.
- Avoid using reserved keywords as names.
- Be consistent throughout the codebase.

---

## Stack

A **stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle. The last element added to the stack is the first one to be removed.

### Characteristics

- Operations:
  - **Push:** Add an element to the top of the stack.
  - **Pop:** Remove the top element from the stack.
  - **Peek/Top:** View the top element without removing it.
- Used for:
  - Function call management (call stack).
  - Undo mechanisms in editors.
  - Expression evaluation and syntax parsing.
- Implementation:
  - Can be implemented using arrays or linked lists.
- Example:
  ```
  Stack: [bottom] 1, 2, 3 [top]
  Push(4) -> Stack: 1, 2, 3, 4
  Pop() -> returns 4, Stack: 1, 2, 3
  ```

---

## Queue

A **queue** is a linear data structure that follows the **First In, First Out (FIFO)** principle. The first element added is the first one to be removed.

### Characteristics

- Operations:
  - **Enqueue:** Add an element to the rear of the queue.
  - **Dequeue:** Remove an element from the front of the queue.
  - **Front/Peek:** View the front element without removing it.
- Used for:
  - Scheduling processes in operating systems.
  - Handling requests in web servers.
  - Breadth-first search (BFS) in graphs.
- Types:
  - Simple queue.
  - Circular queue.
  - Priority queue.
- Implementation:
  - Can be implemented using arrays or linked lists.
- Example:
  ```
  Queue: [front] 1, 2, 3 [rear]
  Enqueue(4) -> Queue: 1, 2, 3, 4
  Dequeue() -> returns 1, Queue: 2, 3, 4
  ```

---

## Heap

A **heap** is a specialized tree-based data structure that satisfies the **heap property**:

- In a **max heap**, for any given node, the value is greater than or equal to its children.
- In a **min heap**, for any given node, the value is less than or equal to its children.

### Characteristics

- Used to implement priority queues.
- Supports efficient retrieval of the maximum or minimum element.
- Common operations:
  - **Insert:** Add a new element while maintaining the heap property.
  - **Extract Max/Min:** Remove and return the root element (max or min).
  - **Heapify:** Rearrange elements to maintain the heap property.
- Implementation:
  - Usually implemented as a binary tree using arrays.
- Applications:
  - Priority scheduling.
  - Heap sort algorithm.
  - Graph algorithms like Dijkstra’s shortest path.

---

These notes cover essential concepts and are useful for exam preparation on naming conventions and fundamental data structures like stack, queue, and heap.
