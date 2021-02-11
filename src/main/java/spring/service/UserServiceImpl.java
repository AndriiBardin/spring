package spring.service;

import java.util.List;
import java.util.Optional;
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
    public Optional<User> get(Long id) {
        return userDao.getById(id);
    }
}
