package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Rules;

public class RuleFactories {
    public static Rules getRule(String rules)
    {
        return new Rules.Builder()
                .rules(rules)
                .build();
    }
}
