package book.manage.entity;

import lombok.Data;

@Data
public class Book {
    final int bid;  //bid原本没有final
    final String title;
    final String desc;
    final double price;
}
