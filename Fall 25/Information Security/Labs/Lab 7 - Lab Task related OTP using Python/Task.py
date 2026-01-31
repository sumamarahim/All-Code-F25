import os

def xor_encrypt(data: bytes, key: bytes) -> bytes:
    # Ensure the key and data are the same length
    if len(data) != len(key):
        raise ValueError("Data and key must be the same length")
        
    # Use a list comprehension to XOR each byte
    # b_data ^ b_key performs the XOR operation on the two bytes
    return bytes([b_data ^ b_key for b_data, b_key in zip(data, key)])

# --- Main script execution ---
if __name__ == "__main__":
    
    # Per your request, we set up the messages.
    # We will use .encode() to turn strings into bytes.
    # For this demo, we'll pad messages to the same length (18 bytes).
    msg1_str = input("Enter msg 1: ")
    msg2_str = input("Enter msg 2: ")
    
    msg1_bytes = msg1_str.encode('utf-8')
    msg2_bytes = msg2_str.encode('utf-8')
    
    print(f"Plaintext 1: {msg1_str}")
    print(f"Plaintext 2: {msg2_str}")
    print(f"Length: {len(msg1_bytes)} bytes")
    print("-" * 30)

    # ---
    # Task 1: Encrypt two DIFFERENT messages with the SAME key
    # This demonstrates the "Two-Time Pad" vulnerability.
    # ---
    print("### Task 1: Different Messages, Same Key (Two-Time Pad) ###")
    
    # 1. Generate one random key of the same length as the messages
    key_shared = os.urandom(len(msg1_bytes))
    
    # 2. Encrypt both messages with this one key
    cipher1 = xor_encrypt(msg1_bytes, key_shared)
    cipher2 = xor_encrypt(msg2_bytes, key_shared)
    
    print(f"  Shared Key: {key_shared.hex()}")
    print(f"  Ciphertext 1: {cipher1.hex()}")
    print(f"  Ciphertext 2: {cipher2.hex()}")
    
    # Analysis: What happens if an attacker gets both ciphertexts?
    # They can XOR the two ciphertexts together.
    cipher_xor = xor_encrypt(cipher1, cipher2)
    print(f"  C1 XOR C2:    {cipher_xor.hex()}")
    
    # Let's see what the XOR of the plaintexts is
    plain_xor = xor_encrypt(msg1_bytes, msg2_bytes)
    print(f"  P1 XOR P2:    {plain_xor.hex()}")
    print("  Analysi!")
    print("-" * 30)

    # ---
    # Task 2: Encrypt the SAME message with DIFFERENT keys
    # This demonstrates the correct, secure use of a one-time pad.
    # ---
    print("### Task 2: Same Message, Different Keys ###")
    
    # 1. Generate two different random keys
    key_A = os.urandom(len(msg1_bytes))
    key_B = os.urandom(len(msg1_bytes))
    
    # 2. Encrypt the *same* message (msg1) with each key
    cipher_A = xor_encrypt(msg1_bytes, key_A)
    cipher_B = xor_encrypt(msg1_bytes, key_B)
    
    print(f"  Message: {msg1_str}")
    print(f"  Key A: {key_A.hex()}")
    print(f"  Key B: {key_B.hex()}")
    print(f"  Ciphertext A: {cipher_A.hex()}")
    print(f"  Ciphertext B: {cipher_B.hex()}")
    print("  Analysis: The ciphertexts are completely different and unrelated.")
    print("-" * 80)
    
    # ---
    # Task 3: Encrypt a CIPHERTEXT with its corresponding PLAINTEXT
    # This demonstrates an algebraic property of XOR.
    # ---
    print("### Task 3: Ciphertext XOR Plaintext ###")
    
    # We will use cipher1 and msg1_bytes from Task 1
    # cipher1 = msg1_bytes ⊕ key_shared
    
    # Now, let's "encrypt" the ciphertext with the plaintext
    # result = cipher1 ⊕ msg1_bytes
    result = xor_encrypt(cipher1, msg1_bytes)
    
    print(f"  Ciphertext 1: {cipher1.hex()}")
    print(f"  Plaintext 1:  {msg1_bytes.hex()}")
    print(f"  Result (C1 ⊕ P1): {result.hex()}")
    print(f"  Original Key:     {key_shared.hex()}")
    print("  Analysis")
    print("-" * 30)