package com.revature.mikeworks.models;

import com.revature.mikeworks.enums.ERSUserRoles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class ERSUser {
    @Getter @Setter private Long userID;
    @Getter @Setter private String username;
    private PHash password;
    @Getter @Setter private String firstname;
    @Getter @Setter private String lastname;
    @Getter @Setter private String email;
    @Getter @Setter private ERSUserRoles role;
}
