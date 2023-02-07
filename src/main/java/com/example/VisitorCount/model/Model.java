package com.example.VisitorCount.model;

public class Model {
    private int count;
    private String user;

    public Model(String user,int count) {
        this.count = count;
        this.user = user;
    }

    public int getCount() {
        return count;
    }

    public String getUser() {

        return user;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Model{" +
                "count=" + count +
                ", user='" + user + '\'' +
                '}';
    }
}
