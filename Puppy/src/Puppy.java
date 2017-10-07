public class Puppy {
	int puppyAge;
	public Puppy(String name){
		System.out.println("Dog name is " + name);
	}
	
	public void setAge(int age){
		puppyAge = age;
	}
	
	public int getAge(){
		System.out.println("Dog's age is " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args){
		// create an object
		Puppy mypuppy = new Puppy("Tom");
		// set age
		mypuppy.setAge(2);
		// get age
		mypuppy.getAge();
		System.out.println("age " + mypuppy.puppyAge);
	}
}
