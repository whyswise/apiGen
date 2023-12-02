package com.api.gen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import springfox.documentation.annotations.ApiIgnore;

@Slf4j
@RestController
public class ApiGenController {


	@ApiIgnore
	@RequestMapping(value="/")
	public String index(ModelMap model, HttpSession session) {
		return "home";
	}

	@ApiIgnore
	@PostMapping(value="/event")
	@ResponseBody
	public String events(String title, String content, String reply, String addr, String banana, String rt, String tag) {
		StringBuilder sb = new StringBuilder();
		sb.append("```@everyone<br>**[");
		sb.append(title);
		sb.append("]**<br><br>");
		sb.append(content.replace("\n","<br>"));
		sb.append("<br><br>**+");
		sb.append(banana);
		sb.append("BANANA:banana:**<br>:one:");
		sb.append(rt);
		sb.append("<br>:two:");
		sb.append(reply);
		if(!"".equals(tag)) {
			sb.append(" 다음 태그 포함 : `");
			sb.append(tag);
		}
		sb.append("`<br>:three:#🎫ㅣ이벤트채굴 에 링크 투척 ㄱ ㄱ<br><br>");
		sb.append(addr);
		sb.append("```");


		return sb.toString();
	}


}
