# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# Write two funcƟons that simulate the toss of a fair coin, and the roll of an 
# unbiased ‘n’ sided die using the random module. [06.12.23]

import random

def tossCoin():
    return random.choice(["Heads","Tails"])

def rollDie(n):
    return random.randint(1,n)

def main():
    while True:
        print("1. Toss a coin")
        print("2. Roll a die")
        print("3. Exit")
            
        choice = input("Enter your choice: ")
        if choice == "1":
            print("Tossing a coin...")
            print("Result:",tossCoin())
        elif choice == "2":
            n = int(input("Enter the number of sides of the die: "))
            print(f"Rolling a {n} sided dice...")
            print("Result:",rollDie(n))
        elif choice == "3":
            break
        else:
            print("Invalid choice!")
        print("---------------------------------------------------------------")
    
    
if __name__ == "__main__":
    main()