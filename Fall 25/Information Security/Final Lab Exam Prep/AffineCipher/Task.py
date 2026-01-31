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

# Affine Cipher

# gcd(a, 26) = 1
def gcd(a, m):
  while m != 0:
    temp = a
    a = m
    m = temp % a
    # a, m = m, a % m # this is python's new way of implementing swapping
  return a
# gcd(prime(a), 26)

def coprime(a, m):
  if gcd(a, m) == 1:
    return True
  return f"{a} is not a coprime number"

# cipher = (aP+b) mod 26
def encrypt(plainText, a, b):
#   if not coprime(a, b):
#     return
#   else:
    cipher = ""
    for char in plainText.upper():
      if char.isalpha():
        P = ord(char) - 65
        C = (P * a + b) % 26
        cipher += chr(C + 65)
      else:
        cipher += char
    return cipher


# finding a^-1
def modInverse(a, m):
  # a %= m
  for x in range(1, m):
    if (x*a) % m == 1:
      return x
  raise ValueError(f"No moduler inverse of {a} and {m}")

def decrypt(cipher, a, b):
  # p = a^-1(c-b)%26
  aInverse = modInverse(a, 26)
  plainText = ""
  for char in cipher.upper():
    if char.isalpha():
      C = ord(char) - 65
      P = (aInverse * (C - b)) % 26
      plainText += chr(P + 65)
    else:
      plainText += char
  return plainText



# Execution
a = 7
b = 8
# msg = "I should work hard to get 3.7 SGPA in F25"
msg = input("Enter message to encrypt: ")
if not coprime(a, 26):
  print( "coprime number not found")
else:
  enc = encrypt(msg, a, b)
  print(f"Encrypted Message: {enc}")
dec = decrypt(enc, a, b)
print(f"Decrypt Message: {dec}")
print (f"Key is: {a}")
