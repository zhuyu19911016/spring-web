package com.zypcy.expend.util;

/**
 * 前后台数据传输dto
 */
public class MvcDataDto {

    public static final String Success = "success";
    public static final String Fail = "fail";

    private String resultCode;
    private String resultMessage;
    private Object resultObj;
    private Object param;
    private Page page;

    /**
     * 获取数据传输默认实例
     *
     * @return
     */
    public static MvcDataDto getInstance() {
        MvcDataDto dataDto = new MvcDataDto();
        dataDto.setResultCode(MvcDataDto.Fail);
        return dataDto;
    }

    //私有构造函数，此类不允许手动实例化，需要调用getInstance()获取实例
    private MvcDataDto() {
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public void setResultObj(Object resultObj) {
        this.resultObj = resultObj;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

}
