# lab 2: Hashing nd Reverse Cipher

# reverse
msg = "this is lab 2 hashing - msg"

def rev():
    msg2 = ""
    i = len(msg) - 1
    while i >= 0:
        msg2 += msg[i]
        i-=1
    return msg2

print(rev())
import hashlib
# MD5 hashing
def md5(msg):
    hash = hashlib.md5(msg.encode())
    print ("hash msg: ", hash.hexdigest())
    # hexdigest will convert the msg to hexa
    # encoding is must be done before hashing

md5("This should be hashed!")


# Lab 3 - Pseudo num generator

import random

def numGen():

    rand = random.randint(0, 9)
    return rand

print("Random number: ", numGen())



"""
            Revision
"""

"""

import hashlib

def md(msg):
    print("MD5: ", hashlib.md5(msg.encode()).hexdigest())

md("This is msg")


def rn(msg):
    # rn = random.seed(hash(msg)) # seed will link the msg and random generated number
    rnm = random.randint(10, 20)
    return rnm
print(rn("this is msg"))

"""
""" Revision END """

# Lab 4 - Caesar Cipher - Encrypt and Decrypt
# C = (P + k) mod 26
# P = (C - k) mod 26

def caesarEncrypt(plain, key):
    encrypted = ""
    for P in plain:
        if P.isalpha():
            if P.isupper():
                encrypted += chr(((ord(P) + key) - 65) % 26 + 65)
            else:
                encrypted += chr(((ord(P) + key) - 97) % 26 + 65)
        else:
            encrypted += p
    return encrypted


plain = "Sumama" 
key = 20
enc = caesarEncrypt(plain, key)
print(enc)

def caesarDecrypt(enc, key):
    decrypted = ""
    for C in enc:
        if C.isalpha():
            if C.isupper():
                decrypted += chr(((ord(C) - key) - 65) % 26 + 65)
            else:
                decrypted += chr(((ord(C) - key) - 97) % 26 + 97)
        else:
            decrypted += C
    return decrypted

dec = caesarDecrypt(enc, key)
print(caesarDecrypt(enc, key))



# Lab 5 - Applying Brute force to Caesar Encryption

def bruteForceCaesarEncryption():
    # we will take the above caesarEncrypt()
    for key in range(0, 26):
        print(f"for key = {key} we get, {caesarDecrypt(enc, key)}")

bruteForceCaesarEncryption()



# # Lab 6 - XOR

# def xor(text, key):
#   result = ""
#   for char, charKey in zip(text, key):
#     result += chr(ord(char) ^ ord(charKey))
#   return result

# keyXor = "keykeykey"
# cipherText = xor("Some msg something more interesting here", keyXor)
# print (cipherText)

"""
def xor_cipher(text, key):
    result = []
    for i, char in enumerate(text):
        key_char = key[i % len(key)]
        result.append(chr(ord(char) ^ ord(key_char)))
    return "".join(result)

key = "key"
cipher_text = xor_cipher("Some msg something more interesting here", key)
print(cipher_text)


# NOTE: CHECK THIS CODE
"""



# Mid Lab Exam - Vegenere Cipher
# Text 27 chars and key should be 9 chars which are randomly generated

import random, string

def encryptVigenere(text, key):
    result = ""
    key = key.lower() # to handle upper and lower case letters at once
    i = 0
    for char in text:
        shift = ord(key[i % len(key)])- 97
        if char.isalpha():
            if char.isupper():
                result += chr(((ord(char) + shift) - 65) % 26 + 65)
            else:
                result += chr(((ord(char) + shift) - 97) % 26 + 97)
            i+=1
        else:
            result += char
        
    return result

def decryptVigenere(text, key):
    dec = ""
    key = key.lower() # to handle all case letters at once
    i = 0
    for char in text:
        if char.isalpha():
            shift = ord(key[i % len(key)]) - 97
            if char.isupper():
                dec += chr((ord(char) - 65 - shift) % 26 + 65)
            else: 
                dec += chr((ord(char) - 97 - shift) % 26 + 97)
            i += 1
        else:
            dec += char
    return dec


plaintext1 = "Diagram"
key1 = "MinahiL"
plaintext2 = "We are discovered safe yourself"
key2 = "Deception"


length = 9
def randomKeyGen(length): # generates alphabets not numricals
    return "".join(random.choice(string.ascii_uppercase) for _ in range(length))

print(randomKeyGen(length))

randKey = randomKeyGen(length)

encVig1 = encryptVigenere(plaintext1, key1)
decVig1 = decryptVigenere(encVig1, "Minahil")
print (f"encrypted1: {encVig1}")
print (f"decrypted1: {decVig1}")


encVig2 = encryptVigenere(plaintext2, randKey)
decVig2 = decryptVigenere(encVig2, randKey)
print (f"encrypted2: {encVig2}")
print (f"decrypted2: {decVig2}")



# Mid Lab - Q1: implement OTP with key is equal length of txt



# Affine Cipher
# Cipher = (a*P + b) mod 26
# PlainText = a^-1 (C - b) mod 26
import math

def affine(a, text, b):
    def encrypt():
        result = ""
        if math.gcd(a, 26) == 1: # Checks for coprime of a and 26
            for p in text.lower():
                if p.isalpha():
                    result += chr((((ord(p)- 97)*a + b) % 26 ) + 97)
                else:
                    result += p
        return result
    
    # finding a^-1
    def modInverse(a, m=26):
        a %= m
        for x in range(1, m):
            if (x*a) % m == 1:
                return x
                
    enc = encrypt()
    def decrypt():
        # p = a^-1(c-b)%26
        aInverse = modInverse(a, 26)
        result = ""
        if math.gcd(a, 26) == 1:
            for c in enc.lower():
                if c.isalpha():
                    result += chr(((((ord(c) - 97) - b)*aInverse) % 26)+ 97)
                else:
                    result += c
        return result
    return encrypt(), decrypt()

msg = input("Enter msg: ")
for i in range(0, 26):
    print(f"{i}: {affine(i, msg, 8)}")





