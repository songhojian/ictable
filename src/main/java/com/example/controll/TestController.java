package com.example.controll;



import com.example.entity.Test;
import com.gitee.sunchenbin.mybatis.actable.manager.system.SysMysqlCreateTableManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mobile")
public class TestController {
    @Autowired
    SysMysqlCreateTableManagerImpl sysMysqlCreateTableManager;
    @PostMapping("/hi")
    public void change(){
        sysMysqlCreateTableManager.createMysqlTableApiObj("upforce", Test.class);
        System.out.println("hi");
    }
    @PostMapping("/hiPack")
    public void changePack(){
        sysMysqlCreateTableManager.createMysqlTableApiPack("upforce", "com.example.origin");
        System.out.println("hi");
    }
}
