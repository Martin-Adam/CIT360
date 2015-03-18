package pokeBean;

//this is implementing the bean
public class PokeBean {
	public static void main(String[] args) {
		PokeStore pokemon = new PokeStore();
		
		pokemon.setPokeName("Pikachu");
		
		System.out.println(pokemon.getPokeName());
		
		pokemon.setPokeName(null);
		
		System.out.println(pokemon.getPokeName());
	}
}
