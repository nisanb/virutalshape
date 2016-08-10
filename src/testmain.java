import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class testmain {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		File sourceimage = new File("src/images/1.jpg");
		Image image = ImageIO.read(sourceimage);
		TestWindow test = new TestWindow(image, 0, 0, 0);
		test.setVisible(true);
		test.show();
		Thread.sleep(2000);
	}
}
