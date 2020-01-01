package org.school;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Student harsha = new Student(1, "harsha", 12);
		Student hp = new Student(2, "namitha", 17);
		Student umesh = new Student(3, "umesh", 67);
		Student aish = new Student(4, "aish", 45);
		
		ArrayList<Student> st = new ArrayList<>();
		st.add(umesh);
		st.add(aish);
		st.add(hp);
		st.add(harsha);
		
		teachers aarthi = new teachers(1, "aarthi", 200);
		teachers praveen = new teachers(2, "praveen", 230);
		teachers vinutha = new teachers(3, "vinutha", 270);
		teachers suresh = new teachers(4, "suresh", 290);
		
		
		ArrayList<teachers> tc = new ArrayList<>();
		tc.add(suresh);
		tc.add(praveen);
		tc.add(vinutha);
		tc.add(aarthi);
		
		School sc = new School(st, tc);
		//students paying their individual fees
		hp.payFees(1000);
		umesh.payFees(2000);
		harsha.payFees(3000);
		// the fees paid by students are received by school
	     System.out.println(sc.getAmtEarned());
	     System.out.println();
	     
	     //salary being paid by school to the teachers
	    System.out.println("school pays sal to teachers");
	    aarthi.recieveSal(aarthi.getSal());
	    
	    //remaining amount left after paying to teachers
	    System.out.println(sc.getAmtEarned());
		
		System.out.println(hp);
		System.out.println(aarthi);
	}

}
