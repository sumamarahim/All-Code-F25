# lib - random
import random
msg = "msg here"
hashVal = hash(msg)
random.seed(hashVal)
randIntGen = random.randint(9999900, 9999999)

print (f"Msg is: {msg}\nRandomInt is: 0x{randIntGen}")
