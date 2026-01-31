'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F24 Morning
Date: 10/25/2025
'''


# encrypt and decrypt using a key (which will be randomly generated)

# random key generating
import random

# encrypting with random key

def encryptDef(text):
    def randKeyGen(text):
        # generating random key
        random.seed(hash(text))
        key = random.randint(1, 25)
        return key
    key = randKeyGen(text)
    encrypt = ""
    for char in text:
        if char.isalpha():
            if char.isupper():
                encrypt += chr((ord(char) + key - 65) % 26 + 65)
            else:
                encrypt += chr((ord(char) + key - 97) % 26 + 97)
        else:
            encrypt += char
    return encrypt

print (f"Encrypted msg is: {encryptDef("Sumama")}")




    