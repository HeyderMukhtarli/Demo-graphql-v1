package com.amigoscode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {
public static  List<Author> authors=Arrays.asList(
        new Author(1,"Heyder"),
        new Author(2,"Mohammad"),
        new Author(3,"Ali"),
        new Author(4,"Ali2")
);

        public static Optional<Author> getAuthorById(Integer id) {
            return authors.stream()
                    .filter(author -> author.id.equals(id))
                    .findFirst();

        }

}
