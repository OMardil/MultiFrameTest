package p1;

public class Pokemon {

	private String name;
	private int pokemonId;
	
	public Pokemon(String name, int pokemonId) {
		this.name = name;
		this.setPokemonId(pokemonId);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(int pokemonId) {
		this.pokemonId = pokemonId;
	}
	
	
	
}
