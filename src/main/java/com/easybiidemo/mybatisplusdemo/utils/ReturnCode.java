package com.easybiidemo.mybatisplusdemo.utils;

/**
 * Created by Cody on 17/6/17.
 */
public enum ReturnCode {

    //通用错误码 1-1000
    SUCCESS(0, "成功"),
    INVALID_SIGN(1, "非法请求"),
    PARAM_TYPE_ERROR(4, "参数类型错误"),
    PARAM_ERROR(5, "参数错误"),
    REDIS_ERROR(6, "REDIS错误"),
    SMS_SEND_ERROR(7, "短信发送失败，请稍后再试"),
    QINIU_STORAGE_ERROR(8, "存储失败，请稍后再试"),
    SMS_CODE_ERROR(9, "验证码错误或失效"),
    NO_RIGHT(10, "没有权限或非法操作"),
    EMAIL_SEND_ERROR(11, "邮箱格式不正确"),
    REG_FORBIDDEN(12, "账号或设备被封"),
    DEVICE_UNIQE(13, "同一个设备只能注册一次"),
    ADD_REPEAT(14,"添加重复"),
    TELEPHONE_SEND_ERROR(15, "手机格式不正确"),


    INVALID_TOKEN(1001, "TOKEN无效"),
    TOKEN_NOT_MATCH(1002, "TOKEN不匹配"),
    USER_NOT_EXIST(1003, "用户不存在"),
    USER_PASSWORD_WRONG(1004, "用户名和密码不匹配"),
    OPERATE_NOT_SAFE(1005, "不安全的操作"),
    MOBILE_EXIST(1007, "该号码已经注册，请重新登录"),
    OLD_PASSWORD_WRONG(1008, "原密码输入错误"),
    INVALID_TIMESTAMP(1009, "错误的时间戳，请调整系统时间"),
    USER_NO_AUTHORITY(1010, "抱歉，您没有权限"),
    EXPIRED_TOKEN(1011, "TOKEN过期，请重新登录"),
    MOBILE_USER_NOT_EXIST(1012, "该手机号码没有绑定账户"),
    MOBILE_USER_HAS_EXIST(1013, "该手机号码已经绑定了其他账户"),
    FACE_1V1_FAIL(1068, "人脸认证不通过"),
    FACE_ERROR(1069, "人脸认证不通过"),
    MOBILE_EXIST_SMS(1070, "该号码已经注册过了"),
    MOBILE_USER_EXIST_SMS(1071, "该用户已经注册过了"),
    IP_CEILING(1072,"登录ip已达到上限"),
    ACCOUNTLOCKOUT(1073,"账号已被锁定"),
    TRIAL_EXPIRED(1074,"试用账号已过期"),
    CUSTOMER_EXPIRED(1075,"账号已过期"),
    REPEAT_LOGIN(1076,"重复登录"),
    REQUEST_OFTEN(1077,"请求太过频繁"),
    NOT_SUBSCRIBE_CHART_PUBLIC(1078,"用户没有关注公众号"),
    TELEPHONE_DISABLE(1079,"手机号已被禁用"),
    LOGIN_TELEPHONE_CHECK(1080,"登录手机短信校验"),
    TRIAL_THREE_LOGIN(1081,"试用账号第三次登录"), //同账号同浏览器第三次登录
    NOT_LOGIN(1082,"用户未登陆"),

    OCR_VALUE_LOSS(5000, "特征值信息缺失"),
    OCR_KEY_LOSS(5001, "关键信息缺失"),
    OCR_KEY_DUPLICATE(5002, "重复的图片"),
    OCR_KEY_CATALOG(5004, "重复的分类"),
    OCR_NO_RULE(5003, "没有找到匹配规则"),
    CONTACT_REPEAT(5004, "联系人重复"),

    MANAGER_MOBILE_NOT_EXIST(8001, "手机号没有注册"),
    MANAGER_MOBILE_HAS_EXIST(8002, "手机号已存在，不能重复添加"),
    MANAGER_MOBILE_DUPLICATE(8003, "手机号已绑定过了"),
    MANAGER_MOBILE_HAS_BINDED(8005, "您已经绑定过啦"),

    USER_NOT_ADOPT(2001, "这是一个异常分享链接"),
    USER_WRONG_ADOPT(2002, "用户已经参与过其他用户的推广了"),
    TASK_FINISHED(2003, "抱歉，该任务已经截止"),

    //json解析有问题
    JSON_SYNTAX_EXCEPTION(216101, "json格式有问题"),
    JSON_IO_EXCEPTION(216201, "json数据转换异常"),

    //交易错误码
    MONEY_NOT_ENOUGH(3001, "余额不足"),
    FACE_CHECK_ALREADY_PASSED(3002, "您已经检测通过，请勿重复检测"),
    COIN_NOT_ENOUGH(3003, "火焰数不足"),
    TO_PAID(3004, "有待支付的订单"),


    //验证码
    AUTH_CODE_NO_PASS(4001,"验证码不通过"),
    AUTH_CODE_PASS(4002,"验证码通过"),
    AUTH_CODE_FAILURE(4003,"验证码已失效"),

    // 首次登录
    FAST_LOGIN(4003,"首次登录请先修改密码"),
    PROMPT_APPROVE(4004,"询价需要审批");
    private int code;

    private String desc;

    ReturnCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "[" + this.code + "]" + this.desc;
    }

    //    public static void main(String[] a){
    //        System.out.println();
    //        System.out.println();
    //        System.out.println("-  "+"ReturnCode"+"返回值类型");
    //        System.out.println();
    //        System.out.println("|数值|注释|");
    //        System.out.println("|:----|------ |");
    //        for (ReturnCode t : ReturnCode.values()) {
    //            System.out.println("|"+t.getCode()+"  |"+t.getDesc()+"|");
    //        }
    //        System.out.println();
    //        System.out.println("------------");
    //        System.out.println();
    //        System.out.println();
    //    }

}
