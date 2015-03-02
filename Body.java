class Body {
	public long idNum;
	public String name;
	public Body orbits;     
	
	public static long nextID = 0;
	public final double PI = 3.1416;        //Setting up data members 

/* ------------------------------------------------------------------------ */

	Body() {
	   idNum = nextID++;   //when a body is set up it sets the idNum to (currect idNum) + 1
	   }
	
	 Body(Body orbitsAround, String bodyName) {
	  this();
	  name = bodyName;
	  orbits = orbitsAround;  //Initializing the constructor for name / orbits what
	  }

	Body(String bodyName) {
	  this();
	  orbits = null;
	  name = bodyName;   
	  }

	public String toString() {   //setting up an argument
	   String desc = idNum + " (" + name + ")";
	   if (orbits != null) 
		desc += " orbits " + orbits.toString();
	   return desc;
	   }
	

	public String toString(String arg) {
	    System.out.println("This is dumb: " + arg);  //printing out This is dumb plus whatever argument is
		return "Hello";
	     }

}
