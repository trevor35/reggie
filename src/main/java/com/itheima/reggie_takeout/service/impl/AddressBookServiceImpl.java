package com.itheima.reggie_takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie_takeout.entity.AddressBook;
import com.itheima.reggie_takeout.mapper.AddressBookMapper;
import com.itheima.reggie_takeout.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @Author zou
 * @Date 2024/4/15
 * @Update 2024/4/15
 * @Description
 */

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
