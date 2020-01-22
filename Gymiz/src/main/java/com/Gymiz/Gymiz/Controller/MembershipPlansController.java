package com.Gymiz.Gymiz.Controller;

import com.Gymiz.Gymiz.Model.MembershipPlans;
import com.Gymiz.Gymiz.Service.MembershipPlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Component
@RestController
@RequestMapping("/gymiz")
public class MembershipPlansController {
    @Autowired
    MembershipPlansService membershipPlansService;

    @GetMapping("/test")
    public void testPost(){
        MembershipPlans membershipPlans=new MembershipPlans(1L,"a","a","a","a","a","a",12345L,new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()));
        membershipPlansService.save(membershipPlans);
        List<MembershipPlans> membershipPlansList=membershipPlansService.findAll();
        membershipPlansList.forEach(System.out::println);

    }
}
