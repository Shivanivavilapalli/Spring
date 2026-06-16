package springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class productDAO {
private JdbcTemplate template;


public JdbcTemplate getTemplate() {
	return template;
}

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
public String saveData(product p) {
	String qry = "insert into product values(?,?,?)";
	template.update(qry,p.getPid(),p.getPname(),p.getPprice());
	return "Row Created";
}
public List<product> getData() {
	String qry = "select * from product";
	return template.query(qry, new RowMapper<product>() 
	{

		@Override
		public product mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			product p = new product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPprice(rs.getDouble(3));
			return p;
			
		}
		
	});
}
public String updateData(product p) {
	String qry="update product set pname=?,pprice=? where pid=?";
	int r = template.update(qry,p.getPname(),p.getPprice(),p.getPid());
	if(r>0) {
		return "record updated";
	}
	else
		return "product not found";
	
}
public String deleteData(int pid) {
	String qry = "delete from product where pid = ?";
	int r = template.update(qry,pid);
	if(r>0)
			return "value is deleted";
	else
		return "not deleted";
}
}
