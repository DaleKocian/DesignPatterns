package creational.factorymethod.imagereaderexample;

import java.io.InputStream;

/**
 * Created by dkocian on 12/13/13.
 */
public class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader( InputStream in ) {
        // check that it's a gif, throw exception if it's not, then if it is decode it.
    }

    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}