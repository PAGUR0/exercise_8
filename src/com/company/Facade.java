package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Facade {
    void decide(String str){
        Scanner scanner = new Scanner(System.in);
        String[] string = str.replaceAll("\\s*", "").split("");
        ArrayList<Token> tokens = TokenInitialization.divToken(string);
        System.out.println(Count.expr(tokens));
    }
}
