# c = (aP+b) % 26, where a is coprime with 26 and b is a random number
# first calculate the coprime number

# checking for prime number
# def prime(a):
#   if (a < 2):
#     return False
#   for i in range(2, int(a**0.5) + 1):
#     if (a % i == 0):
#       return False
#   return a

import random
import math

# gcd (a, 26)
# pricoprime number checker
def coprime(a):
  if math.gcd(a, 26) == 1:
    return f"{a} and 26 are coprime numbers"
  return f"{a} and 26 are not coprime numbers"

coprime(11)

import array

# pseudo number for key as a
def randomNumGen():
#   rand = hash(num)
#   random.seed(rand) # for connection of random number with num
  randNum = random.randint(1, 9)
  return randNum

randomNumGen()


print (f"{coprime(randomNumGen())}")
