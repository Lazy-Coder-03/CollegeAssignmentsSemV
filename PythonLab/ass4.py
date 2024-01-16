# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# From a list of words, join all the words in the odd and even indices to form 
# two strings. Use list slicing and join methods. .[04.10.23]

def main():
    words = input("Enter the words: ").split()
    even_words = words[::2]
    odd_words = words[1::2]
    even_string = " ".join(even_words)
    odd_string = " ".join(odd_words)
    print("Even string:", even_string)
    print("Odd string:", odd_string)



if __name__ == "__main__":
    main()


# Output:
    # Enter the words: Hello World
    # Even string: Hello
    # Odd string: World

    # Enter the words: Python is a programming language
    # Even string: Python a language
    # Odd string: is programming
