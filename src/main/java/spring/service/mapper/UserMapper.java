package spring.service.mapper;

import org.springframework.stereotype.Component;
import spring.dto.UserResponseDto;
import spring.model.User;

@Component
public class UserMapper {
    public UserResponseDto convertUserToDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setName(user.getName());
        userResponseDto.setSurname(user.getSurname());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }

    public User convertToUser(UserResponseDto userResponseDto) {
        User user = new User();
        user.setName(userResponseDto.getName());
        user.setSurname(userResponseDto.getSurname());
        user.setEmail(userResponseDto.getEmail());
        return user;
    }
}
