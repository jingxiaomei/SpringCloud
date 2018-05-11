package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")//抑制警告
@NoArgsConstructor//生成一个无参数的构造方法
@Data//相当于getset
@Accessors(chain = true)//可以使用链式
public class Dept implements Serializable // 必须序列化
{
    private Long 		deptno; // 主键
    private String 		dname; // 部门名称
    private String 		db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库


    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}

