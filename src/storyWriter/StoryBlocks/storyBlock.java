package storyWriter.StoryBlocks;
import java.util.*;
public class storyBlock {

  //all storyBlock files first tag will be the setting
  ArrayList<String> tags = new ArrayList<String>();
  String filename = "setting.null";
  ArrayList<String> modifiers = new ArrayList<String>();

  public storyBlock(){

  }

  public storyBlock(String fileName,setting local){
    filename = fileName;
    tags.add(local.gettags().get(0));
  }

	public static void main(String[] args) {
		// TODO write the aspects of the setting and use the writer to make a systemfile that holds other story blocks



	}

}
