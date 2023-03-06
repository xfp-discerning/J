package com.xfp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.view.tiles3.SpringLocaleResolver;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int age;
    private String name;
    private String sex;
}
