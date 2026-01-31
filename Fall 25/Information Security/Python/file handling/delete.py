'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F25 Morning
Date: 10/04/2025
'''

# to delete we need OS module to import
import os

'''
# deleting file
os.remove("writecreate.py") # this will delete the writecreate.py file in this dir

'''

# check if file is exists

file = "writecreate.py"

if os.path.exists(file):
    os.remove(file)
else:
    print("File not found in this dir")


# deleting dir (deletes only empty dir)
if os.path.exists("myFolder"):
    os.rmdir("myFolder")
else:
    print("No dir found, to delete")
