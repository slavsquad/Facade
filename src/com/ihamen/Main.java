package com.ihamen;

    import com.ihamen.Facade.VideoConversionFacade;
    import com.ihamen.Targets.VideoFile;

    public class Main {

        public static void main(String[] args) {
            VideoConversionFacade converter = new VideoConversionFacade();
            VideoFile mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
            // write your code here
        }
    }
