# checking if the user failed to login 3 or more times then they should be blocked

file_name = "users_login_failed.txt"
with open(file_name, "r") as file:
    file_text = file.read()
usernames = file_text.split()
print(usernames)

# split: converts strings into list, separate after each white space
# print(file_text.split())

# algo for login prevention if more than 3 times failure
def login_check(login_list, current_user):
    counter = 0
    # looping through
    for i in login_list:
        # checking for condition
        if i == current_user:
            counter = counter + 1
    if counter >= 3:
        print ("You have been blocked from logining in!")
    else:
        print ("You can still login!")
        
login_check(usernames, "ali")