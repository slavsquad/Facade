package com.ihamen.Codecs;

/**
 * Created by stepanenko.sg on 15.10.2017.
 */
public class OggCompressionCodec implements Codec {
    public String type = "ogg";

    @Override
    public String getType() {
        return type;
    }
}
