
# GCD
def gcd(a, b):
    while b!= 0:
        a, b = b, a % b
    return a

a = 20
b = 2
print (f"gcd of {a} and {b} = {gcd(a, b)}")