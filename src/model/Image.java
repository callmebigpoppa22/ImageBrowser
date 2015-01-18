package model;

import java.awt.Graphics;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author nano
 */
public class Image extends javax.swing.JPanel {

    private File file;
    private final ImageIcon img;

    public Image(File file) {
        img = new ImageIcon(file.toString());
        this.setSize(img.getIconWidth(), img.getIconHeight()); //se selecciona el tamaño del panel
    }

    @Override
    public int getHeight() {
        return img.getIconHeight();
    }

    public int getWitdh() {
        return img.getIconWidth();
    }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    @Override
    public void paint(Graphics grafico) {

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        grafico.drawImage(img.getImage(), 0, 0, img.getIconWidth(), img.getIconHeight(), null);
        setOpaque(false);
        super.paintComponent(grafico);
    }

}
