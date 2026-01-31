'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F25 Morning
Date: 10/04/2025
'''


# writing file with keeping all existing text
with open("append.txt", "a") as file:
    file.write("New line added, 22\n") # this ilne add this msg while keep existing text

# opening/reading this file
with open("append.txt", "rt") as file:
    print(file.read())


    
# writing file but overwrites all the existing contents
with open("overwrite.txt", "w") as file:
    file.write("Whoopsss! all data has been overwritten with this line")
# let's check
with open("overwrite.txt", "r") as file:
    print(file.read())
