package com.reports.tests;

import com.api.helpers.PostsServiceHelper;
import com.api.model.Posts;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.List;

public class TestGETPost {

    PostsServiceHelper postsServiceHelper;

    @BeforeClass
    public void init(){
        postsServiceHelper = new PostsServiceHelper();


    }

    @Test
    public void testGETallPosts(){
        System.out.println("executed");
        List<Posts> postsList = postsServiceHelper.getAllPosts();
        Assert.assertNotNull(postsList,"Posts is not Emprty");
        Assert.assertFalse(postsList.isEmpty(),"Posts is not Empty");


    }
}
