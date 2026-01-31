#RSA Implementation
import random, math
# from sympy import isprime

# Function to check if a number is prime
def isprime(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

# # Function to find GCD
# def gcd(a, b):
#     while b != 0:
#         a, b = b, a % b
#     return a

# Function to find modular inverse
def mod_inverse(e, phi):
    for d in range(1, phi):
        if (e * d) % phi == 1:
            return d
    return None

# Function to generate keys
def generate_keys():
    # Step 1: Choose two random prime numbers
    primes = [i for i in range(1, 20) if isprime(i)]
    p = random.choice(primes)
    q = random.choice([i for i in primes if i != p])
    # Step 2: Calculate n and phi
    n = p * q
    phi = (p - 1) * (q - 1)
    # Step 3: Choose e such that 1 < e < phi and gcd(e, phi) = 1
    e = random.choice([i for i in range(2, phi) if math.gcd(i, phi) == 1])

    # Step 4: Calculate d, the modular inverse of e
    d = mod_inverse(e, phi)
    return (e, n), (d, n)

# RSA Encryption
def encrypt(public_key, plaintext):
    e, n = public_key
    ciphertext = [pow(ord(char), e, n) for char in plaintext]
    return ciphertext

# RSA Decryption
def decrypt(private_key, ciphertext):
    d, n = private_key
    plaintext = ''.join([chr(pow(char, d, n)) for char in ciphertext])
    return plaintext

# Main
if __name__ == "__main__":
    public_key, private_key = generate_keys()
    print("Public Key:", public_key)
    print("Private Key:", private_key)
    message = input("Enter a message to encrypt: ")
    encrypted_message = encrypt(public_key, message)
    print("Encrypted Message:", encrypted_message)
    decrypted_message = decrypt(private_key, encrypted_message)
    print("Decrypted Message:", decrypted_message)