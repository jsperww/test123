package com.test.bean;

import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(exclude = "phone")
@EqualsAndHashCode
@NoArgsConstructor(staticName = "of")
public class Person {
    @NotNull private String name;
    private String sex;
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
