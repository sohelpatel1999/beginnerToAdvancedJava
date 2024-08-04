package encryption;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encryption {
    // Define the encryption algorithm to use (AES)
    private static final String ALGORITHM = "AES";

    // Define a fixed key for encryption and decryption
    private static final String key = "PY2rnEHwSSRHfUZezKpvbgymDkbtUKtI";

    // Method to generate a SecretKeySpec from the string key
    public static SecretKeySpec getKeyFromString() throws Exception {
        // Convert the string key into bytes using UTF-8 encoding
        byte[] keyBytes = key.getBytes("UTF-8");
        // Create a SecretKeySpec using the byte array and the algorithm
        return new SecretKeySpec(keyBytes, ALGORITHM);
    }

    // Method to encrypt a plaintext string
    public static String encrypt(String plaintext) throws Exception {
        // Get a Cipher instance for the AES algorithm
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        // Initialize the cipher in encryption mode with the secret key
        cipher.init(Cipher.ENCRYPT_MODE, getKeyFromString());
        // Encrypt the plaintext string into a byte array
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes("UTF-8"));
        // Encode the encrypted byte array into a Base64 string for easy representation
        return Base64.getUrlEncoder().encodeToString(encryptedBytes);
    }

    // Method to decrypt an encrypted string
    public static String decrypt(String ciphertext) throws Exception {
        // Get a Cipher instance for the AES algorithm
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        // Initialize the cipher in decryption mode with the secret key
        cipher.init(Cipher.DECRYPT_MODE, getKeyFromString());
        // Decode the Base64 encoded ciphertext into a byte array
        byte[] decryptedBytes = cipher.doFinal(Base64.getUrlDecoder().decode(ciphertext));
        // Convert the decrypted byte array into a string using UTF-8 encoding
        return new String(decryptedBytes, "UTF-8");
    }

    // Main method to test encryption and decryption
    public static void main(String[] args) {
        try {
            // Define the plaintext to be encrypted
            String plaintext = "EB3_1411_1709899057100";
            // Encrypt the plaintext and store the result
            String encrypted = encrypt(plaintext);
            // Print the encrypted text
            System.out.println("Encrypted Text: " + encrypted);

            // Decrypt the encrypted text and store the result
            String plaintext2 = "7OdS9hDmrwXEMeU0zzQucbqGkjf5k7ToMVSgOAzH0O4=";

            String decrypted = decrypt(encrypted);
            // Print the decrypted text
            System.out.println("Decrypted Text: " + decrypted);
        } catch (Exception e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }

}
