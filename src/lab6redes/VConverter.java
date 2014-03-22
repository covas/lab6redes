package lab6redes;

import java.io.IOException;

public class VConverter {

	public static void converFile ( String start_url , String end_url ) throws IOException{ 
		Runtime.getRuntime().exec("cmd /c ffmpeg.exe -i \"" + start_url + "\" -y \"" + end_url+ "\"");
	}
	
	public static void main(String[] args) throws IOException {
//		 converFile ("C:/Users/Andrea/Desktop/movie.mp4" , "C:/Users/Andrea/Desktop/movie.mp4.wmv"  ) ;
		 converFile ("video/movie.mp4" , "video/movie.mp4.wmv"  ) ;
//		 System.out.println( "end ");
	}
}