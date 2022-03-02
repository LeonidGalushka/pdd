package ru.pdd.rule.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pdd.rule.model.Rule;
import ru.pdd.rule.repository.RuleRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RuleServiceImpl implements RuleService {

    private final RuleRepository ruleRepository;

    @Override
    public List<Rule> getAllRules() {
        return ruleRepository.findAll();
    }
}
