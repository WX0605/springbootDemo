package com.torres.demo.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/9/7
 */
@Setter
@Getter
@ToString
public class BookCommand {
    private int id;
    private String name;
}
