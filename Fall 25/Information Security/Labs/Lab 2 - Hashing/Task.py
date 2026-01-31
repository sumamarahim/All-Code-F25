'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F25 Morning
Date: 10/04/2025
'''

# create a text file and put usernames and passwords in it, read it and then make MD5 of it

import hashlib # hashlib module importing, which contins MD5 etc. hash algos

file = open("accounts.txt", "r") # "r" is mode means read

print(file.read()) # reading the whole file

# changing in the file can also change the MD5 hash
with open("accounts.txt", "r") as file:
    data = file.read()
    md5_hash = hashlib.md5(data.encode()) # first it read the whole file and then it will encode it into md5 hash
    print("MD5 hash of file is: ", md5_hash.hexdigest()) # this will print the hexa digest of the readed file

# NOTE: The hash will generate differently if the data in file has changed