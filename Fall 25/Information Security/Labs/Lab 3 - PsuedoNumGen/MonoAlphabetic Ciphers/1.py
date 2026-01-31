import random

def gen_psuedo_numbers(text):
    # hashVal = hash(text)
    random.seed(hash(text))
    random_number = random.randint(0, 7777)
    return random_number

text = input("enter your text: ")
random_number = gen_psuedo_numbers(text)
print(f"Psuedo number is: {random_number}")