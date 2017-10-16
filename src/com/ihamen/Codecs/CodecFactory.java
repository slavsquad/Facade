package com.ihamen.Codecs;

import com.ihamen.Targets.VideoFile;

/**
 * Created by stepanenko.sg on 15.10.2017.
 */
public class CodecFactory    {
    public static Codec extract(VideoFile videoFile){
        if (videoFile.getCodecType()=="mp4"){
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }

    public static Codec getCodec(String format){
        if (format == "mp4"){
            return new MPEG4CompressionCodec();
        }else {
            return new OggCompressionCodec();
        }

    }
}
