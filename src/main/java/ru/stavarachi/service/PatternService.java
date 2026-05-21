package ru.stavarachi.service;

import ru.stavarachi.model.RocketName;

public class PatternService {
    public RocketName fullName(String prefix, String name, String suffix) {
        return new RocketName(prefix, name, suffix);
    }

    public RocketName withPrefix(String prefix, String name) {
        return new RocketName(prefix, name, null);
    }

    public RocketName withSuffix(String name, String suffix) {
        return new RocketName(null, name, suffix);
    }

    public RocketName onlyName(String name) {
        return new RocketName(null, name, null);
    }
}
