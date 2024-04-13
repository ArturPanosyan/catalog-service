package am.itspace.catalogservice;

import am.itspace.catalogservice.config.BookShopProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final BookShopProperties bookshopProperties;

    public HomeController(BookShopProperties bookshopProperties) {
        this.bookshopProperties = bookshopProperties;
    }

    @GetMapping("/")
    public String getGreeting(){
        return "Welcome to the Bookshop Catalog Service";
    }

}
