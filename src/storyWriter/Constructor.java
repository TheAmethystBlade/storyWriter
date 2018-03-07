package storyWriter;
import storyWriter.Actor.actor;
import storyWriter.StoryBlocks.setting;
public class Constructor {

	setting genre = new setting();
	actor mc = new actor();

	public Constructor(actor empty_a,setting empty_s){

		mc = empty_a;
		genre = empty_s;

	}

	public static void initalSettings(){

	}

	public static void main(String[] args) {
		// TODO write configrable options section, write the choice selection feild, write the compiler/exporter
			//Tag sorting and selection will be done by a subclass of the tag system - will search through the custom archive



	}

}
