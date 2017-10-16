package com.ihamen.Targets;

/**
 * Created by stepanenko.sg on 15.10.2017.
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name.substring(0,name.indexOf("."));
        this.codecType = name.substring(name.indexOf(".") + 1, name.length());
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCodecType(String codecType) {
        this.codecType = codecType;
    }

    @Override
    public String toString() {
        return name+"."+codecType;
    }
}
