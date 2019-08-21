package demo.sjdbc.SJDBCDEMO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
      ApplicationContext conxt = new ClassPathXmlApplicationContext("sjdbc.xml");
      StidentDoa s = (StidentDoa)conxt.getBean("studentdao");
      int rs = s.saveStudentInfo(new Student(1,"Anirban"));
      System.out.println(rs);
      Student s1 = new Student();
      s1.setRoll(1);
      int rs1 = s.getStudentInfo(s1);
      System.out.println(rs1);
    }
}
