'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F24 Morning
Date: 10/25/2025
'''

# LAB 4: Caesar Cipher - Encrypt and Decrypt
"""
def encrypt(text, key):
  result = ""
  for char in text:
    if char.isalpha():
      if char.isupper():
        result += chr((ord(char) + key - 65) % 26 + 65)
      else:
        result += chr((ord(char) + key - 97) % 26 + 97)
    else:
      result += char
  return result

text = input("Enter the text: ")
key = int(input("Enter the key: "))

encrypted_text = encrypt(text, key)
print("Encrypted text:", encrypted_text)
"""
"""
# defining for encryption
def encrypt(text, key):
  result = "" # stores result
  for char in text: # iterating through text
    # checking for chars
    if char.isalpha():
      # checking for upper letters
      if char.isupper():
        result += chr((ord(char) + key - 65) % 26 + 65)
      # if chars are lower
      else:
        result += chr((ord(char) + key - 97) % 26 + 97)
    # if not chars or done all
    else:
      result += char
  return result

text = input("Enter your text to encrypt: ")
# taking key as an input
# key = int(input("Enter any secret key (from 1-26): "))    

# trying to encrypt with all keys from 1 to 26
for i in range(0, 26):
  key = i
  print (f"Key = {i}: {encrypt(text, key)}")
print (encrypt("sumama", 20))
"""


# with open("program1.txt", "r") as file: # reading, opening and closing file
file = open("program1.txt", "r")

def encryptFile(file, key):
    result = ""
  # now reading from txt file and then encrypting it
    for char in file.read(): # reads all text
      if char.isalpha():
        if char.isupper():
          result += chr((ord(char) + key - 65) % 26 + 65)
        else:
          result += chr((ord(char) + key - 97) % 26 + 97)
      else:
        result += char
    return result

print (encryptFile(file, 20))


"""
# now encrypting file text with all 25 keys

def encryptFileAllKeys(file, key):
  result = "" # which stores the result
  # reading/traversing through file
  for char in file.read():
    # checking for char
    if char.isalpha():
      # checking for upper chars
      if char.isupper():
        result += chr((ord(char) + key - 65) % 26 + 65)
      # working on lower chars
      else:
        result += chr((ord(char) + key - 97) % 26 + 97)
    # working on no chars or end
    else:
      result += char
  return result

# now generating key from 1 to 25

for key in range(1, 26):
  # opening file
  file = open("program1.txt", "r")
  print (f"Key-{key}: {encryptFileAllKeys(file, key)}")
"""

"""
# taking input from user and write it in .txt file and encrypt it with key

# creating new encryptit.txt file
def writingFile():
  writeFile = open("encryptit.txt", "w") # writes a file
  text = input("Enter text: ") # takes input and stores in text
  writeFile.write(text) # writes file with text(input taken in above line)



def encryptWriteFile(file, key):
  encrypted = ""
  for char in open("encryptit.txt", "r").read():
    if char.isalpha():
      if char.isupper():
        encrypted += chr((ord(char) + key - 65) % 26 + 65)
      else:
        encrypted += chr((ord(char) + key - 97) % 26 + 97)
    else:
      encrypted += char
  return encrypted

print (encryptWriteFileAllKeys(writingFile(), 20))

"""

# taking input from user and write it in .txt file and encrypt it with all possible keys

# creating new encryptit.txt file
def writingFile():
  writeFile = open("encryptit.txt", "w") # writes a file
  text = input("Enter text: ") # takes input and stores in text
  writeFile.write(text) # writes file with text(input taken in above line)


def encryptWriteFileAllKeys(file, key):
  readingFile = open("encryptit.txt", "r") # reading file
  encrypted = ""
  for char in readingFile.read():
    if char.isalpha():
      if char.isupper():
        encrypted += chr((ord(char) + key - 65) % 26 + 65)
      else:
        encrypted += chr((ord(char) + key - 97) % 26 + 97)
    else:
      encrypted += char
  return encrypted

writingFile() # we need to call it to enter text in file
# generating all 25 keys
for key in range(1, 26):
  readingFile = open("encryptit.txt", "r") # reading file
  print(f"key-{key}: {encryptWriteFileAllKeys(readingFile, key)}")
