package com.projetowebservice.course.config;

import com.projetowebservice.course.entities.Category;
import com.projetowebservice.course.entities.Order;
import com.projetowebservice.course.entities.Products;
import com.projetowebservice.course.entities.User;
import com.projetowebservice.course.entities.enums.OrderStatus;
import com.projetowebservice.course.repositories.CategoryRepositories;
import com.projetowebservice.course.repositories.OrderRepository;
import com.projetowebservice.course.repositories.ProductRepositories;
import com.projetowebservice.course.repositories.UserRepositories;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepositories userRepositories;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepositories categoryRepositories;

    @Autowired
    private ProductRepositories productRepositories;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Compurtes");


        Products p1 = new Products(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Products p2 = new Products(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Products p3 = new Products(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Products p4 = new Products(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Products p5 = new Products(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        
        categoryRepositories.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepositories.saveAll(Arrays.asList(p1,p2,p3,p4,p5));



        userRepositories.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}
