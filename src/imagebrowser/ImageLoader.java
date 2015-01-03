/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagebrowser;

import java.io.File;

/**
 *
 * @author nano
 */
public class ImageLoader {

    private File[] imageFiles;
    private Image[] images;

    public ImageLoader(File[] imageFiles) {
        this.imageFiles = imageFiles;
        this.images = new Image[imageFiles.length];
        for (int i = 0; i < imageFiles.length; i++) {
            images[i] = new Image(imageFiles[i]);
        }
    }

    protected Image[] load() {
        return images;
    }


}
