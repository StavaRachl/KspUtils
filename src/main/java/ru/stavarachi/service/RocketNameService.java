package ru.stavarachi.service;

import ru.stavarachi.config.NameConfig;
import ru.stavarachi.model.RocketName;

public class RocketNameService {
    NameConfig nameConfig = new NameConfig();
    PatternService patternService = new PatternService();
    RandomService randomService = new RandomService();

    public String generateName(int key) {
        String pattern = nameConfig.getPATTERNS().get(key);
        String prefix = randomService.randomPrefix(nameConfig.getPrefixList());
        String name = randomService.randomPrefix(nameConfig.getNameList());
        String suffix = randomService.randomPrefix(nameConfig.getSuffixList());
        RocketName rocketName;
        String rocket;

        switch (pattern) {
            case "fullName":
                rocketName = patternService.fullName(prefix, name, suffix);
                rocket = rocketName.getPrefix() + " " + rocketName.getName() + " " + rocketName.getSuffix();
                return rocket;
            case "withPrefix":
                rocketName = patternService.withPrefix(prefix, name);
                rocket = rocketName.getPrefix() + " " + rocketName.getName();
                return rocket;
            case "withSuffix":
                rocketName = patternService.withSuffix(name, suffix);
                rocket = rocketName.getName() + " " + rocketName.getSuffix();
                return rocket;
            case "onlyName":
                rocketName = patternService.onlyName(name);
                rocket = rocketName.getName();
                return rocket;
        }
        return null;
    }
}
