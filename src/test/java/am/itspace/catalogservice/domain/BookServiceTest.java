package am.itspace.catalogservice.domain;
import java.util.Optional;

import am.itspace.catalogservice.exception.BookAlreadyExistsException;
import am.itspace.catalogservice.exception.BookNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
     void whenBookToCreateAlreadyExistsThenThrows() {

    }

    @Test
    void whenBookToReadDoesNotExistThenThrows() {

    }
}