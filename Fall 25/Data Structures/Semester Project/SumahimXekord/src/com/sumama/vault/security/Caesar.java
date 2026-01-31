// import 
public class Caesar {
    String encrypt(String message, int shift) {
            StringBuilder result = new StringBuilder(); // to hold the cipher text
            // character by character encryption
            for (char character : message.toLowerCase().toCharArray()) {
                if (character != ' ') {
                    int originalAlphabetPosition = character - 'a';

                    // applying Caeser Cipher Technique
                    int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                    char newCharacter = (char) ('a' + newAlphabetPosition);

                    // adding the new character to the resulat
                    result.append(newCharacter);
                } else {
                    result.append(character);
                }
            }
            return result.toString();
        }



        // decrypt
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String decrypt(String cipherMsg, int shift) {
            cipherMsg = cipherMsg.toLowerCase(); //  to hold the cipher text
            // Final cipher
            String message = "";
            for (int j = 0; j < cipherMsg.length(); j++) {
                int charPos = alpha.indexOf(cipherMsg.charAt(j));

                // decryption
                int keyVal = (charPos - shift) % 26;
                if (keyVal < 0) {
                    keyVal = alpha.length() + keyVal;
                }

                // append the decrypted character
                char replaceVal = alpha.charAt(keyVal);
                message += replaceVal;
            }
            return message;
        

            // // character by character encryption
            // for (char character : cipherMsg.toLowerCase().toCharArray()) {
            //     if (character != ' ') {
            //         int originalAlphabetPosition = character - 'a';

            //         // applying Caeser Cipher Technique
            //         int newAlphabetPosition = (originalAlphabetPosition - shift) % 26;
            //         char newCharacter = (char) ('a' + newAlphabetPosition);

            //         // adding the new character to the resulat
            //         result.append(newCharacter);
            //     } else {
            //         result.append(character);
            //     }
            // }
            // return result.toString();
        }
    public static void main(String... arg) {
        Caesar cipher = new Caesar();
        int shift = 20;
        String cipherMsg = cipher.encrypt("Sumama Rahim", shift);
        String plainMsg = cipher.decrypt(cipherMsg, shift);
        System.out.println("Encrypted msg: " + cipherMsg);
        System.out.println("Plain msg; " + plainMsg);
    }
}