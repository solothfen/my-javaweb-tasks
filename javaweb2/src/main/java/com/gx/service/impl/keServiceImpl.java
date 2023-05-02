package com.gx.service.impl;




import com.gx.dao.kedao;
import com.gx.domain.ke;
import com.gx.service.keService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("keService")
public class keServiceImpl implements keService{

    @Autowired
    private kedao kedao;


    public List<ke> findAll() {
        System.out.println("查询所有课程");
        return kedao.findAll();
    }


    public int saveke(ke ke) {
        System.out.println("插入课程");
        return kedao.saveke(ke);  //调用service中的saveke(ke)方法
    }

    public int updateke(ke ke){
        System.out.println("修改课程");
        return kedao.updateke(ke);
    }

    public List<ke> find(String ke_name){
        System.out.println("查询课程");
        return kedao.find(ke_name);
    }

    public int deleteke(String ke_name){
        System.out.println("删除课程");
        return kedao.deleteke(ke_name);
    }

}
