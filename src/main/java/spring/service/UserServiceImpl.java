package spring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import spring.dao.UserDao;
import spring.model.User;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User get(Long id) {
        return userDao.getById(id)
                .orElseThrow(() -> new RuntimeException("No user with such id " + id));
    }
}
