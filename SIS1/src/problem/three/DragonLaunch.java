package problem.three;

import java.util.Vector;

class DragonLaunch {
	private static Vector<Object> people = new Vector<Object>();
	
	static void kidnap(Person p) {
		people.add(p);
	}

	static Boolean willDragonEatOrNot() {
		boolean removed = false;
		boolean answer = true;
		for(int i = 0; i < people.size() - 1; i++) {
			if (people.get(i).toString() == "B" && people.get(i + 1).toString() == "G")	{
				people.remove(i);
				people.remove(i);	
				removed = true;
			}
		}	
		if(people.isEmpty()) return false;
		
		if(!people.isEmpty() && removed) return answer = willDragonEatOrNot();
		return answer;
		
	}
	public static void main(String[] args) {
		Person smn1 = new Person('B');
		Person smn2 = new Person('G');
		DragonLaunch.kidnap(smn1);
		DragonLaunch.kidnap(smn2);
//		DragonLaunch.kidnap(smn2);	
		System.out.println(DragonLaunch.willDragonEatOrNot());
	}

}
