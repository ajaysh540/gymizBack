package com.Gymiz.Gymiz.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @OneToMany(cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
    List<PlanDetails> planDetails;
}
