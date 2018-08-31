package com.lkzlee.bishou;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author:lkzlee
 * @date: 2018/8/31 15:27
 * @Desc: 首页调试controller
 */
@RestController
public class IndexController
{
	@RequestMapping("/index")
	public String index()
	{
		return "Bi Shou Hello";
	}
}
