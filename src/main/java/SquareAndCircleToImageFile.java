import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class SquareAndCircleToImageFile {
    public static void main(String[] args) throws IOException {

        BufferedImage bufferedImage = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        g2d.setColor(Color.lightGray);
        g2d.fillRect(0, 0, 1000, 1000);
        g2d.setColor(Color.darkGray);
        g2d.fillRect(500, 500, 500, 500);
        g2d.setColor(Color.blue);
        g2d.fillRect(500, 500, 300, 300);
        g2d.setColor(Color.black);
        g2d.fillOval(480,480,20,20);
        g2d.dispose();
        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png", file);

    }
}