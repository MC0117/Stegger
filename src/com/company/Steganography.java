package com.company;

import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;


public class Steganography {

    //Contains all methods related to embedding and encrypting the files
    public static class EmbedEncryptFile{

        //Runs checks and preparations to later embed the files
        static BufferedImage embedToFile(String message, BufferedImage coverImg, String key, boolean hopEnabled){
            String hashedKey = hashKey(key);

            int hopValue = 0;
            String fMessage = formatMessage(message, hashedKey);
            if (feasibilityCheck(fMessage, coverImg)){
                hopValue = genHopValue(coverImg, hashedKey, hopEnabled);
                return coverImg;
            }
            else{
                return null;
            }
        }
        //Generates a hop-value based on the two files
        private static int genHopValue(BufferedImage coverImg, String key, boolean hopEnabled){
            // Creates a
            //int scramble = key.

            return 0;
        }
        //Formats and encrypts the message
        private static String formatMessage(String message, String key){
            return message;
        }
        //Scans through the file to determine whether embedding is possible without loss
        private static boolean feasibilityCheck(String formattedMessage, BufferedImage coverImg){

            return true;
        }
        //Encrypts the key using SHA-256
        public static String hashKey(String key){
            try{
                MessageDigest md = MessageDigest.getInstance("SHA-256");

                byte[] hash = md.digest(key.getBytes());
                key = toHexString(hash);
                return key;

                }
            catch(Exception e){
                System.out.println(e.getMessage());
                return "EXCEPTION";
            }
        }
        //Converts byte array(the digest-method return-type) to Hexadecimal String(hash)
        private static String toHexString(byte[] a){
            StringBuilder sb = new StringBuilder(a.length * 2);
            for(byte b : a) {
                int value = 0xFF & b;
                String tmp = Integer.toHexString(value);
                sb.append(tmp);
            }
            return sb.toString();
        }
    }
}
