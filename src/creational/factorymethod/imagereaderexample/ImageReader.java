package creational.factorymethod.imagereaderexample;

/**
 * Created by dkocian on 12/13/13.
 */
public interface ImageReader {
    DecodedImage decodedImage = null;
    public DecodedImage getDecodedImage();
}
