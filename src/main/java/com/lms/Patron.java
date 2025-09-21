package com.lms;

import java.util.List;

public class Patron {

    private String name;
    private String id;
    private List<String> borrowingHistory;

    void updateName(String name){
        this.name = name;
    }


}
