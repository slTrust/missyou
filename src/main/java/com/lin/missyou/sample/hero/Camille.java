package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;

public class Camille implements ISkill {
    public Camille() { System.out.println("hello,Camille"); }
    public void q(){ System.out.println("Camille Q"); }
    public void w(){ System.out.println("Camille W"); }
    public void e(){ System.out.println("Camille E"); }
    public void r(){ System.out.println("Camille r"); }
}