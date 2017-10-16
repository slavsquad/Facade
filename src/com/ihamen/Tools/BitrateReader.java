package com.ihamen.Tools;

import com.ihamen.Codecs.Codec;
import com.ihamen.Targets.VideoFile;

/**
 * Created by stepanenko.sg on 15.10.2017.
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file with source "+ codec.getType()+" codec");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: converting file with "+ codec.getType()+" codec");
        VideoFile convertFile = new VideoFile(buffer.getName()+"."+codec.getType());
        return convertFile;
    }
}
