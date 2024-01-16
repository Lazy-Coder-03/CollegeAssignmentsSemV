# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)


# 10.Invert a dicƟonary such the previous keys become values and values keys. 
# Eg: if the iniƟal and inverted dicƟonaries are d1 and d2, where d1 = {1: ‘a’, 2: 
# ‘b’, 3: 120}, then d2 = {‘a’: 1, 2: ‘b’, 120: 3}.       [13.12.23]

def main():
    d1 = {1: 'a', 2: 'b', 3: 120}
    print("Original dictionary:",d1)
    d2 = {v:k for k,v in d1.items()}# Dictionary comprehension
    #not using dict comprehension
    d3={}
    for k,v in d1.items():
        d3[v]=k
             
    print("Inverted dictionary using Dict comprehension:",d2)
    print("Inverted dictionary without using Dict comprehension:",d3)
    
if __name__ == "__main__":
    main()
    
    
# Output:
#     Original dictionary: {1: 'a', 2: 'b', 3: 120}
#     Inverted dictionary using Dict comprehension: {'a': 1, 'b': 2, 120: 3}
#     Inverted dictionary without using Dict comprehension: {'a': 1, 'b': 2, 120: 3}