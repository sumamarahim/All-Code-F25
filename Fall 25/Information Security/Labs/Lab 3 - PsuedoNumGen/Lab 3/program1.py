'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F25 Morning
Date: 10/24/2025
'''

'''
# LAB 3: Psuedo number generator for text

# importing some required libs
# import string # check this if not neccessary then remove it
import random

def pseudo_num(text): # this def takes text as a parameter
    # this will link the text with random generated number in bit level
    random.seed(hash(text))
    # this will generate random int values
    rand_num = random.randint(0, 9999)
    return rand_num # this def will return 

text = input("Enter your text ") # taking input from user
print(f"rand num is: {pseudo_num(text)}")

'''

import random

# file reading
file = open("program1.txt", "r") # this is read (r mode) program.txt 

# creating def for generating pseudo random number for this file
def pseudo_number_generator(file):
    random.seed(hash(file)) # to make connection with random number
    rand_num = random.randint(90, 99)
    return rand_num
file.close() # this will close the file connection, which is good practice

print(f"random number is: {pseudo_number_generator(file)}")
