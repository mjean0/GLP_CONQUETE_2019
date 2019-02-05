package conquete;

/**
 * @author macbook
 *
 */
public class Ressources{
//Attributes
	private Gold gold;
	private Diamond diamond;
	private Iron iron;
	private Plants plant;
	private Wood wood;
	private Weapons weapon;
	private Transports transport;
	
	public Ressources() {
		super();
		gold = null;
		diamond = null;
		iron = null;
		plant = null;
		wood = null;
		weapon = null;
		transport = null;
	}

	public Ressources(Gold gold, Diamond diamond, Iron iron, Plants plant, Wood wood, Weapons weapon,
			Transports transport) {
		super();
		this.gold = gold;
		this.diamond = diamond;
		this.iron = iron;
		this.plant = plant;
		this.wood = wood;
		this.weapon = weapon;
		this.transport = transport;
	}
	
}
