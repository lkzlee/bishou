package com.lkzlee.bishou;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author:lkzlee
 * @date: 2018/8/31 15:27
 * @Desc: 首页调试controller
 */
@Log4j2
@RestController
public class IndexController
{
	@RequestMapping("/index")
	public String index(String p)
	{
		log.info("--start request index,param p={}", p);
		return "Bi Shou Hello";
	}
}
