package strategypattern;


import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataCompression {

    private float quality = 0.5f;

    public DataCompressionStrategy strategy;

    public String compressData(Data data) {
      /*  if (data instanceof ImageData) {
            return compressImageData((ImageData) data);
        } else if (data instanceof AudioData) {
            return compressAudioData((AudioData) data);
        } else if (data instanceof VideoData) {
            return compressVideoData((VideoData) data);
        }*/
        return compresser(data);
    }

    public void strategie(DataCompressionStrategy strategy){
            this.strategy = strategy;
    }

    public String compresser(Data d){
        return strategy.compressData(d);
    }









    }



