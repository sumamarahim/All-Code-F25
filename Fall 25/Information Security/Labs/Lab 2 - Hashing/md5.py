'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F25 Morning
Date: 10/03/2025
'''

# hash functions - MD5

# importing hashlib
import hashlib

msg = "here is message"
md5_hash = hashlib.md5(msg.encode())

print ("Original msg: ", msg) # to show original message
print ("MD5: ", md5_hash.hexdigest()) # this will show the hex digest of msg

