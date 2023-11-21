package com.fastcam.programming.dmaker.type;

import lombok.Getter;


@Getter
public enum DeveloperLevel {
    NEW("신입 개발자"),
    JUNIOR("주니어 개발자"),
    JUNGNIOR("중니어 개발자"),
    SENIOR("시니어 개발자");


    private final String value;


    DeveloperLevel(String value) {
        this.value = value;
    }

    public boolean isNew(){
        return this.equals(NEW);
    }
    public boolean isJunior(){
        return this.equals(JUNIOR);
    }

    public boolean isJungnior(){
        return this.equals(JUNGNIOR);
    }

    public boolean isSenior(){
        return this.equals(SENIOR);
    }

}
