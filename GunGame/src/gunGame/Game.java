package gunGame;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GunMan p1 = new GunMan("Tom Tucker", "M4-A4", 5, 20);
		GunMan p2 = new GunMan("Toe Ducker", "FAMAS", 5, 20);
		boolean quit = true;
		
		
		while(p1.getAmmo() > 0) {
			p1.attack(p2);
			System.out.println(p1.getAmmo());
			System.out.println(p2.getHp());
		}
		 p2.respawn(p2);
		 p1.attack(p2);
		 System.out.println(p1.getAmmo());
		 System.out.println(p2.getHp());
		 p1.reload();
		 System.out.println(p1.getAmmo());
		 System.out.println(p2.getHp());
		
		
	}

}
