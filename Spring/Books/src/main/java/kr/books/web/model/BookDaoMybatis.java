package kr.books.web.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoMybatis implements BookDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	
	public BookDaoMybatis() {}
	
	public BookDaoMybatis(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

//	@Override
//	public void update(BookDto bookdto) {
//		sqlSessionTemplate.update("update", bookdto);		
//	}

	@Override
	public void insert(BookDto BookDto) {
		sqlSessionTemplate.insert("insert", BookDto);		
	}

//	@Override
//	public void delete(BookDto bookdto) {
//		sqlSessionTemplate.update("delete", bookdto);
//	}

	@Override
	public List<BookDto> selectAll() {
		return sqlSessionTemplate.selectList("list");
	}

	@Override
	public Object selectView(int idx) {
		return sqlSessionTemplate.selectOne("selectView", idx);
	}

//	@Override
//	public List<BookDto> searchList(int idx) {
//		return sqlSessionTemplate.selectList("search", idx);
//	}

}
