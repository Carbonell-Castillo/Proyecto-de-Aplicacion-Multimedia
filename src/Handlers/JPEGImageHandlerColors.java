/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handlers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author diego
 */
public class JPEGImageHandlerColors extends ImageHandler {

    protected String save_file;
    protected String new_name;
    protected String new_path;

    protected BufferedImage imagenR;
    protected BufferedImage imagenG;
    protected BufferedImage imagenB;
    protected BufferedImage imagenS;

    public JPEGImageHandlerColors(String filename, String filepath) {
        super(filename, filepath);

        //copy-nombre.jpeg
        int inidiceInicial = super.getFileName().lastIndexOf("-") + 1;
        int indiceFinal = super.getFileName().lastIndexOf(".");

        this.new_name = filename.substring(inidiceInicial, indiceFinal);

        this.save_file = "C:\\Users\\bruce\\OneDrive\\Imágenes\\Saved Pictures\\Temporal\\";
    }

    @Override
    public void readFile() throws Exception {
        File archivo = new File(this.handledFilePath);
        imagenR = ImageIO.read(archivo);
        imagenG = ImageIO.read(archivo);
        imagenB = ImageIO.read(archivo);
        imagenS = ImageIO.read(archivo);
    }

    @Override
    public void generateFiles() throws Exception {
        red(imagenR);
        green(imagenG);
        blue(imagenB);
        sepia(imagenS);
    }

    public void red(BufferedImage imagen) {
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                int p = imagen.getRGB(i, j);

                int a = (p >> 24) & 0xff;
                int red = (p >> 16) & 0xff;
                // canal alfa | pixeles rojos | pixeles verdes | pixeles azules
                p = (a << 24) | (red << 16) | (0 << 8) | 0;
                imagen.setRGB(i, j, p);
            }
        }
        try {
            new_path = save_file + "red-" + new_name + ".jpeg";

            ImageIO.write(imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void green(BufferedImage imagen) {
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                int p = imagen.getRGB(i, j);

                int a = (p >> 24) & 0xff;
                int green = (p >> 8) & 0xff;

                // canal alfa | pixeles rojos | pixeles verdes | pixeles azules
                p = (a << 24) | (0 << 16) | (green << 8) | 0;
                imagen.setRGB(i, j, p);
            }
        }

        try {
            new_path = save_file + "green-" + new_name + ".jpeg";
            ImageIO.write(imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void blue(BufferedImage imagen) {
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                int p = imagen.getRGB(i, j);

                int a = (p >> 24) & 0xff;
                int blue = p & 0xff;

                // canal alfa | pixeles rojos | pixeles verdes | pixeles azules
                p = (a << 24) | (0 << 16) | (0 << 8) | blue;

                imagen.setRGB(i, j, p);
            }
        }
        try {
            new_path = save_file + "blue-" + new_name + ".jpeg";
            ImageIO.write(imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void sepia(BufferedImage imagen) {
        int width = imagen.getWidth();
        int height = imagen.getHeight();

        // Crea una nueva imagen con el mismo tamaño que la original
        BufferedImage nueva_imagen = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = imagen.getRGB(x, y);

                int alpha = (p >> 24) & 0xff;
                int red = (p >> 16) & 0xff;
                int green = (p >> 8) & 0xff;
                int blue = p & 0xff;

                // Fórmula para la conversión a sepia
                int new_red = (int) (0.393 * red + 0.769 * green + 0.189 * blue);
                int new_green = (int) (0.349 * red + 0.686 * green + 0.168 * blue);
                int new_blue = (int) (0.272 * red + 0.534 * green + 0.131 * blue);

                // Verifica si los valores están dentro del rango de 0 a 255
                new_red = Math.min(255, Math.max(0, new_red));
                new_green = Math.min(255, Math.max(0, new_green));
                new_blue = Math.min(255, Math.max(0, new_blue));

                // Crea el nuevo valor RGB
                int new_pixel = (alpha << 24) | (new_red << 16) | (new_green << 8) | new_blue;
                nueva_imagen.setRGB(x, y, new_pixel);
            }
        }

        try {
            new_path = save_file + "sepia-" + new_name + ".jpeg";
            ImageIO.write(nueva_imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
