package ru.pdd.rule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pdd.rule.model.Rule;

public interface RuleRepository extends JpaRepository<Rule, Long> {
}
