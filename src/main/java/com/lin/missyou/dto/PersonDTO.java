package com.lin.missyou.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
public class PersonDTO {
    private String name;
    private Integer age;
}
