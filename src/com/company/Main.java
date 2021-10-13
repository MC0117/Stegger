package com.company;

import com.company.Steganography.EmbedEncryptFile.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.String;
import java.net.URL;
import javax.imageio.ImageIO;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;


public class Main {
    public static void main(String[] args) {
        boolean hopEnabled = true;
        String basePath = System.getProperty("user.dir") + "\\";
        try {

            File bruh = new File(basePath + "img\\bruh.png");
            System.out.println("Welcome to Stegger!!");

            File coverFile = new File(basePath + "img\\dog.png");
            System.out.println(coverFile.getPath());

            BufferedImage coverImg = ImageIO.read(coverFile);
            Color myColor = new Color(255,192,203);
            coverImg.setRGB(0, 0, myColor.getRGB());

            BufferedImage bf = Steganography.EmbedEncryptFile.embedToFile("",coverImg,"", hopEnabled);

            coverImg.setRGB(0,0, myColor.getRGB());
            ImageIO.write(coverImg,"png", bruh);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    //
    public static void printPixelTest(BufferedImage img){
        Color pixelColor, red, green, blue;
        for (int i = 0, x = 0, y = 0; i <= (img.getHeight() * img.getWidth()); i++){
            pixelColor = new Color (img.getRGB(x,y));
            System.out.println(pixelColor.getRed());
            System.out.println(pixelColor.getGreen());
            System.out.println(pixelColor.getBlue());
            System.out.println(pixelColor.getAlpha());
            x = x < img.getWidth() ? x++: x;
            y = y < img.getHeight() ? y++: y;
            System.out.println(i);
        }
    }
}
