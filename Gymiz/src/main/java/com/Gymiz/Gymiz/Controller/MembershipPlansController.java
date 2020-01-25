package com.Gymiz.Gymiz.Controller;

import com.Gymiz.Gymiz.Model.MembershipPlans;
import com.Gymiz.Gymiz.Model.PlanDetails;
import com.Gymiz.Gymiz.Service.MembershipPlansService;
import com.Gymiz.Gymiz.Service.PlanDetailsService;

import com.google.gson.Gson;
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
    @Autowired
    PlanDetailsService planDetailsService;

    @GetMapping("/test")
    public String testPost() {
        List<PlanDetails> planDetails = new ArrayList<>();
        PlanDetails details = new PlanDetails(1L, "a", "a", "a", "a", 12345L, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));
        planDetails.add(details);
        planDetailsService.save(details);
        details = new PlanDetails(2L, "a", "a", "a", "a", 12345L, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));
        planDetails.add(details);
        planDetailsService.save(details);
        MembershipPlans membershipPlans = new MembershipPlans(1L, "Plan1", "description", planDetails);
        System.out.println(membershipPlans.toString());
        membershipPlansService.save(membershipPlans);
        List<MembershipPlans> membershipPlansList = membershipPlansService.findAll();
        Gson result = new Gson();
        return result.toJson(membershipPlansList);
    }
}
