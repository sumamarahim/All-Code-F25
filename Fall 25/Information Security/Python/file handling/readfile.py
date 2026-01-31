'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F25 Morning
Date: 10/04/2025
'''

# create a text file and put usernames and passwords in it, read it and then make MD5 of it

file = open("accounts.txt", "r") # "r" is mode mean means read

print(file.read())

file.close()

# opening by with statement
# with statement take cares of closing the file, without the with statement file must be closed when you done with it

with open("accounts.txt", "r") as file:
    print(file.read())



# by default read() returns the whole text, if you want to return specified chars
with open("accounts.txt", "r") as file:
    print(file.read(5)) # read(5) returns only first 5 chars



with open("accounts.txt", "r") as file:
    print(file.readline()) # reads only 1 line

# to read first 2 lines, just repeat required times the print statement
with open("accounts.txt", "r") as file:
    print(file.readline())
    print(file.readline())

# also we can use loop through it
with open("accounts.txt", "r") as file:
    for i in file:
        print(i)

