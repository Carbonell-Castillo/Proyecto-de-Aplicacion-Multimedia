package Handlers;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ModificarImagen extends ImageHandler{

    protected String save_file;
    protected String new_name;
    protected String new_path;

    protected BufferedImage imagenBN;

    public ModificarImagen(String filename, String filepath) {
        super(filename, filepath);

        int inidiceInicial = super.getFileName().lastIndexOf("-") + 1;
        int indiceFinal = super.getFileName().lastIndexOf(".");

        this.new_name = filename.substring(inidiceInicial, indiceFinal);

        this.save_file = Data.SG.temporal;
    }

    @Override
    public void readFile() throws Exception {
        File archivo = new File(this.handledFilePath);
        imagenBN = ImageIO.read(archivo);
    }

    @Override
    public void generateFiles() throws Exception {

        // Imagen rotada 180 grados en el eje horizontal
        BufferedImage hRotatedImage = rotateImage180DegreesHorizontal(imagenBN);
        new_path = save_file + "Hrotation-" + new_name + ".jpeg";
        ImageIO.write(hRotatedImage, "JPEG", new File(new_path));

        // Imagen rotada 180 grados en el eje vertical
        BufferedImage vRotatedImage = rotateImage180DegreesVertical(imagenBN);
        new_path = save_file + "Vrotation-" + new_name + ".jpeg";
        ImageIO.write(vRotatedImage, "JPEG", new File(new_path));
    }


    private BufferedImage rotateImage180DegreesHorizontal(BufferedImage image) {
        AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
        tx.translate(0, -image.getHeight(null));
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return op.filter(image, null);
    }

    private BufferedImage rotateImage180DegreesVertical(BufferedImage image) {
        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        tx.translate(-image.getWidth(null), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return op.filter(image, null);
    }
}
   
