package star3.project.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import star3.project.Star3Teeko;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "Teeko";
		config.width = 512;
		config.height = 512;
		
		new LwjglApplication(new Star3Teeko(), config);
	}
}
