
# reseversing
msg = "message here"
reverse = ""
i = len(msg) - 1
while i >= 0:
    reverse += msg[i]
    i -= 1
print (reverse)

# now making back to real msg

realMsg = ""
j = len(reverse)-1
while j >= 0:
    realMsg += reverse[j]
    j -= 1

print (realMsg)

# algo 2

reverse2 =  msg[::-1]
print (reverse2)

realMsg2 = reverse2[::-1]
print (realMsg2)