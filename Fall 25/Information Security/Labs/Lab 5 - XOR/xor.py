# this is Ammar's code - he has the rights

def xor_cipher(text, key):
  result = ""
  key_index = 0
  for char in text:
    result += (chr(ord(char) ^ ord(key[key_index])))
    key_index = (key_index + 1) % len(key)
  return ''.join(result)


text = "this is message"
key = "secret"
encrypted_text = xor_cipher(text, key)
print("Encrypted text:", encrypted_text)

decrypted_text = xor_cipher(encrypted_text, key)
print("Decrypted text:", decrypted_text)



