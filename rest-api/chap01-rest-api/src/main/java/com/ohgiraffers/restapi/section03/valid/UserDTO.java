package com.ohgiraffers.restapi.section03.valid;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserDTO {
    private int no;
    @NotNull(message = "아이디는 반드시 입력되어야 합니다.")    // null
    @NotBlank(message = "아이디는 공백일 수 없습니다.")   // 공백
    private String id;
    @NotNull(message = "비밀번호는 반드시 입력되어야 합니다.")    // null
    @NotBlank(message = "비밀번호는 공백일 수 없습니다.")   // 공백
    private  String pwd;
    @NotNull(message = "이름은 반드시 입력되어야 합니다.")    // null
    @NotBlank(message = "이름은 공백일 수 없습니다.")   // 공백
    @Size(max = 10, message = "이름은 길이 10을 초과할 수 없습니다.")
    private String name;
    @Past(message = "가입일은 현재보다 과거 날짜가 입력 되어야 합니다.")
    private Date enrollDate;
}
