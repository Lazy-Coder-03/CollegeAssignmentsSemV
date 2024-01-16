# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# Ask the user for two strings, print a new string where the first string is 
# reversed, and the second string is converted to upper case. Sample strings: 
# “Pets“, “party”, output: “steP PARTY”. Only use string slicing and + 
# operators. [29.09.23]

def main():
    string1 = input("Enter the first string: ")
    string2 = input("Enter the second string: ")
    result_string = string1[::-1] + " " + string2.upper()
    print(result_string)


if __name__ == "__main__":
    main()


# Output:
    
# Enter the first string: Pets
# Enter the second string: party
# steP PARTY
    
# Enter the first string: Hello
# Enter the second string: World
# olleH WORLD
    
