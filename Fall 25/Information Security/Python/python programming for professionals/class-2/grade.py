score = int(input("Score: "))

#
# # method 1
# if score >= 90 and score <= 100:
#     print("Grade: A")
# elif score >= 80 and score <= 89:
#     print("Grade: B")
# elif score >= 70 and score <= 79:
#     print("Grade: C")
# elif score >= 60 and score <= 69:
#     print("Grade: D")
# else:
#     print("Grade: F")
#

#
# # method 2 - efficient way - reduce the probability of bugs etc
# if 90 <= score <= 100:
#     print("Grade: A")
# elif 80 <= score <= 89:
#     print("Grade: B")
# elif 70 <= score <= 79:
#     print("Grade: C")
# elif 60 <= score <= 69:
#     print("Grade: D")
# else:
#     print("Grade: F")
#



# method 3 - efficient way - simplying further and maintainable for long term -  reduce the probability of bugs etc
if score >= 90:
    print("Grade: A")
elif score >= 80:
    print("Grade: B")
elif score >= 70:
    print("Grade: C")
elif score >= 60:
    print("Grade: D")
else:
    print("Grade: F")


#
# # logically the broken thing
# if score >= 90:
#     print("Grade: A")
# if score >= 80:
#     print("Grade: B")
# if score >= 70:
#     print("Grade: C")
# if score >= 60:
#     print("Grade: D")
#
