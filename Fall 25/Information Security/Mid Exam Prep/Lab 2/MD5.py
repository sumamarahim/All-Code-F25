# we need a library called hashlib

import hashlib

msg = "This is message again!"

md5_msg = hashlib.md5(msg.encode()) # string must be encoded before hashing
final_md5 = md5_msg.hexdigest()

print (final_md5)
print (len(final_md5))