package lec8;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadFile extends Thread {

    private final String url;
    private final String fileName;
    private final ProgressCallback callback;

    public DownloadFile(String url, String fileName, ProgressCallback callback) {
        this.url = url;
        this.fileName = fileName;
        this.callback = callback;
    }

    @Override
    public void run() {
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            callback.finishedSuccessfully();
        } catch (IOException e) {
            callback.failed(e.getMessage());
        }
    }

    interface ProgressCallback {

        void failed(String message);

        void finishedSuccessfully();
    }
}
