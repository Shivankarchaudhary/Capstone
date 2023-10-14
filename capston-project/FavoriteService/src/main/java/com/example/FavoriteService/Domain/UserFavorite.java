package com.example.FavoriteService.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class UserFavorite {
    @Id
   private String email;
   private List<Restaurant> restaurantList;
   private List<Menu> menuList;
}
