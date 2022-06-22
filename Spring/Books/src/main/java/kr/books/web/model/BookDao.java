package kr.books.web.model;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface BookDao {
//		public void update(BookDto bookdto); // 수정
		public void insert(BookDto bookdto); // 등록
//		public void delete(BookDto bookdto); // 삭제
		public List<BookDto> selectAll();   // 전체검색
		public Object selectView(int idx); //상세보기
		public List<BookDto> searchList(int idx);// 책이름 검색

	
}
