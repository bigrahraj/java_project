/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.pojo;

/**
 *
 * @author ashut
 */
public class CurrentUser {
    
    private static String name;
    private static String userId;
    private static String id;
    private static String type;
    

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        CurrentUser.name = name;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        CurrentUser.userId = userId;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        CurrentUser.id = id;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        CurrentUser.type = type;
    }
    
}
