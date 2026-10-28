package org.gkid.uaa.service;


import org.gkid.uaa.common.UserType;
import org.gkid.uaa.dto.AddUserDto;
import org.gkid.uaa.entity.UserAccount;

import java.util.List;
import java.util.Optional;

public interface UserService {
    int addUser(AddUserDto dto);
    boolean updateUser(int userId, UserAccount userAccount);
    boolean deleteUser(int userId);
    List<UserAccount> findAllUsers();
    Optional<UserAccount> getUserById(int userId);
    List<UserAccount> getAllUsersByUserType(UserType userType);
}
