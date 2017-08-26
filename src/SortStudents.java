import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String fileName = "src/students.txt";
	
		 List<Student> studentList = new ArrayList<Student>(); 
		 FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			try{
				fileReader = new FileReader(fileName);
				bufferedReader = new BufferedReader(fileReader);
				String lineContent;
				while((lineContent = bufferedReader.readLine()) != null) {
					Scanner in = new Scanner(lineContent);
					if(in.hasNextInt()){
						int id = in.nextInt();
						String name = in.next();
						double cpa = in.nextDouble();
						Student student = new Student(id,name,cpa);
						studentList.add(student);
					}
					in.close();
				}
				Collections.sort(studentList, new Comparator<Student>() {
		              @Override
		               public int compare(Student s1, Student s2) {
		                    if(s2.getGPA()>s1.getGPA()){
		                        return 1;
		                    }else if(s2.getGPA()<s1.getGPA()){
		                        return -1;
		                    }
		                    return s1.getName().compareTo(s2.getName());
		                }
		        });
		      
		         for(Student st: studentList){
		         System.out.println(st.getName());
		      }
				
			}catch (Exception e) {
				 e.printStackTrace();
			}finally{
				try {
					if (bufferedReader != null)
						bufferedReader.close();

					if (fileReader != null)
						fileReader.close();
					

				} catch (IOException ex) {
					ex.printStackTrace();
				}

		 }
	}
}
