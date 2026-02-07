package com.formData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Information {

    @Id
    private String id;

    @NotBlank
    private String name;

    @Email
    private String email;

    @Min(1)
    private int age;

    @NotBlank
    private String password;

    @NotBlank
    private String fatherName;

    private String mobileNumber;
}

