package book.manage.mapper;

import book.manage.entity.Book;
import book.manage.entity.Student;
import org.apache.ibatis.annotations.Insert;

public interface BookMapper {
    @Insert("insert into student(name, sex, grade) values(#{name}, #{sex}, #{grade})")  //sid 设置了自动递增，所以这里没写
    int addStudent(Student student);
    @Insert("insert into book(bid, title, `desc`, price) values(#{bid}, #{title}, #{desc}, #{price})") //desc是关键字所以需要加 ` `
    int addBook(Book book);
}
