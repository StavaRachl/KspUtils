package ru.stavarachi.service;

import java.util.List;
import java.util.Random;

public class RandomService {
    private final Random RANDOM = new Random();

    public String randomPrefix(List<String> prefixList) {
        return prefixList.get(RANDOM.nextInt(prefixList.size()));
    }

    public String randomName(List<String> nameList) {
        return nameList.get(RANDOM.nextInt(nameList.size()));
    }

    public String randomSuffix(List<String> suffixList) {
        return suffixList.get(RANDOM.nextInt(suffixList.size()));
    }
}
