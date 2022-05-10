package week12;
/* id: int
 * gradeLevel: int
 * school :String
 * courseNumber: int
 * currentCourses: String []
 * --------------------------
 * dropACourse(courseName: String): boolean
 * enroll(courseName: String) : boolean
 * passCourse(courseName: String, grade : double)
 * 
 */
public class Student {

	public class student extends Person {
		static int studentTotal;
		private int id;
		private int gradeLeve;
		private int courseTotal;
		private String [] currentCourses;
		public student() {
			
		}
		public boolean dropACourse(String courseName) {
			if (courseTotal > 0) {
				
				int index = -1;
				for(int i = 0; i < courseTotal; i++) {
					if(currentCourses[i].equalsIgnoreCase(courseName)) {
						index = i;
					}
				}
				if(index > -1) {
					for(int i = index; i < courseTotal-1; i++) {
						currentCourses[i] = currentCourses[i+1];
					}
					courseTotal--;
					currentCourses[courseTotal-1]=null;
					return true;
				}
			}
			return true;
		}
	}
}
