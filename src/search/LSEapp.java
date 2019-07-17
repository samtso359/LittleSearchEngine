package search;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LSEapp {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		LittleSearchEngine o = new LittleSearchEngine();
		//o.noiseWords.put("between", "between");
		o.makeIndex("docs.txt", "noisewords.txt");
//		o.loadKeyWords("AliceCh1.txt");
		System.out.println(o.getKeyWord("CHAPTER"));
		System.out.println(o.keywordsIndex.entrySet());
		System.out.println(o.top5search("deep", "world"));
		//System.out.println(o.getKeyWord(""));
	
		Occurrence a = new Occurrence("x", 12);
		Occurrence b = new Occurrence("x", 8);
		Occurrence c = new Occurrence("x", 7);
		Occurrence d = new Occurrence("x", 5);
		Occurrence e = new Occurrence("x", 3);
		Occurrence f = new Occurrence("x", 2);
		Occurrence g = new Occurrence("x", 6);
		ArrayList<Occurrence> temp = new ArrayList<Occurrence>();
		temp.add(a);
		temp.add(b);
		temp.add(c);
		temp.add(d);
		temp.add(e);
		temp.add(f);
		temp.add(g);
		System.out.println("result of of the mid indexes are: "+o.insertLastOccurrence(temp));
	}

}
