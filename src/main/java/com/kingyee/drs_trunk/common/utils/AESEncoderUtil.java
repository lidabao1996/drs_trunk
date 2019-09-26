package com.kingyee.drs_trunk.common.utils;


import java.io.IOException;


/**
 * AES 加密解密
 *
 * @author sophia
 * @title: AESEncoderUtil
 * @projectName bsia-softexpo
 * @description: TODO
 * @date 2019/5/15 17:07
 */
public class AESEncoderUtil {

    /**
     * 编码
     *
     * @param bstr
     * @return String
     */
    public static String encode(long bstr) {
        return new sun.misc.BASE64Encoder().encode((bstr + "").getBytes());
    }

    /**
     * 解码
     *
     * @param str
     * @return string
     */
    public static String decode(String str) {

        byte[] bt = null;
        try {
            sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
            bt = decoder.decodeBuffer(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bt);
    }


    public static void main(String[] args) {


        String str1 = AESEncoderUtil.encode(155858234036100001l);


        System.out.println(str1);

        System.out.println(AESEncoderUtil.decode(str1));

    }


}
