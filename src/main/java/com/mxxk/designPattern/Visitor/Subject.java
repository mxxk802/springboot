package com.mxxk.designPattern.Visitor;

public interface Subject {

    public void accept(Visitor visitor);
    public String getSubject();


}
