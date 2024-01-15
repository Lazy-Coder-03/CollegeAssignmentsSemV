# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# Ask the user to enter two numbers, and output the sum, product, difference, 
# and the GCD.  [22.09.23]



def main():
    num1 = int(input("Enter the first number: "))
    num2 = int(input("Enter the second number: "))
    print(f"The sum of the numbers is: {num1+num2}")
    print(f"The product of the numbers is: {num1*num2}")
    print(f"The difference of the numbers is: {num1-num2}")
    print(f"The GCD of the numbers is: {gcd(num1,num2)}")

def gcd(num1,num2):
    #non-recursive
    while num1 != 0:
        num1,num2 = num2%num1,num1
    return num2


if __name__ == "__main__":
    main()