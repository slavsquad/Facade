package com.ihamen.Facade;

import com.ihamen.Codecs.Codec;
import com.ihamen.Codecs.CodecFactory;
import com.ihamen.Targets.VideoFile;
import com.ihamen.Tools.BitrateReader;

/**
 * Created by stepanenko.sg on 15.10.2017.
 */
public class VideoConversionFacade {
    public VideoFile convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);

        Codec destinationCodec = CodecFactory.getCodec(format);

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile result = BitrateReader.convert(buffer, destinationCodec);
        System.out.println(String.format("VideoConversionFacade: conversion source file: %s to: %s completed.",buffer,result));
        return result;
    }
}
