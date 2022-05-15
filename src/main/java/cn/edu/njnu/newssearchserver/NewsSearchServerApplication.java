package cn.edu.njnu.newssearchserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsSearchServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsSearchServerApplication.class, args);
	}

}
