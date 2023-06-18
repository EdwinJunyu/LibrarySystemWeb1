package book.manage;

import book.manage.entity.Book;
import book.manage.entity.Student;
import book.manage.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(System.in)){
            while(true){
                System.out.println("=================");
                System.out.println("1.录入学生信息");
                System.out.println("2.录入书籍信息");
                System.out.println("输入您想要执行的操作(输入其他任意数字推出)：");
                int input;
                try {
                    input = scanner.nextInt();
                }catch (Exception e){
                    return;
                }
                scanner.nextLine();
                switch (input){
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        return;
                }
            }
        }
    }
    private static void addStudent(Scanner scanner){
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生性别（男/女）：");
        String sex = scanner.nextLine();
        System.out.println("请输入学生年级");
        String grade = scanner.nextLine();
        int g = Integer.parseInt(grade);
        Student student = new Student(name, sex, g);
    }
}




//SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
//try(SqlSession sqlSession = factory.openSession(true)){
//    BookMapper mapper = sqlSession.getMapper(BookMapper.class);
//    System.out.println(mapper.addBook (new Book(111, "Java", "测试", 10)));
//}