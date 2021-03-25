/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern;

import jdk.nashorn.internal.ir.IdentNode;

/**
 * @author Administrator
 * @date 2021/3/14 20:44
 * Project Name: java-design-pattern
 */
public abstract class ICourse {

    private INote Note;
    private IVideo video;

    public INote getNote() {
        return Note;
    }

    public void setNote(INote note) {
        Note = note;
    }

    public IVideo getVideo() {
        return video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }

    public abstract void  record();
}
