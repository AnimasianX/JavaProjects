package gunGame;

public class GunMan {

	
	private String name;
	private String gun;
	private int ammo;
	private int hp;
	
	public GunMan() {
		this.ammo = 30;
		this.hp = 100;
	}
	
	public GunMan(String name, String gun, int ammo, int hp) {
		super();
		this.name = name;
		this.gun = gun;
		this.ammo = ammo;
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGun() {
		return gun;
	}
	public void setGun(String gun) {
		this.gun = gun;
	}
	public int getAmmo() {
		return ammo;
	}
	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}
	
	
	
	public void attack(GunMan player2) {
		if(this.ammo <= 0) {
			System.out.println("No ammo, reload.");
		}else {
		this.ammo -= 1;
		checkOppStats(player2);
		player2.hp -= 5;
		}
	}
	
	public void headshot(GunMan player2) {
		this.ammo -= 1;
		checkOppStats(player2);
		player2.hp -= 15;
	}
	
	public void reload() {
		this.ammo = 5;
	}
	
	public void respawn(GunMan player) {
		player.hp = 20;
	}
	
	public void checkOppStats(GunMan player2) {
		if(player2.getHp() <= 0) {
			System.out.println("Player " + player2.getName() + " is already dead.\nRespawn to play again.");
		}
		
	}
	//TODO add status like hiding defending.
	
}
