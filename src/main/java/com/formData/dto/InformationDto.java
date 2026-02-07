package com.formData.dto;

import lombok.*;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class InformationDto {

        private String id;
        private String name;
        private String email;
        private int age;
        private String password;
        private String fatherName;
        private String mobileNumber;
    }
