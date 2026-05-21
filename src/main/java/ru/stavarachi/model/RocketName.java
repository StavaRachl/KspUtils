package ru.stavarachi.model;

public class RocketName {
    private String prefix;
    private String name;
    private String suffix;

    public RocketName(String prefix, String name, String suffix) {
        this.prefix = prefix;
        this.name = name;
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
