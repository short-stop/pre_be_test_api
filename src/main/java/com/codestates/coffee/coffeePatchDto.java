package com.codestates.coffee;

import com.codestates.member.NotSpace;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class coffeePatchDto {

    private long coffeeId;

    @NotSpace(message = "이름은 공백이 아니어야 합니다.")
    private String korName;

    @NotNull(message = "워드 사이에 한칸의 공백만 포함")
    @Pattern(regexp = "/^[a-zA-Z]*$/",
            message = "영문만 가능합니다.")
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

    public void setMemberId(long coffeeId) {
        this.coffeeId = coffeeId;
    }
}
