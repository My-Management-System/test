package com.my.eleven;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

 
public class ImageSelection {
	private Image image ;
	public ImageSelection(Image image){
		this.image = image;
	}
	public DataFlavor[] getTransferDataFlavor(){
		return new DataFlavor[]{DataFlavor.imageFlavor};
	}
	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException{
		if(flavor.equals(DataFlavor.imageFlavor)){
			return image;
		}else{
			throw new UnsupportedFlavorException(flavor);
		}
	}
	public boolean isDataFlavorSupported(DataFlavor flavor){
		return flavor.equals(DataFlavor.imageFlavor);
	}

}
