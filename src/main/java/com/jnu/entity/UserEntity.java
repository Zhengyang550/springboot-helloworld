package com.jnu.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zy
 * @Description: User实体类  lombok使用
 * lombok底层使用字节码技术 ASM 修改字节码文件，生成get和set方法
 * @Date: 2020-2-4
 */
@Slf4j
@Getter
@Setter
public class UserEntity  {

    private String userName;

    private Integer age;

    @Override
    public String toString() {
        return "UserEntity [userName=" + userName + ", age=" + age + "]";
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("zhangsan");
        userEntity.setAge(20);
        System.out.println(userEntity.toString());
        log.info("####我是日志##########");
    }
}
