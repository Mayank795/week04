package bytearray;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageByteArrayConverter {
    public static byte[] imageToByteArray(String imagePath) {
        try {
            return Files.readAllBytes(Paths.get(imagePath));
        } catch (IOException e) {
            System.out.println("Error reading image: " + e.getMessage());
            return null;
        }
    }

    public static void byteArrayToImage(byte[] imageBytes, String outputPath) {
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            fos.write(imageBytes);
            System.out.println("Image written successfully to: " + outputPath);
        } catch (IOException e) {
            System.out.println("Error writing image: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String sourceImage = "Java-Logo.jpg";
        String outputImage = "copied_image.jpg";

        byte[] imageBytes = imageToByteArray(sourceImage);
        if (imageBytes != null) {
            byteArrayToImage(imageBytes, outputImage);
        }
    }
}
