package com.library.backend.Entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class registrationRequest {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
