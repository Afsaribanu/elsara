class Student{
	  static  int totalStudents;
	  static String name;
	  static boolean isstdpresent;
	   
	   public static void setStudenTotal(int total){
       System.out.println("total no of students in set method==="+total);
		   totalStudents=total;
	   }
        public static void setname(String n){
			System.out.println("name in set method==="+n);
			name=n;
		}
       public static void setstdpresent (boolean present){
		   System.out.println("is std present in set method==="+present);
		   isstdpresent=present;
		   
	   }		
	   
	   public static int getStudenTotal(){
		   System.out.println("total students in get method==="+totalStudents);
		   return totalStudents;
	   }
	   public static String getname(){
		   System.out.println("name in get method==="+name);
		   return name;
	   }
	   public static boolean getstdpresent(){
		   System.out.println("is std present in get method==="+isstdpresent);
		   return isstdpresent;
	   }
	   
}	  
	   
	   
