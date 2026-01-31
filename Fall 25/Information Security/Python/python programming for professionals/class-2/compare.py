x = int(input("What's x?"))
y = int(input("What's y?"))

# # it works but not a good practice
# if x < y:
#     print("X is less than y")
# if x > y:
#     print("X is greater than Y")
# if x == y:
#     print("X is equal to Y")


# # best way - logically right
# if x < y:
#     print("X is less than y")
# elif x > y:
#     print("X is greater than Y")
# elif x == y:
#     print("X is equal to Y")



# # best way - logically this is the right and improved version
# if x < y:
#     print("X is less than y")
# elif x > y:
#     print("X is greater than Y")
# else:
#     print("X is equal to Y")

# # prints the equal and not equal
# if x < y or x > y:
#     print("x is not equal to y")
# else:
#     print("x is equal to y")
#
#


# prints the equal and not equal - better version
if x != y:
    print("x is not equal to y")
else:
    print("x is equal to y")
