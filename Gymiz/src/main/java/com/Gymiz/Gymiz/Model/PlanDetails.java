package com.Gymiz.Gymiz.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "plan_detail")
public class PlanDetails {
    @Id
    @Column(name = "plan_id")
    Long PlanId;
    @Column(name = "plan_code")
    String PlanCode;
    @Column(name = "plan_status")
    String PlanStatus;
    @Column(name = "plan_validity")
    String PlanValidity;
    @Column(name = "plan_grace_period")
    String PlanGracePeriod;
    @Column(name = "plan_price")
    Long PlanPrice;
    @Column(name = "plan_effective_from")
    Date PlanEffectiveFrom;
    @Column(name = "plan_expiry_date")
    Date PlanExpiryDate;
}
