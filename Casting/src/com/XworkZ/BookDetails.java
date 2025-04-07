package com.XworkZ;

public class BookDetails {
    public void Details(Book book)
    {
        book.Note();
        book.number();
        book.page();
        book.test();
        book.type();
        if(book instanceof ReadingMaterial)
        {
            ReadingMaterial readingMaterial = (ReadingMaterial) book;
            readingMaterial.price();
        }
    }
}
