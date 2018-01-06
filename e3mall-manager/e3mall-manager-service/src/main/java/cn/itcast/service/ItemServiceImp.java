package cn.itcast.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImp implements ItemService{
	@Resource
    private TbItemMapper tbItemMapper;
	@Override
	public TbItem findItemById(Long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}
    
}
