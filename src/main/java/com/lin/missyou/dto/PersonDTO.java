package com.lin.missyou.dto;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class PersonDTO {
    @NonNull
    private String name;
    private Integer age;
}
