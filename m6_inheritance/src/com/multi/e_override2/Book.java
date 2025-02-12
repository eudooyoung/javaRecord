package com.multi.e_override2;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);

//        bk1.equals(bk3)
//        this(현재객체)           vs        obj(전달 받은 비교대상 )
//        자료형 : Book                     Object

        if (this == obj) return true;

//        자바 16버전 이상
//        **문법 체크**
//        instanceof: 실제 인스턴스가 원하는 타입이 맞는지 비교
        if (!(obj instanceof Book other)) { // obj의 타입이 Book 타입이 아니면 false를 반환
//            **instanceof 확인
            return false;
        }

        return this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.price == other.price;
    }

//    자바 15버전 이하:
//        if (!(obj instanceof Book)) {
//        return false;
//     }
//
//     // obj를 Book 타입으로 형변환하고, 필드 비교
//     Book other = (Book) obj;
//     return this.title.equals(other.title) &&
//           this.author.equals(other.author) &&
//           this.price == other.price;

    @Override
    public int hashCode() {

        return (title + author + price).hashCode(); //String 에서 정의 해시코드를 받아서 리턴

        //return Objects.hash(title, author, price);
        //주어진 매개값들로 배열을 생성하고 arrays.hashcode(Object[])를
        //호출해서 해쉬코드를 얻고 이값을 리턴해줌
    }
}
