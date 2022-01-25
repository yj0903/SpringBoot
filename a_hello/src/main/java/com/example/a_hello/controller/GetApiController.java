package com.example.a_hello.controller;

import com.example.a_hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path="/hello") // http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }


    // @RequestMapping("/hi") // get, post, put, delete ALL
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get, post, put, delete ALL
    public String hi(){
        return "hi";
    }


    // http://localhost:8080/api/get/path-variable/{nickname}
    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name="id") String pathName){
        System.out.println("PathVariable : "+ pathName);
        return pathName;
    }




    // #1 parameter 변수 미정.
    // http://localhost:8080/api/get/query-param?user=yujin&email=yujin@gmail.com&age=10
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<Integer, String> queryParam){
        // StringBuilder는 String Buffer
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+ " "+ entry.getValue());
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    // #2 parameter 변수 정해짐.
    @GetMapping("query-param2")
    public String queryParam2(
        // parameter 명시.
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+" "+email+" "+age;
    }

    // #3 DTO 이용(강력 추천)
    @GetMapping("query-param3")
    public String queryParam3(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }






}
