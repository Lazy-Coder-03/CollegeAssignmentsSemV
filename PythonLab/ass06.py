# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# Explore the ‘re’ module, especially re.split, re.join, re.search and re.match 
# methods. . [13.10.23]

import re

def main():
    text = "Hello, World! How are you?"
    result = re.split(r'[^\w]+', text)  # Split based on non-word characters
    print(result)
    # Output: ['Hello', 'World', 'How', 'are', 'you']
    words = ['Hello', 'World', 'How', 'are', 'you']
    result = ' '.join(words)
    print(result)
    # Output: Hello World How are you
    text = "The quick brown fox jumps over the lazy dog"
    pattern = r'fox'
    searchres = re.search(pattern, text)

    if searchres:
        print("Pattern found:", searchres.group())
    else:
        print("Pattern not found")
    # Output: Pattern found: fox
        
    text = "The quick brown fox jumps over the lazy dog"
    pattern = r'fox'
    matchres = re.match(pattern, text)

    if matchres:
        print("Pattern found:", matchres.group())
    else:
        print("Pattern not found")
    
if __name__ == "__main__":
    main()
    
# Output:
#     ['Hello', 'World', 'How', 'are', 'you']
#     Hello World How are you
#     Pattern found: fox
#     Pattern not found

#Output:
#     ['my', 'name', 'is', 'sayantan', 'ghosh']
#     my name is sayantan ghosh
#     Pattern found: fox
#     Pattern not found