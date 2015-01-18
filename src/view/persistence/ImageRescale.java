/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.persistence;

/**
 *
 * @author nano
 */
public class ImageRescale {

    public int rescaleHeight(int h, int w) {
        int rh = h;
        int rw = w;
        while (rh * rw > 800 * 800) {
            rh = (int) (rh * 0.9f);
            rw = (int) (rw * 0.9f);
        }
        return rh;
    }

    public int rescaleWitdh(int h, int w) {
        int rh = h;
        int rw = w;
        while (rh * rw > 800 * 800) {
            rh = (int) (rh * 0.9f);
            rw = (int) (rw * 0.9f);
        }
        return rw;
    }
}
