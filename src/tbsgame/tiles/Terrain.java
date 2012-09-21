package tbsgame.tiles;

public enum Terrain {
	PLAINS("tile_grass"),
	FORREST("tile_forrest"),
	MOUNTAINS("tile_mountains")
	;
	
	
	private String key;
	private Terrain(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
}
