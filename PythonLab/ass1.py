
# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)


# Exploring the complex data type and their operaƟons, eg: finding the modulus 
# and phase angle of a complex number and print values. [20.09.23]

import cmath

def main():
    print("Enter the real and imaginary parts of a complex number: ")
    real = float(input("Real part: "))
    imag = float(input("Imaginary part: "))
    complex_num = complex(real, imag)
    print(f"The modulus of the complex number is: {abs(complex_num):.4f} units")
    print(f"The phase angle of the complex number is: {cmath.phase(complex_num):.4f}  rad")


if __name__ == "__main__":
    main()


#without cmath module
# def main():
#     print("Enter the real and imaginary parts of a complex number: ")
#     real = float(input("Real part: "))
#     imag = float(input("Imaginary part: "))
#     complex_num = complex(real, imag)
#     print(f"The modulus of the complex number is: {abs(complex_num):.4f} units")
#     phase = math.atan(imag/real)
#     print(f"The phase angle of the complex number is: {phase:.4f}  rad")
    


# Output:
# Enter the real and imaginary parts of a complex number:
# Real part: 3
# Imaginary part: 4
# The modulus of the complex number is: 5.0000 units
# The phase angle of the complex number is: 0.9273  rad