/* Copyright © 2021 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package com.xinzhe.utils;

import java.util.Random;
import java.util.UUID;

/**
 * TODO description
 *
 * @author xzheng
 * @since 1.0
 */
public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static int getView(){
        return new Random().nextInt((int)1e8);
    }
}