package spring;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;
import spring.model.User;
import spring.service.UserService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(new User("111", "111", "111"));
        userService.add(new User("222", "222", "222"));
        userService.add(new User("333", "333", "333"));
        userService.add(new User("444", "444", "444"));

        List<User> userList = userService.listUsers();
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
