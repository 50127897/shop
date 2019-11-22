package com.shop.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016100100640713";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCK18M/mIdqrkVocdogz3tCD7f9mnJcRVrbGXAEEKdNGFxlNmKAlo7Zx9cXKfR5Fs4xNg1uj5QS3RpWrapYiJwV5PfWV+TOXWWk2YIHA88r1yrBqwrrDypqWSS7+txaW4iqdNL1lUVhq7/QxF0hLV2yuFVtXY6dd6JMRsxki/GbfHmsMbv5QHkKGpNJefj9cURxijvE4jxodca2IfD+2A7Xp5Fu8GUT9o1xIuQQo2/ViUYKO482kYw8sIeUDS1b26QlzqMJBgGUbmlTa/2QHbnOsitKGduAwqNrKQRbM4pWAuKVS8IY5p0zHwY8Lk0nEiAboYF6vSEMNR8pNXWOUM6bAgMBAAECggEASCny6ogNwk4H90xNsoYEq4Zd/CsdS4YkvgJPrV02h6SkyVpmAi2+28S5r+l3jsRisUNF4fQwY0mWWfzzsAZ5EgwrILYYT4ZNwUvoAFtjf4bbS0Pqbdg5FIN2y1mM1E4FD4ue5lQKdsR88zZMrWTV8YFLrYdWC9RVf83AiHYQQt7Ap2qeiRao5kQWB3eogk8wxXH4CoZ2rOl6X3i5i2g0M41ASXo9ltYqRCHRsj0hHHbJN+mR/5i5O6+r9KRrka49DKJzvesUtI2cwnG9UhKS7g3mGRrAVfTX7SpHjgoc9z+ib2H7Ugnk0/qIo7tsxfwlkvmP9WsWxfqhMITLcVW3IQKBgQC9EeaWPWfHUuWu4OxqjSHg7qdTk4r5Qevyx0RC8JVL24E+YUx5ktjxUU4832u68v4aV5fEd8w4Un8S9z1Xcu9FPiVUNbQPQaDH7SDodt/saHWAjae3FeDEM1H8+6n72mbp7KBn9PPb94ODSjC6SiT8EUMCQ/ywNlyL6ZY4evogsQKBgQC7/iCQpM1xkGOk0r/Gag86eNFLaJGBfRnBOjcovrnuHkBnhR4XV3OfsxDgP9gTsDaUKlNU9CfILSJjwMFvL/vTGGVAmnd/LIZEwXmVHmmxWMsGLVCHmgDItYzJEUIulSCZd7PsB+gH/fpOpJxP3etB+UkQMfyOQgkxDNFE+xmXCwKBgHl3nqS3Ho03/Me1SS3LLhDMQkO3bnlkmKmIy5oV5lSt2QKyj+crKKUgjxscjqG0qvtReveF33XvyiPtI0OjW4Uov+Kx/dQvXZQUDChM9t9y3MqSN0WwkI58Shg1tqdPUP7IPuWKwYB4K82VRGjqaYhnrp0uAJFU23AnyZLPrxKBAoGBAKOyTtME3mw0CcBdT2bLtcT5rW3XeVRjBckvExbktWx2ZSh/TsuOd/0o5NoQXewO9gegr317OSTiwF5SW12hT8vqI0jU+JcBw00dl+xUVj56jhcr4EKjxGkBRb1TzOhZLNDV3hL6c356FrriNcaJ/DAvjQKQNFX/hJd0jMlfSVIvAoGAWDBjvXcjievTS7EkD/bGp11H91z8/6uHqRilI7vOKPK5BTQNHhTFICbRKsU4lin+/9Fflckxb9XHwXlrw7J5tJu02D9z8WyVuTlF+l9P/+3rNE0ac+YwO++a4dJoxK4B0nsjhgn8Uxxl9syt1rQAz8ir4IHboSrZA8/Mqov1uMs=";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvAxzb0rTTaHArV7scXKvKcKJUUltWepbTO78UiC28jBUw462MYonvA+4Q3jPkOfJsuCB9VlqNgPgBHWkFwhSkizd22cSVLbiouH7oV/1CRth+8/xZBp+jFoC6g3SAT4Tgfc2yh47QZyKiGV6nW9WKWCX8tKS4nVLEqsnIQqc/KgmTGb5W1usGlcSPCBMx/sH3HSPspDd67XZULmGHUMOY1WXQSDF5inhK+HcbeKQ7hCCK5GfaQ/PzgAfgkA00/MZaWWefYttlm3nDlONzJNagbfWDxEEl+Cx2FKjBSeHyyAl2yF8M23nF++jFOHvinpGQ07iHDN8bsKLO74ApqtBKQIDAQAB";
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://gpj.hk1.tunnelfrp.cc/shop-controller/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/shop-controller/Order/updateOrder";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";/*"https://openapi.alipay.com/gateway.do"*/;
	
	// 支付宝网关
	public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

