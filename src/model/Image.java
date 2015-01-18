package model;

import java.awt.Graphics;
import java.io.File;
import javax.swing.ImageIcon;
import view.persistence.ImageRescale;

/**
 *
 * @author nano
 */
public class Image extends javax.swing.JPanel {

    private final ImageIcon img;
    private final int h;
    private final int w;

    public Image(File file) {
        img = new ImageIcon(file.toString());
        h = new ImageRescale().rescaleHeight(img.getIconHeight(), img.getIconWidth());
        w = new ImageRescale().rescaleHeight(img.getIconHeight(), img.getIconWidth());
        this.setSize(w, h); //se selecciona el tamaño del panel
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
        grafico.drawImage(img.getImage(), 0, 0, w, h, null);
        setOpaque(false);
        super.paintComponent(grafico);
    }
}
