package com.atguigu.mtimeapp.domain;

import java.util.List;

/**
 * Created by 杨勇康 on 2016/4/9 0009.
 */
public class CityInfo {

    /**
     * count : 192
     * id : 292
     * n : 上海
     * pinyinFull : Shanghai
     * pinyinShort : sh
     */

    private List<PEntity> p;

    public void setP(List<PEntity> p) {
        this.p = p;
    }

    public List<PEntity> getP() {
        return p;
    }

    public static class PEntity {
        private int count;
        private int id;
        private String n;
        private String pinyinFull;
        private String pinyinShort;

        public void setCount(int count) {
            this.count = count;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setN(String n) {
            this.n = n;
        }

        public void setPinyinFull(String pinyinFull) {
            this.pinyinFull = pinyinFull;
        }

        public void setPinyinShort(String pinyinShort) {
            this.pinyinShort = pinyinShort;
        }

        public int getCount() {
            return count;
        }

        public int getId() {
            return id;
        }

        public String getN() {
            return n;
        }

        public String getPinyinFull() {
            return pinyinFull;
        }

        public String getPinyinShort() {
            return pinyinShort;
        }
    }
}
