package com.Gymiz.Gymiz.Service;

import com.Gymiz.Gymiz.Model.MembershipPlans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MembershipPlansService extends JpaRepository<MembershipPlans,Long> {
}
