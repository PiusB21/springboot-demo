package org.gkid.uaa.dto;

import org.gkid.uaa.common.UserType;

public record AddUserDto(
        String firstName,
        String lastName,
        String email,
        String phone,
        UserType userType
) {}
