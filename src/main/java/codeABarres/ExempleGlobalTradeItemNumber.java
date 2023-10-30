package codeABarres;

import java.io.File;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

public class ExempleGlobalTradeItemNumber {

  public static void main (String [] args) throws Exception {

    //Get 128B Barcode instance from the Factory
    Barcode barcode = BarcodeFactory.createGlobalTradeItemNumber("478695");
    barcode.setBarHeight(60);
    barcode.setBarWidth(2);

    File imgFile = new File("GlobalTradeItemNumber.png");

    //Write the bar code to PNG file
    BarcodeImageHandler.savePNG(barcode, imgFile);
    System.out.println("Save GlobalTradeItemNumber...");
  }
}