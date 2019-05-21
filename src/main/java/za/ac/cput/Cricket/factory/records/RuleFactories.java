package za.ac.cput.Cricket.factory.records;

import za.ac.cput.Cricket.domain.records.Rules;

public class RuleFactories {
    public static Rules getRule(String rules)
    {
        return new Rules.Builder()
                .rules(rules)
                .build();
    }
}
