# Digital Sign implementation

import random
from hashlib import sha256

# Helper function to compute modular inverse
def modinv(a, m):
    m0, x0, x1 = m, 0, 1
    if m == 1:
        return 0
    while a > 1:
        q = a // m
        m, a = a % m, m
        x0, x1 = x1 - q * x0, x0
    if x1 < 0:
        x1 += m0
    return x1

# Key Generation (ElGamal) - Using small primes for fast execution
def generate_keys():
    # Choose a small prime p and generator g (we're using small primes here for demonstration)
    p = 7919  # A small prime for quick testing
    g = 2  # Simple generator
    
    # Private key: x (chosen randomly)
    x = random.randint(2, p - 2)
    
    # Public key: y = g^x mod p
    y = pow(g, x, p)
    
    return (p, g, x), (p, g, y)

# Digital Signature Generation
def sign_message(message, private_key):
    p, g, x = private_key
    
    # Step 1: Hash the message
    H_m = int(sha256(message.encode()).hexdigest(), 16)  # Hash the message to an integer
    
    # Step 2: Choose random k (using small values for speed)
    k = random.randint(2, p - 2)
    
    # Step 3: Compute r = g^k mod p
    r = pow(g, k, p)
    
    # Step 4: Compute s = k^-1 * (H(m) - x * r) mod (p-1)
    k_inv = modinv(k, p - 1)
    s = (k_inv * (H_m - x * r)) % (p - 1)
    
    return r, s

# Digital Signature Verification
def verify_signature(message, signature, public_key):
    r, s = signature
    p, g, y = public_key
    
    # Step 1: Check the range of r and s
    if not (0 < r < p) or not (0 < s < p):
        return False
    
    # Step 2: Hash the message
    H_m = int(sha256(message.encode()).hexdigest(), 16)
    
    # Step 3: Compute v1 = g^H(m) mod p
    v1 = pow(g, H_m, p)
    
    # Step 4: Compute v2 = y^r * r^s mod p
    v2 = (pow(y, r, p) * pow(r, s, p)) % p
    
    # Step 5: Compare v1 and v2
    return v1 == v2

    
# Example Usage
if __name__ == "__main__":
    # Key generation
    private_key, public_key = generate_keys()
    
    # Print keys for reference
    print(f"Private Key: {private_key}")
    print(f"Public Key: {public_key}")
    
    # Signing a message
    #message = "This is a quick test message"
    message = input("Enter the message: ")
    signature = sign_message(message, private_key)
    print(f"Signature: {signature}")
    
    # Verifying the signature
    is_valid = verify_signature(message, signature, public_key)
    print(f"Signature is valid: {is_valid}")


