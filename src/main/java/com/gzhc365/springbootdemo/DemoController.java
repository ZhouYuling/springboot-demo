package com.gzhc365.springbootdemo;

import com.gzhc365.exception.ApiException;
import com.gzhc365.exception.ExceptionResponse;
import com.gzhc365.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

	/**
     * 接收Get请求
	 * @param hello
	 * @return
	 */
	@GetMapping("/demo/{hello}")
	public String sayHello(@PathVariable String hello) {
		switch (hello) {
			case "exception":
				throw new ResourceNotFoundException("资源没有找到");
			case "API":
				throw new ApiException(100, "API异常");
			case "Exception":
				ExceptionResponse exception = new ExceptionResponse(200, "Exception");
				System.out.println(exception.getMessage());
				System.out.println(exception.getCode());
				return "Exception";
			default:
				return hello;
		}
	}

	/**
	 * 接收Post请求
	 * @param hello
	 * @return
	 */
	@PostMapping("/demo/{hello}")
	public String sayPostHello(@PathVariable String hello){
		return hello;
	}

	/**
	 * 能够接收Post和Get请求
	 * @param hello
	 * @return
	 */
	@RequestMapping("/GetAndPost/{hello}")
	public String sayGetAndPostHello(@PathVariable String hello){
		return hello;
	}

}