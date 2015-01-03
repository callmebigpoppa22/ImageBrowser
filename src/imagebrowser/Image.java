/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagebrowser;

import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author nano
 */
public class Image extends javax.swing.JPanel {

    private File file;
    private ImageIcon img;

    public Image(File file) {
        img = new ImageIcon(file.toString());
        this.setSize(img.getIconWidth(), img.getIconHeight()); //se selecciona el tamaño del panel
    }

    public int getHeight() {
        return img.getIconHeight();
    }

    public int getWitdh() {
        return img.getIconWidth();
    }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paint(Graphics grafico) {

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        grafico.drawImage(img.getImage(), 0, 0, img.getIconWidth(), img.getIconHeight(), null);
        setOpaque(false);
        super.paintComponent(grafico);
    }

}
