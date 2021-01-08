package ie.gmit.sw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import javafx.application.*;

/**
 * Runner class that starts and runs a GUI.
 * 
 * @author Grace Keane
 * @version Java 15
 * 
 */

public class Runner {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// Run GUI
		System.out.println("[INFO] Launching GUI...");
		Application.launch(AppWindow.class, args);

	}
}
