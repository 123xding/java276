package cn.itcast.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.pojo.TbItem;
import cn.itcast.service.ItemService;

@Controller
public class ItemController {
	@Resource
	private ItemService itemService;
	@RequestMapping("item/{itemId}")
	@ResponseBody
    public TbItem fingItemById(@PathVariable Long itemId){
    	TbItem tbItem=itemService.findItemById(itemId);
    	return tbItem;
    }
}
