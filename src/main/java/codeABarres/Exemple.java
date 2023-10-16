package codeABarres;

import java.io.File;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

public class Exemple {

  public static void main (String [] args) throws Exception {

    //Get 128B Barcode instance from the Factory
    Barcode barcode = BarcodeFactory.createCode128B("256362578");
    barcode.setBarHeight(60);
    barcode.setBarWidth(2);

    File imgFile = new File("testsize.png");

    //Write the bar code to PNG file
    BarcodeImageHandler.savePNG(barcode, imgFile);
  }
}