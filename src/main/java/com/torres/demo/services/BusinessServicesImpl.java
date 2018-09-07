package com.torres.demo.services;


import com.torres.demo.command.BookCommand;
import com.torres.demo.command.UserCommand;
import com.torres.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/9/7
 */
@Service
public class BusinessServicesImpl implements IBusinessServices {

    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public String add() {

        String flag = "success";
        BookCommand book = new BookCommand();
        UserCommand user = new UserCommand();
        book.setId(11111111);
        book.setName("python");

        user.setId(2);
        user.setName("mrwang");
        int result1 =studentMapper.addBook(book);
        int result2 =studentMapper.addUser(user);

        System.out.println("result1="+result1+",result2="+result2);

        return flag;
    }
}
