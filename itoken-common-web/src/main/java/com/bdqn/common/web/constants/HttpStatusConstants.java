package com.bdqn.common.web.constants;

public enum HttpStatusConstants {

    BAD_GATEWAY(502,"从上有服务器接到无效的响应");

    private int status;
    private String content;

    private HttpStatusConstants(int status,String content){
        this.status = status;
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
