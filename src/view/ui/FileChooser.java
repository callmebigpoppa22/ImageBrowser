package view.ui;

import view.persistence.ImageFileFilter;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author nano
 */
public class FileChooser {

    private final Component parent;

    public FileChooser(Component parent) {
        this.parent = parent;
    }

    public File[] openFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(parent);
        File dir = chooser.getSelectedFile();
        File[] files = dir.listFiles(new ImageFileFilter());
        for (File ff : files) {
            System.out.println("file: " + ff.getName());
            System.out.println("ruta: " + ff.toString());
        }
        return files;
    }

}
