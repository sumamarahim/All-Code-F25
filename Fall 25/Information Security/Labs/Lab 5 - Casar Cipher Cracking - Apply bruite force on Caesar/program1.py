'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F24 Morning
Date: 10/25/2025
'''


"""
# Task
# suppose we have a cipher but don't know about the key, my job is to crack it (use bruite force)

# encrypted = "Mogugu Lubcg" # encrypted msg
# taking encrypted msg as input.
encrypted = input("Enter your encrpted msg: ")

# decryption algo/module
def decryptDef(cipher, key):
    decrypt = "" # which stores the decrypted msg
    # traversing through encrypted msg
    for char in cipher:
        # checking for alphabets
        if char.isalpha():
            # checking for caps chars
            if char.isupper():
                decrypt += chr((ord(char) - key - 65) % 26 + 65)
            else:
                decrypt += chr((ord(char) - key - 97) % 26 + 97)
        else:
            decrypt += char
    return decrypt

# doing bruite force for the key
for key in range (1, 26):
    if key < 10:
        print(f"Decrypted msg at key-0{key} is: {decryptDef(encrypted, key)}")
    else:
        print(f"Decrypted msg at key-{key} is: {decryptDef(encrypted, key)}")


"""



# Task
# now cracking the ciphers which are included in txt file

# decryption algo/module
def decryptDef(cipherFile, key):
    decrypt = "" # which stores the decrypted msg
    # traversing through encrypted msg
    for char in cipherFile.read():
        # checking for alphabets
        if char.isalpha():
            # checking for caps chars
            if char.isupper():
                decrypt += chr((ord(char) - key - 65) % 26 + 65)
            else:
                decrypt += chr((ord(char) - key - 97) % 26 + 97)
        else:
            decrypt += char
    return decrypt

# doing bruite force for the key
for key in range (1, 26):
    # reading from a file
    file = open("ciphermsg.txt", "r") # this will read file
    if key < 10:
        print(f"Decrypted msg at key-0{key} is: {decryptDef(file, key)}")
    else:
        print(f"Decrypted msg at key-{key} is: {decryptDef(file, key)}")
#
