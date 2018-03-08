package storyWriter.StoryBlocks;
import java.util.*;
import java.io.*;
import java.nio.*;
public class setting {

  //all StoryBlock files first tag will be the setting
  ArrayList<String> tags = new ArrayList<String>();
  String filename = "setting.null";

  public setting(){

  }

  public setting(String fileName){
    filename = fileName;
    Path pathToFile = Paths.get("/home/joe/foo/bar/myFile.txt");
    File.createDirectories(pathToFile.getParent());
    File.createFile(pathToFile);
    String tag = "00";
    if(tag!="0"){
      System.out.println("Please Add your tags(One at a time, submit a 0 to finalise)")
    }
  }

  public ArrayList<String> gettags(){
    return tags;
  }

	public static void main(String[] args) {
		// TODO write the aspects of the setting and use the writer to make a systemfile that holds other story blocks



	}

}
