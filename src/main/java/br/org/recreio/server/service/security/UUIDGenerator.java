package br.org.recreio.server.service.security;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

@Service
public class UUIDGenerator implements Serializable {

    @Serial
    private static final long serialVersionUID = 4L;

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    /**
     * @return {@link String} This method returns a UUID wrapped in an SHA-256 cryptography algorithm
     * @throws NoSuchAlgorithmException
     */
    public String generateUUID() throws NoSuchAlgorithmException {
        MessageDigest salt = MessageDigest.getInstance("SHA-256");
        salt.update(UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8));
        return bytesToHex(salt.digest());
    }

    /**
     * @param bytes This param receive an {@link Byte}[]
     * @return {@link String} - This method return a HEXADECIMAL String
     * @implNote This method converts an Array of Bytes into a Hexadecimal String
     */
    @Contract(value = "_ -> new", pure = true)
    private @NotNull String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
