'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F24 Morning
Date: 10/25/2025
'''

# LAB 4: Caesar Cipher - Encrypt and Decrypt


def encryptDef(text, key):
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

print(encryptDef("Sumama", 20))

def decryptDef(cipher, key):
    decrypt = ""
    for char in cipher:
        if char.isalpha():
            if char.isupper():
                decrypt += chr((ord(char) - key - 65) % 26 + 65)
            else:
                decrypt += chr((ord(char) - key - 97) % 26 + 97)
        else:
            decrypt += char
    return decrypt

encrypted = encryptDef("Sumama Rahim", 20)

print (decryptDef(encrypted, 20))
print (decryptDef("mogugu", 20))
print (decryptDef("Lubcg", 20))
