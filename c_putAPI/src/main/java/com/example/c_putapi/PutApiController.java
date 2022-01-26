package com.example.c_putapi;


import com.example.c_putapi.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public void put(@RequestBody PostRequestDto postRequestDto, @PathVariable Long userId){
        System.out.println(">>userId: "+userId);
        System.out.println(">>postRequestDto: "+postRequestDto);
    }
}
