package demo.sjdbc.SJDBCDEMO;

import org.springframework.jdbc.core.JdbcTemplate;

public class StidentDoa {
 private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public int saveStudentInfo(Student s) {
	String query = "Insert into Student values (" + s.getRoll() + "," + s.getName() + ")";
	return jdbcTemplate.update(query);
}

public int getStudentInfo(Student s) {
	String query = "Select * from Student Where Roll =" + s.getRoll();
	return jdbcTemplate.update(query);
	
}
}
