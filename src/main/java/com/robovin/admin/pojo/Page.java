package com.robovin.admin.pojo;

import java.util.List;

/**
 * @author renzhenbin@bjgmsk.com
 * @programm MonkeyAdmin
 * @description
 * @date 2019/2/15-14:01
 **/
public class Page {
    private String name;
    private String uri;
    private String code;

    private List<Page> functions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Page> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Page> functions) {
        this.functions = functions;
    }
}
