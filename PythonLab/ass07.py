# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# Use list comprehension to find all the odd numbers and numbers divisible by 
# 3 from a list of numbers.[22.11.23] 


def main():
    numbers = [x for x in range(1, 20)]# List comprehension
    print("Original list:",numbers)
    # Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
    odd_numbers = [x for x in numbers if x % 2 != 0]# List comprehension with condition
    print("Odd Numbers:",odd_numbers)
    # Output: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
    divisible_by_3 = [x for x in numbers if x % 3 == 0]# List comprehension with condition
    print("Numbers that are divisible by 3:",divisible_by_3)
    # Output: [3, 6, 9, 12, 15, 18]

    
if __name__ == "__main__":
    main()


# Output:
#     Original list: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
#     Odd Numbers: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
#     Numbers that are divisible by 3: [3, 6, 9, 12, 15, 18]
    
    