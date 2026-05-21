package ru.stavarachi.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameConfig {
    private final Map<Integer, String> PATTERNS = Map.of(
            1, "fullName",
            2, "withPrefix",
            3, "withSuffix",
            4, "onlyName"
    );

    private final List<String> prefixList = List.of(
            "prefix1",
            "prefix2",
            "prefix3"
    );

    private final List<String> nameList = List.of(
            "name1",
            "name2",
            "name3"
    );

    private final List<String> suffixList = List.of(
            "suffix1",
            "suffix2",
            "suffix3"
    );

    public Map<Integer, String> getPATTERNS() {
        return PATTERNS;
    }

    public List<String> getPrefixList() {
        return prefixList;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public List<String> getSuffixList() {
        return suffixList;
    }
}
