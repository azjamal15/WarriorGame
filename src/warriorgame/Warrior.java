package warriorgame;

/// Every real world object has attributes
// (height, weight) and capabilities
// (eat, run)
// With object oriented programming we store
// attributes in fields and model capabilities
// using methods
 
public class Warrior {
	
	// Class fields can be : 
	// public : any code can change
	// protected : class code and subclasses
	// can change
	// private : only class code can change
	protected String name = "Warrior";
	public int health = 0;
	public int attkMax = 0;
	public int blockMax = 0;
	
	// ---- INTERFACE ADD ON ----
	// We are using an instance variable that
	// is a subclass of the Teleports interface
	// At run time subclasses can define whether
	// they can teleport or not
	public Teleports teleportType;
	// ---- END OF INTERFACE ADD ON ----
	
	// The constructor is called each time you
	// want to create a new Warrior object
	public Warrior() {
		
	}
	
	// You can have constructors with and
	// without attributes
	public Warrior(String name, int health,
			int attkMax, int blockMax) {
		this.setName(name);
		this.health = health;
		this.attkMax = attkMax;
		this.blockMax = blockMax;
	}
	
	// Model what happens when a warrior attacks
	// and blocks
	public int attack() {
		return 1 + (int)(Math.random() * 
				((attkMax - 1) + 1));
	}
	
	public int block() {
		return 1 + (int)(Math.random() * 
				((blockMax - 1) + 1));
	}
 
	// Getters and setters provide access to
	// private, or protected fields
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	
	// ---- INTERFACE ADD ON ----
	// Have teleportType handle output depending
	// on settings
	public String teleport() {
		return teleportType.teleport();
	}
	
	// Allows for dynamic changing of teleporting type
	public void setTeleportAbility(Teleports newTeleportType) {
		teleportType = newTeleportType;
	}
	// ---- END INTERFACE ADD ON ----
 
}