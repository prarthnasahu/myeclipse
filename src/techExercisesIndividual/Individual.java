package techExercisesIndividual;

public class Individual {
	
	/*psuedo code
	 * Step1 : Create a function with two Array parameters
	ArrayJob - [“Remote”, “Flexible Working Hours”]
	ArrayInd – [“office Base two Days per weerk”, “React Developer”]

	Step 2 : search a string of Arrayjob in ArrayInd . For this following steps to be taken
	a. Declare two variables VarJob and VarInd
	b. Find out the length of each array ArrayJob = 2 and ArrayInd = 2
	c. Create two loop to populate each array index value to above mentioned declared variables in
	step 2.a
	d. Then search VarJob variable string value in VarInd variable if any keyword matches then print
	100 or else 0 .
	*/
		
	public static int findMatchCount(final String [] a,final String [] b){
	    int matchCount = 0;

	    for(int i = 0, j = 0;i < a.length && j < b.length;){
	        int res = a[i].compareTo(b[j]);
	        if(res == 0){
	            matchCount++;
	            i++;
	            j++;
	        }else if(res < 0){
	            i++;
	        }else{
	            j++;
	        }
	    }
	    return matchCount;
	}

	public static void main(String[] args){ 
	    String[] a = {"Remote","Selenium Automation","Java","Flexible working hours","Communication Skills","Flexibility"};
	    String[] b = {"Remote","Selenium Automation","Java","office based two days per week","react developer","Autonomy"};
	    System.out.println(findMatchCount(a,b));

	}
	
}
