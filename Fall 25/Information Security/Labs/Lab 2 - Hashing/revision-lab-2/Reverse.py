# reverse cipher

msg = "Hello world! this is Sumama."

# to make it in reverse order
# bruite force approach
"""
string reacts as arrays, so we need to work here like arrays
"""

# algo 1
size = len(msg)
reverse = ""
i = size - 1
while i >= 0:
    reverse = reverse + msg[i]
    i -= 1

print("Original msg: ", msg)
print("Reverse msg: ", reverse)

# converting to original text
# algo 1
i = size - 1
originalMsg = ""
while i >= 0:
    originalMsg += reverse[i]
    i -= 1
print("again original msg: ", originalMsg)




# algo 2
cipher = ""
cipher = msg[::-1]
print("Algo 2 - cipher: ", cipher)


# algo 2
decipher = ""
decipher = reverse[::-1]
print("Algo 2 - decipher:", decipher)
