package com.recipe.entites;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

    private int user_id;

    private String userName;

    private String email;

    private Date createdAt;


}
