package ru.mirea.task4;

import java.util.Scanner;

public class TestAuthor
{
    public static void main(String[] args)
    {
        String name, email1, email2;
        char gender;
        Scanner cin = new Scanner(System.in);
        System.out.print("Напишите имя: ");
        name = cin.next();
        System.out.print("Напишите почту: ");
        email1 = cin.next();
        System.out.print("Напишите свой гендер (М/Ж): ");
        String genderStr = cin.next();
        gender = genderStr.charAt(0);
        Author ob = new Author(name, email1, gender);
        ob.getName();
        ob.getEmail();
        String  info = ob.toString();
        System.out.print(info);
    }
}