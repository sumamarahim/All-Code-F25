'''
Name: Sumama Rahim
Reg# F24BSCS039
BS CS - F25 Morning
Date: 10/03/2025
'''

# reverse cipher algorithm

msg = "this is msg"

trs = ""
i = len(msg) - 1
while i >= 0:
	trs +=  msg[i]
	i -= 1
print (trs)


# now converting it to original text

new = trs
di = ""
i = len(new) -1
while i >= 0:
	di += new[i]
	i -= 1
print (di)


# algo 2
dicipher = ""
dicipher = trs[:: -1]

print (dicipher)
