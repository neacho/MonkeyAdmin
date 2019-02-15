package com.robovin.admin.web;

import com.robovin.admin.pojo.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renzhenbin@bjgmsk.com
 * @programm MonkeyAdmin
 * @description
 * @date 2019/2/15-14:00
 **/
@RestController
@RequestMapping("/funct/")
public class FunctionController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Page> funct() {
        List<Page> pageList=new ArrayList<>();
        Page page=new Page();
        page.setCode("01");
        page.setUri("/sys/user");
        pageList.add(page);
        List<Page> operate=new ArrayList<>();
        Page page1=new Page();
        page1.setCode("0102");
        Page page2=new Page();
        page2.setCode("0103");
        Page page3=new Page();
        page3.setCode("0104");
        operate.add(page1);
        operate.add(page2);
        operate.add(page3);
        page.setFunctions(operate);
        return pageList;
    }

}
