package com.san.stum.common;

public class SysResult {
    private boolean result;
    private String data;
    public boolean isResult() {
        return result;
    }
    public void setResult(boolean result) {
        this.result = result;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public SysResult(boolean result, String data) {
        super();
        this.result = result;
        this.data = data;
    }
    public SysResult(boolean result) {
        this.result = result;
    }
    public SysResult() {
        super();
    }

}
