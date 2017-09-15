package problem.three;

import java.util.Vector;

class DragonLaunch {
	private static Vector<Object> people = new Vector<Object>();
	
	static void kidnap(Person p) {
		people.add(p);
	}

	static boolean willDragonEatOrNot() {
		int cnt = 0;
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).toString() == "B") {
				cnt++;
			}
			if (people.get(i).toString() == "G" && cnt > 0) {
				cnt--;
			}
		}
		return cnt != 0;
	}
	public static void main(String[] args) {
		Person smn1 = new Person('B');
		Person smn2 = new Person('G');
		DragonLaunch.kidnap(smn2);
		DragonLaunch.kidnap(smn1);	
		DragonLaunch.kidnap(smn2);
		DragonLaunch.kidnap(smn1);	 
		System.out.println(DragonLaunch.willDragonEatOrNot());
	}

}
