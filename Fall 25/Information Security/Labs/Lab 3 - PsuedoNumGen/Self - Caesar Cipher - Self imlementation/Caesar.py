# let key = 20
key = "20"
p = "Sumama Rahim"
cipher = ""

i = 0
size = len(p) - 1
while i < size:
    c = (p[i]+key)
    cipher += p
    i+1
print (cipher)