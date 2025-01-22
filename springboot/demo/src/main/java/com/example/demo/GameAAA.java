package com.example.demo;

import org.springframework.stereotype.Component;

// Dùng Component để đánh dấu cho Spring Boot biết đây là một bean
@Component
public class GameAAA implements GammingPhone{
    // Sử dụng Annotation @Override để cho biết class này ghi đè thuộc tính từ 1 lớp khác
@Override
        public void active(){
            System.out.println("Showcase");
        }
}
