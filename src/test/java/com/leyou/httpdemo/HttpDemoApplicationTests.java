package com.leyou.httpdemo;

import com.leyou.httpdemo.pojo.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HttpDemoApplication.class)
public class HttpDemoApplicationTests {

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void httpGet() {
		//这里跨域请求了别的项目的数据
		News news = this.restTemplate.getForObject("http://localhost:8080/bbc/27", News.class);
		System.out.println(news);
	}

}
