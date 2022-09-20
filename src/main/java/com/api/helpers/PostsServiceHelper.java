package com.api.helpers;

import com.api.contants.EndPoints;
import com.api.model.Posts;
import com.api.utils.ConfigManager;
import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.List;

public class PostsServiceHelper {
    //We need this to read config value
    //Rest assured about the URL , Port
    //Making a GET Request  on this URL and send the data to TestGETPosts

//    private static final String Base_URL = ConfigManager.getInstance().getString("Base_url");
      private static final String Base_URL="https://jsonplaceholder.typicode.com/";
    public PostsServiceHelper(){
        RestAssured.baseURI=Base_URL;
        RestAssured.useRelaxedHTTPSValidation();

    }

    public List<Posts> getAllPosts(){
        Response response=RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .get(EndPoints.GET_POSTS)
                .andReturn();

        System.out.println(response.asString());


        Type type = new TypeReference<List<Posts>>(){}.getType();

        List<Posts> postsList= response.as(type);

        System.out.println(getAllPosts());

        return postsList;
    }

}
