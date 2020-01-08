package com.springboot.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.CatelogItem;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogResource {
	
	@RequestMapping("/{userId}")
	public List<CatelogItem> getCatelog(String userId) {
		return Collections.singletonList(new CatelogItem("Ram", "Ram", 1));
	}
}
