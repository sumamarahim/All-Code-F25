# create a text file and put usernames and passwords in it, read it and then make MD5 of it

import hashlib # hashlib importing, which have MD5 hash




file = open("accounts.txt", "r") # "r" is mode means read

print(file.read()) # reading the whole file

md5_hash = hashlib.md5(file.read().encode()) # md5_hash stores the hash of the readed file

print("MD5 hash: ", md5_hash.hexdigest()) # this prints the MD5 hash of the readed file which stored in md5_hash var

file.close() # closing the file



with open("accounts.txt", "r") as file:
    md5_hash = hashlib.md5(file.read().encode())
    print(md5_hash.hexdigest())


file = open("accounts.txt", "r")

md5_hash = hashlib.md5(file.encode())

for i in file:
    print(file.readline().md5_hash.hexdigest())




