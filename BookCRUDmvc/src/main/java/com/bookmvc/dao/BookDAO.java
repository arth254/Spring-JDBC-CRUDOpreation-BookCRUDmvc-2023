package com.bookmvc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bookmvc.model.Book;

public class BookDAO {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    

	//select all
		public List<Book> listAllBooks() {
			String sql ="select * from book";
			return template.query(sql,new RowMapper<Book>() {

				@Override
				public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
					Book book =new Book();
					book.setId(rs.getInt(1));
					book.setTitle(rs.getString(2));
					book.setAuthor(rs.getString(3));
					book.setprice(rs.getFloat(4));
					return book;
				}
				
			});
		}
		//select by id
		public Book getBookById(int id) {
			String sql = "select * from book where id=?";
			return template.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<Book>(Book.class));
		}
		//insert
	public int insertBook(Book b1) {
		String sql = "insert into book(title,author,price)values(?,?,?)";
		return template.update(sql,b1.getTitle(),b1.getAuthor(),b1.getprice());
		}
		//update
	public int updateBook(Book b1) {
		String sql = "update book set title=?,author=?,price=? where id=?";
		return template.update(sql,b1.getTitle(),b1.getAuthor(),b1.getprice(),b1.getId());
	}


//		//delete
	public int deleteBook(int id) {
		String sql= "delete from book where id=?";
		return template.update(sql,id);
	}
}
