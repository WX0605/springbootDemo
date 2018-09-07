package com.torres.demo.mapper;

import com.torres.demo.command.BookCommand;
import com.torres.demo.command.UserCommand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/9/7
 */
@Repository
public interface StudentMapper {

    int addUser(UserCommand book);
    int addBook(BookCommand book);
}
