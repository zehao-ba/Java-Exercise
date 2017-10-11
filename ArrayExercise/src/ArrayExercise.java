public class ArrayExercise {
	public static void main(String[] args){
		int size = 10;
		double[] myList = new double[size];
		myList[0] = 5.5;
		myList[1] = 4.5;
	    myList[2] = 3.3;
	    myList[3] = 13.2;
	    myList[4] = 4.0;
	    myList[5] = 34.33;
	    myList[6] = 34.0;
	    myList[7] = 45.45;
	    myList[8] = 99.993;
	    myList[9] = 11123;
	    
	    for (int i = 0; i< size; i++){
	    	System.out.println(myList[i]);
	    }
	    
	    double total = 0;
	    for (int i = 0; i< size; i++){
	    	total += myList[i];
	    }
	    System.out.println("total is " + total);
	    
	    double max = myList[0];
	    for (int i = 0; i < size; i++){
	    	if (myList[i] > max)
	    		max = myList[i];
	    	}
	    System.out.println("The max number in this list is " + max);
	   
	}
}

