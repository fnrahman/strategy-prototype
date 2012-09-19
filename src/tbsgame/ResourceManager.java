package tbsgame;

import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public enum ResourceManager {
	INSTANCE;
	private Map<String, Image> imageMap;
	
	private ResourceManager() {
		imageMap = new HashMap<String, Image>();
	}
	
	public Image loadImage(String key, String path) throws SlickException {
		Image img = null;
		try {
			img = new Image(path);
		} catch (SlickException e) {
			throw new SlickException("Could not load image", e);
		}
		return img;
	}
	
	public Image putImage(String key, Image img) {
		if (img != null) {
			imageMap.put(key, img);
		}
		return img;
	}
	
	public Image getImage(String key) {
		return imageMap.get(key);
	}
}
