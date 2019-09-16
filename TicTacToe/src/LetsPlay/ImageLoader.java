package LetsPlay;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	static Image imgX, imgO;

	public ImageLoader() {
		try {
			imgO = ImageIO.read(new File("res/o.png"));
			imgX = ImageIO.read(new File("res/x.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
