package com.Gymiz.Gymiz.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "membership_plan")
public class MembershipPlans {
    @Id
    @Column(name = "Id")
    Long MembershipId;
    @Column(name = "membership_name")
    String MembershipName;
    @Column(name = "membership_description")
    String MembershipDesc;
    @Column(name = "membership_effective_from")
    Date membershipEffectiveFrom;
    @Column(name = "membership_expiry_date")
    Date membershipExpiryDate;
    @OneToMany(cascade = CascadeType.ALL)
            @JoinTable(name = "plan_details")
    List<PlanDetails> planDetails;
}
