package HomeWork_4.Task2;

// У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах
// из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта
// BookRepository.

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testFindBookById() {

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        String id = "1";
        Book bookExpected = new Book("1", "It", "King");

        when(bookRepository.findById(id)).thenReturn(new Book(id, "It", "King"));
        Book book = bookService.findBookById(id);
        assertEquals(bookExpected.getAuthor(), book.getAuthor());
        assertEquals(bookExpected.getTitle(), book.getTitle());
        verify(bookRepository, times(1)).findById(id);
    }

    @Test
    void testFindAllBooks() {

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        List<Book> expectedBooks = new ArrayList<>();
        Book book1 = new Book("1", "It", "King");
        Book book2 = new Book("2", "Shining", "King");
        expectedBooks.add(book1);
        expectedBooks.add(book2);

        when(bookRepository.findAll()).thenReturn(expectedBooks);
        List<Book> books = bookService.findAllBooks();
        assertEquals(expectedBooks.get(0), books.get(0));
        verify(bookRepository, times(1)).findAll();
    }
}