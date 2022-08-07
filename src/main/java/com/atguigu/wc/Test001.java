package com.atguigu.wc;

import org.apache.commons.math3.analysis.function.Floor;
import org.apache.flink.api.common.eventtime.WatermarkOutput;
import org.apache.flink.api.java.tuple.Tuple2;

import java.util.ArrayList;
import java.util.Map;


public class Test001 {
    public static void main(String[] args) {

        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20,90};
        final ArrayList<Object> al = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < args.length ; j++) {
              int num= array[i];
            }

        }


    }

}
