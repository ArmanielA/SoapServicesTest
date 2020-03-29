package de.armgdon.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class StringsService {

    @WebMethod
    public String reverseString(String input){
        StringBuilder builder = new StringBuilder(input);
        input = builder.reverse().toString();
        return input;
    }
}
