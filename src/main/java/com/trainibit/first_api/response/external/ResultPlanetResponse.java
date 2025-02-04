package com.trainibit.first_api.response.external;

<<<<<<< HEAD
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
=======
import lombok.Data;

@Data
>>>>>>> c572bc0 (primera api)
public class ResultPlanetResponse {
    private PropertiesResultPlanetResponse properties;
    private String description;
    private String _id;
    private String uid;
    private int __v;
}