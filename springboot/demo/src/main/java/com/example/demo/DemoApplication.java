package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(DemoApplication.class, args) ;
      // Gọi Bean
        GameAAA gameAAA = context.getBean(GameAAA.class);
    // Hiển thị tên Bean
        System.out.println("Instance:" + GameAAA.class);
    // Hiển thị phương thức lên cửa số dòng lệnh(Terminal)
        gameAAA.active();
    }
}
