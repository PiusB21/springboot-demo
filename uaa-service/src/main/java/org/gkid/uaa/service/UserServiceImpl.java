package org.gkid.uaa.service;

import org.gkid.uaa.common.UserType;
import org.gkid.uaa.dto.AddUserDto;
import org.gkid.uaa.entity.UserAccount;
import org.gkid.uaa.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public int addUser(AddUserDto dto) {

        UserAccount user = new UserAccount();

        user.setFirstName(dto.firstName());
        user.setLastName(dto.lastName());
        user.setEmail(dto.email());
        user.setPhone(dto.phone());
        user.setUserType(dto.userType());

        UserAccount savedUser = userRepository.save(user);

        return savedUser.getId();
    }

    @Override
    public boolean updateUser(int userId, AddUserDto dto) {
        return false;
    }

    @Override
    public boolean deleteUser(int userId) {
        return false;
    }

    @Override
    public List<UserAccount> findAllUsers() {
        return List.of();
    }

    @Override
    public Optional<UserAccount> getUserById(int userId) {
        return Optional.empty();
    }

    @Override
    public List<UserAccount> getAllUsersByUserType(UserType userType) {
        return List.of();
    }
}
