package com.bl4ck.tinytodolist.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class server01 {

    @GetMapping("/pruebita")
    public List<Integer> prueba(@RequestParam(defaultValue = "3") String n){
        List lista = new ArrayList<Integer>();
        try{
            Integer n1 = Integer.parseInt(n);

            for(;n1 > 0; n1--){
                lista.add(n1);
            }
        }
        catch (NumberFormatException ex){
           ex.printStackTrace();
        }
        finally{
            return lista;
        }
    }

}
