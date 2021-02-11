package spring.service.mapper;

import org.springframework.stereotype.Component;
import spring.dto.UserResponseDto;
import spring.model.User;

@Component
public class UserMapper {
    public UserResponseDto convertUserToDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());
        userResponseDto.setSurname(user.getSurname());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }
}
