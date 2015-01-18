package view.persistence;

import model.Image;
import java.io.File;

/**
 *
 * @author nano
 */
public class ImageLoader {

    private final File[] imageFiles;
    private final Image[] images;

    public ImageLoader(File[] imageFiles) {
        this.imageFiles = imageFiles;
        this.images = new Image[imageFiles.length];
        for (int i = 0; i < imageFiles.length; i++) {
            images[i] = new Image(imageFiles[i]);
        }
    }

    public Image[] load() {
        return images;
    }

}
