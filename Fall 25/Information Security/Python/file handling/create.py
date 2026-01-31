'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F25 Morning
Date: 10/04/2025
'''


# creating file, it will return error if exist, else will create
#with open("createTestC.txt", "x") as file:
   # file.write("New line added, 22\n") # this ilne add this msg while keep existing text


# creating file, it will create if not exist, if exist it will append it
with open("createTestA.txt", "a") as file:
    file.write("New line added, 22\n") # this ilne add this msg while keep existing text



# creating file, it will create if not exist, if exist it will overwrite it
with open("createTestW.txt", "w") as file:
    file.write("New line added, 22\n") # this ilne add this msg while keep existing text

