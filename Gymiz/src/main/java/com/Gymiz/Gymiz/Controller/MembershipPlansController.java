package com.Gymiz.Gymiz.Controller;

import com.Gymiz.Gymiz.Model.MembershipPlans;
import com.Gymiz.Gymiz.Service.MembershipPlansService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;


@Component
@RestController
@RequestMapping("/gymiz")
public class MembershipPlansController {
    @Autowired
    MembershipPlansService membershipPlansService;

    @GetMapping("/test")
    public JSONObject testPost() {
        MembershipPlans membershipPlans = new MembershipPlans("a", 1L, "a", "a", "a", "a", "a", 12345L, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));
        membershipPlansService.save(membershipPlans);
        List<MembershipPlans> membershipPlansList = membershipPlansService.findAll();
        JSONObject result = new JSONObject();
        for(MembershipPlans plans : membershipPlansList){
            JSONObject jsonPlan = new JSONObject();
            JSONObject jsonMembership = new JSONObject();
            jsonPlan.put("membership_id",plans.getMembershipId());
            jsonPlan.put("membership_code",plans.getMembershipCode());
            jsonPlan.put("membership_description",plans.getMembershipDesc());
            jsonPlan.put("membership_price",plans.getMembershipPrice());
            jsonPlan.put("membership_status",plans.getMembershipStatus());
            jsonPlan.put("membership_effective_from",plans.getMembershipEffectiveFrom());
            jsonPlan.put("membership_expiry_date",plans.getMembershipExpiryDate());
            jsonPlan.put("membership_grace_period",plans.getMembershipGracePeriod());
            jsonPlan.put("membership_validity",plans.getMembershipValidity());
            jsonMembership.put("membership_name",plans.getMembershipName());
            jsonMembership.put("membership_details",jsonPlan);
            result.put("membership_plan",jsonMembership);
        };
        return result;
    }
}
