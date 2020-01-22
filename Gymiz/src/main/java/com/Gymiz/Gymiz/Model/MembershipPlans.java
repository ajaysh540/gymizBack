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
@Table(name="membership_plan")
public class MembershipPlans {
    @Id
    @Column(name="membership_id")
    Long MembershipId;
    @Column(name="membersip_code")
    String MembershipCode;
    @Column(name = "membership_name")
    String MembershipName;
    @Column(name = "membership_status")
    String MembershipStatus;
    @Column(name = "membership_description")
    String MembershipDesc;
    @Column(name = "membership_validity")
    String MembershipValidity;
    @Column(name="membership_grace_period")
    String MembershipGracePeriod;
    @Column(name = "membership_price")
    Long MembershipPrice;
    @Column(name = "membership_effective_from")
    Date MembershipEffectiveFrom;
    @Column(name="membership_expiry_date")
    Date MembershipExpiryDate;
}
