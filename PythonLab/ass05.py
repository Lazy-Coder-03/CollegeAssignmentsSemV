# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# Simulate a stack and a queue using lists. Note that the queue deletion 
# operation won`t run in O(1) time.  [11.10.23]

def main():
    stack = []
    queue = []
    while True:
        print("1. Push to stack")
        print("2. Pop from stack")
        print("3. Push to queue")
        print("4. Pop from queue")
        print("5. Exit")
        choice = int(input("Enter your choice: "))
        if choice == 1:
            element = input("Enter the element: ")
            stack.append(element)
        elif choice == 2:
            if len(stack) == 0:
                print("Stack is empty!")
            else:
                print("Popped element:", stack.pop())
        elif choice == 3:
            element = input("Enter the element: ")
            queue.append(element)
        elif choice == 4:
            if len(queue) == 0:
                print("Queue is empty!")
            else:
                print("Popped element:", queue.pop(0))
        elif choice == 5:
            break
        else:
            print("Invalid choice!")
        print("Current stack:", stack)
        print("Current queue:", queue)
    print("Final stack:", stack)
    print("Final queue:", queue)


if __name__ == "__main__":
    main()
