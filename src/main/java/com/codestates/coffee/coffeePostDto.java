package com.codestates.coffee;

import com.codestates.member.NotSpace;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class coffeePostDto {

    @NotSpace(message = "이름은 공백이 아니어야 합니다.")
    private String korName;

    @NotBlank(message = "공백만으로 구성되지 않아야 합니다. ")
    @Pattern(regexp = "^([a-zA-Z]+)(\\s?[a-zA-Z])*$",
            message = "영문만 가능합니다. 워드 사이에 한칸의 공백(스페이스)만 포함 될 수 있습니다.\n")
    private String engName;

    @Range(min=100, max = 50000)
    private int price;

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public int getPrice() {
        return price;
    }
}
