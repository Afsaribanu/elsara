class StudentRunner{
	public static void main(String []args){
		Student.setStudenTotal(10);
		Student.setname("Abdul");
		Student.setstdpresent(true);
		int getTotalMethod=Student.getStudenTotal();
		String getn=Student.getname();
		boolean getpresent=Student.getstdpresent();
		
		System.out.println("total student in==="+getTotalMethod);
		System.out.println("name in==="+getn);
		System .out.println("is std present in==="+getpresent);
		
	}
}