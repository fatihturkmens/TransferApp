package com.transferapp.transferapp.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BayernDto {

    @NotEmpty(message = "İsim boş bırakılamaz")
    @Size(min = 2,max = 20)
    private String name;


    @NotEmpty(message = "Soyisim boş bırakılamaz")
    @Size(min = 2,max = 20)
    private String surname;

    @NotEmpty(message = "Nation boş bırakılamaz")
    @Size(min = 2,max = 20)
    private String nation;

    @NotEmpty(message = "Takım boş bırakılamaz")
    @Size(min = 2,max = 20)
    private String team;

    private Integer age;

    @NotEmpty(message = "Position boş bırakılamaz")
    @Size(min = 2,max = 20)
    private String position;

    private Long trasfervalue;
}
