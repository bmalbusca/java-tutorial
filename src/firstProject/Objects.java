package firstProject;



import javax.swing.*; //window creation  


public class Objects {

		public static void main(String[] args) {
			JFrame w = new JFrame(); //save new object into variable
		
			ClassPerson Bruno = new ClassPerson("Person"); //Bruno.name= "Bruno";
			set(Bruno,"Bruno");
			Bruno.set_age(20);
			
			w.setTitle(Bruno.name);
			w.setVisible(true);
			w.setSize(800,600);
			
			JLabel l = new JLabel();
			l.setText("Bruno");
			w.add(l);
		}
	 
		public static void set(ClassPerson P, String name) {
			P.name = name;
		}
	
	
}
