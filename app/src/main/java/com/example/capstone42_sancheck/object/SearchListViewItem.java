package com.example.capstone42_sancheck.object;

public class SearchListViewItem {
    private String text1; // 산 이름
    private String text2; // 등산로 이름
    private Double text3; // 등산로 길이

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public Double getText3() { return text3; }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public void setText2(String text2) {
        if (text2.equals("null"))
            this.text2 = " ";
        else
            this.text2 = text2;
    }

    public void setText3(Double text3) { this.text3 = text3; }
}