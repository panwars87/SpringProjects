package ys.pdev.learning.util;

public enum ResponseStatusEnum {
    SUCCESS("true"),
    FAILED("false");
    private final String status;

    private ResponseStatusEnum(String status) {
       this.status = status;
    }

    public String getStatus() {
       return status;
    }
}
