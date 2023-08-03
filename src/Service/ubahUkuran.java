/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author max
 */
public class ubahUkuran {
    public static ImageIcon resizeImageIcon(ImageIcon originalIcon, int width) {
        Image originalImage = originalIcon.getImage();
        int height = originalImage.getHeight(null) * width / originalImage.getWidth(null);
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
