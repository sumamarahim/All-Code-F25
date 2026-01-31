# Caeser Cipher encrypt and decrypt

"""
for this cipher we need msg and key to 
encrypt and decrypt.
"""
import random

# # encrypting with pseudo key generator
# def keyGen():
#     key = random.randint(0, 25)
#     return key
# print (keyGen())
# key = keyGen()
msg = "Sumama Rahim"

# # formula: = (K + msg[i]) % 26
key = 20
def encryptDef(msg, key):
    encrypt = ""
    for char in msg:
        # checking for alphabets
        if char.isalpha():
            if char.isupper():
                encrypt += chr((ord(char) + key  - 65) % 26 + 65)
            else:
                encrypt += chr((ord(char) + key - 97) % 26 + 97)
        else:
            encrypt += char
    return encrypt
encrypted = encryptDef(msg, key)
print (f"Encrypt with {key} key is: {encrypted}")

# now decrypting it
def decryptDef(encrypted, key):
    result = ""
    for char in encrypted:
        if char.isalpha():
            if char.isupper():
                result += chr((ord(char) - key - 65) % 26 + 65)
            else:
                result += chr((ord(char) - key - 97) % 26 + 97)
        else:
            result += char
    return result
print ("decrypted: ", decryptDef(encrypted, key))

# now encrypting with 0 to 25 
def encryptAllKeys(encrypted, newKey):
    result = ""
    for char in encrypted:
        if char.isalpha():
            if char.isupper():
                result += chr((ord(char) - newKey - 65) % 26 + 65)
            else:
                result += chr((ord(char) - newKey - 97) % 26 + 97)
        else:
            result += char
    return result

for newKey in range (0, 25):
    print (f"Key: {newKey}, msg: {decryptDef(encrypted, newKey)} ")


