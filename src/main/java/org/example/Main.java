package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 444444";
        post.patronymic = "Иванович";
        post.phone = "+7(999)999-99-99";
        post.surname = "Иванов";
        post.subscription = "true";

        Post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 5;
        post.birthday.year = 1987;


    }
}