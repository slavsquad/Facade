package com.ihamen.Codecs;

/**
 * Created by stepanenko.sg on 15.10.2017.
 */
public class MPEG4CompressionCodec implements Codec {
    private String type = "mp4";

    @Override
    public String getType() {
        return type;
    }
}
