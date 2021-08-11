package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {
		int verse = 0;
		int tVerse =2;
		
		int curentBadgeNum = 0;
		int badgeNum = 12;
		
		int curentMushNum = 0;
		int mushNum = 2;
		
		while(verse < tVerse) {
			
			curentBadgeNum = 0;
			curentMushNum = 0;
			
			while(curentBadgeNum < badgeNum) {
				System.out.print("Badger, ");
				curentBadgeNum += 1;
			}
			System.out.println("");
			while(curentMushNum < mushNum) {
				System.out.print("Mushroom, ");
				curentMushNum += 1;
			}
			System.out.println("\n");
			verse += 1;
		}
		
		System.out.println("A Snake!!!");
	}
}
