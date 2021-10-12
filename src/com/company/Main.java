package com.company;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.String;
import java.net.URL;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {
        //URI url = new URL();
        String path = System.getProperty("user.dir") + "\\";
        //BufferedReader br = new BufferedReader();
        try {
            File f = new File(path);
            System.out.println("Welcome to Stegger!!");
            File backgroundFile = new File(path);
            BufferedImage backgroundImage = ImageIO.read(backgroundFile);
            Color myColor = new Color(255,192,203);
            backgroundImage.setRGB(0,0, myColor.getRGB());
            //File file = new File();
        }
        catch (Exception e){
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
