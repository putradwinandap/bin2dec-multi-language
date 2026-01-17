import sys

binary = input("Enter binary number: ")

binaryLength = int(len(binary))

if binaryLength == 0 or binaryLength > 8:
    print("Input must be 1-8 digits")
    sys.exit()

decimal = 0
exponent = binaryLength - 1

for char in binary:
    if char != '0' and char != '1':
        print("Input can only be 0 and 1")
        sys.exit()
    
    digit = int(char)
    decimal += digit * (2 ** exponent)
    exponent -= 1

print(f"Decimal result: {decimal}")