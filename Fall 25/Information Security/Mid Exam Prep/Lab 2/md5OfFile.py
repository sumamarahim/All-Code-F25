# reading a file and then making MD5 of it.

# file reading method 1

# file = open("file.txt", "r")
# print (file.read())
import hashlib
# making it's data secure with MD5 - if data changed then MD5 will be changed
with open("file.txt", "r") as file:
    data = file.read() # line by line data read
    md5_of_data = hashlib.md5(data.encode()).hexdigest()
    print(f"Data: {data}\nMD5: {md5_of_data}")

# to verify the MD5 hash of above file's data
verify = "Nothing here" # same msg in file.txt
md5_verify = hashlib.md5(verify.encode()).hexdigest()
print (md5_verify) # this should same with md5_of_data