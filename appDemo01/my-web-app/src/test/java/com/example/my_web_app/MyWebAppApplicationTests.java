package com.example.my_web_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mywebapp.MyWebAppApplication;

@SpringBootTest(classes = MyWebAppApplication.class)  // Chỉ định lớp cấu hình chính
class MyWebAppApplicationTests {

	@Test
	void contextLoads() {
		// Kiểm tra xem ứng dụng có thể khởi động thành công hay không
	}

}
