package codeABarres;

import java.io.File;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

public class Exemple128C {

  public static void main (String [] args) throws Exception {

    //Get 128B Barcode instance from the Factory
    Barcode barcode = BarcodeFactory.createCode128C("363999");
    barcode.setBarHeight(60);
    barcode.setBarWidth(2);

    File imgFile = new File("128C.png");

    //Write the bar code to PNG file
    BarcodeImageHandler.savePNG(barcode, imgFile);
    System.out.println("Save 128C...");
  }
}