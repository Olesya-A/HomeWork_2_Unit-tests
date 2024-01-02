package HomeWork_4.Task2;

// У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах
// из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта
// BookRepository.

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testUserServiceWithMockRepository() {

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
}