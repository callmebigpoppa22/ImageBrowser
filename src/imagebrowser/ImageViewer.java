/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagebrowser;

/**
 *
 * @author nano
 */
public class ImageViewer {

    private int index = 0;
    private Image[] images;

    public ImageViewer(Image[] images) {
        this.images = images;
    }

    public Image next() {
        if (index == images.length - 1) {
            index = 0;
        } else {
            index++;
        }

        return images[index];
    }

    public Image prev() {
        if (index == 0) {
            index = images.length - 1;
        } else {
            index--;
        }

        return images[index];
    }

    public Image firstOne() {
        return images[0];
    }
}
