import java.util.Arrays;

public class FileType {
    String MusicFiles = "";
    String photoFiles = "";
    String VideoFiles = "";
    String OtherFiles = "";
    int MusicSizeSum = 0;
    int PhotoSizeSum = 0;
    int VideoSizeSum = 0;
    int OtherSizeSum = 0;
    String FinalString = "";

    public String Solution(String S) {
        String FileName[] = S.split("\\s");
        System.out.println(Arrays.toString(FileName));
        for (int i = 0; i < FileName.length - 1; i++) {
            if (FileName[i].contains("mp3") || FileName[i].contains("aac") || FileName[i].contains("flac")) {
                int size = Integer.parseInt(FileName[i + 1].replace("b", ""));
                MusicSizeSum = size + MusicSizeSum;
            } else if (FileName[i].contains("jpg") || FileName[i].contains("bmp") || FileName[i].contains("gif")) {
                int size = Integer.parseInt(FileName[i + 1].replace("b", ""));
                PhotoSizeSum = size + PhotoSizeSum;
            } else if (FileName[i].contains("mp4") || FileName[i].contains("avi") || FileName[i].contains("mkv")) {
                int size = Integer.parseInt(FileName[i + 1].replace("b", ""));
                VideoSizeSum = size + VideoSizeSum;
            } else if (FileName[i].endsWith("b")) {
                continue;
            } else {
                int size = Integer.parseInt(FileName[i + 1].replace("b", ""));
                OtherSizeSum = size + OtherSizeSum;
            }
        }
        FinalString = "Music: " + MusicSizeSum + "b" + "\n" + "Photo: " + PhotoSizeSum + "b" + "\n"
                + "Video: " + VideoSizeSum + "b" + "\n" +
                "Other: " + OtherSizeSum + "b";
        return FinalString;
    }

    public static void main(String[] args) {
        FileType t = new FileType();
        System.out.println(t.Solution("my.song.mp3 11b greatSong.flac 1000b not3.txt 5b video.mp4 200b game.exe 100b mov!e.mkv 1000b"));
    }
}
