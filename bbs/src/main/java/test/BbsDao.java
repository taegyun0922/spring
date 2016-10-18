package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDao {
	
	@Autowired
	private JdbcTemplate template;
	
	public List<Hello> listForBeanPropertyRowMapper(){
		String query = "SELECT * FROM user";
		return template.query(query, new BeanPropertyRowMapper(bbs.class));
		
	}
	

}
