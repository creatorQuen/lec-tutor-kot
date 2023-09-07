package lec7.useAndLambda

import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.net.URL

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val url = "https://example.com/file.mp4"

//        BufferedInputStream(URL(url).openStream()).use {
//            File("someVideo.mp4").copyInputStreamToFile(it)
//        }

//        Streams(BufferedInputStream(URL(url).openStream()),
//            File("someVideo.mp4").outputStream()) { inputStream, outputStream ->
//            inputStream.copyTo(outputStream)
//        }

        Streams(BufferedInputStream(URL(url).openStream()),
            File("someVideo.mp4").outputStream()) { inputStream, outputStream ->
            inputStream.copyTo(outputStream)
        }.start()
    }
}

fun File.copyInputStreamToFile(inputStream: InputStream) {
    this.outputStream().use { fileOut ->
        inputStream.copyTo(fileOut)
    }
}

class Streams(private val inStream: InputStream,
                private val outStream: OutputStream,
                private val streamHandler: (InputStream, OutputStream) -> Unit) {

//    init {
//        inStream.use {
//            outStream.use {
//                streamHandler.invoke(inStream, outStream)
//            }
//        }
//    }

    fun start() = inStream.use {
        outStream.use {
            streamHandler.invoke(inStream, outStream)
        }
    }
}