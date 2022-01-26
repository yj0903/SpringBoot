package com.example.b_postapi.controller;


import com.example.b_postapi.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostAPIController {

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){

        // #1
//        requestData.entrySet().forEach(stringObjectEntry ->{
//            System.out.println("key:"+stringObjectEntry.getKey());
//            System.out.println("value:"+stringObjectEntry.getValue());
//        });

        // #2 인텔리제이가 추천해준 간결한 코드(alt+enter)
//        requestData.forEach((key, value) -> {
//            System.out.print("key:" + key);
//            System.out.println(", value:" + value);
//        });



        System.out.println("requestData: " + requestData);

    }
}
