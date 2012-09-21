package tbsgame.tiles;

public enum Terrain {
	PLAINS("tile_grass"),
	FORREST("tile_forrest"),
	MOUNTAINS("tile_mountains"),
	//TODO: Don't know quite what do do with this yet.
	//Have them all defined here? Or just one 'path'
	//whose image changes?
	PATH(null)
	;
	
	
	private String key;
	private Terrain(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
}
