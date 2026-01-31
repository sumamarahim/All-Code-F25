name = input("What's your name? ")



# if name == "Harry":
#     print("Gryffindor")
# elif name == "Hermione":
#     print("Gryffindor")
# elif name == "Ron":
#     print("Slytherin")
# else:
#     print("Who?")


# if name == "Harry" or name == "Hermione":
#     print("Gryffindor")
# elif name == "Ron":
#     print("Slytherin")
# else:
#     print("Who?")

# # alternative
# match name:
#     case "Harry":
#         print("Gryffindor")
#     case "Hermione":
#         print("Gryffindor")
#     case "Ron":
#         print("Slytherin")
#     case _:
#         print("Who?")




# alternative
match name:
    case "Harry" | "Hermione":
        print("Gryffindor")
    case "Ron":
        print("Slytherin")
    case _:
        print("Who?")






