
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Person {
    String surnameSonavani56480, firstnameRashi56480, zipcode56480, streetname56480, city56480;


    public void Initialize() throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("First name: ");
        firstnameRashi56480  = br.readLine();
        System.out.println("Last name: ");
        surnameSonavani56480  = br.readLine();
        System.out.println("street name: ");
        streetname56480 = br.readLine();
        System.out.println("City: ");
        city56480 = br.readLine();
        System.out.println("zipcode: ");
        zipcode56480 = br.readLine();

    }

    public void print()
    {
        System.out.println("First name: " + firstnameRashi56480 );
        System.out.println("last name: " + surnameSonavani56480 );
        System.out.println("street name: " + surnameSonavani56480 );
        System.out.println("city: " + surnameSonavani56480 );
        System.out.println("zipcode: " + surnameSonavani56480 );

    }
}

class staff extends Person
{
    String education, position;

    public void Initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Education: ");
        education = br.readLine();
        System.out.println("Position: ");
        position = br.readLine();
    }

    public void print1(){

        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}
